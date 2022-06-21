package com.techelevator.projects.dao;

import com.techelevator.projects.model.Timesheet;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.sql.Time;
import java.time.LocalDate;
import java.util.List;

public class JdbcTimesheetDaoTests extends BaseDaoTests {

    private final Timesheet TIMESHEET_1 = new Timesheet(1, 1, 1,
            LocalDate.parse("2021-01-01"), 1.0, true, "Timesheet 1");
    private final Timesheet TIMESHEET_2 = new Timesheet(2, 1, 1,
            LocalDate.parse("2021-01-02"), 1.5, true, "Timesheet 2");
    private final Timesheet TIMESHEET_3 = new Timesheet(3, 2, 1,
            LocalDate.parse("2021-01-01"), 0.25, true, "Timesheet 3");
    private final Timesheet TIMESHEET_4 = new Timesheet(4, 2, 2,
            LocalDate.parse("2021-02-01"), 2.0, false, "Timesheet 4");
    
    private JdbcTimesheetDao sut;

    private Timesheet testSheet;



    @Before
    public void setup() {
        sut = new JdbcTimesheetDao(dataSource);
        testSheet = new Timesheet(5, 2, 2,
                LocalDate.parse("2099-09-09"), 99.9, false, "Timesheet 9");
    }

    @Test
    public void getTimesheet_returns_correct_timesheet_for_id() {
        Timesheet timesheet = sut.getTimesheet(1);
        assertTimesheetsMatch(TIMESHEET_1,timesheet);

        timesheet = sut.getTimesheet(2);
        assertTimesheetsMatch(TIMESHEET_2,timesheet);
    }

    @Test
    public void getTimesheet_returns_null_when_id_not_found() {
        Timesheet timesheet = sut.getTimesheet(42);
        Assert.assertNull(timesheet);
    }

    @Test
    public void getTimesheetsByEmployeeId_returns_list_of_all_timesheets_for_employee() {

       List<Timesheet> timesheets1 = sut.getTimesheetsByEmployeeId(1);
       Assert.assertEquals(2, timesheets1.size());
       assertTimesheetsMatch(TIMESHEET_1,timesheets1.get(0));
       assertTimesheetsMatch(TIMESHEET_2,timesheets1.get(1));

        List<Timesheet> timesheets2 = sut.getTimesheetsByEmployeeId(2);
        Assert.assertEquals(2, timesheets2.size());
        assertTimesheetsMatch(TIMESHEET_3,timesheets2.get(0));
        assertTimesheetsMatch(TIMESHEET_4,timesheets2.get(1));

    }

    @Test
    public void getTimesheetsByProjectId_returns_list_of_all_timesheets_for_project() {

        List<Timesheet> timesheets1 = sut.getTimesheetsByProjectId(1);
        Assert.assertEquals(3, timesheets1.size());
        assertTimesheetsMatch(TIMESHEET_1,timesheets1.get(0));
        assertTimesheetsMatch(TIMESHEET_2,timesheets1.get(1));
        assertTimesheetsMatch(TIMESHEET_3,timesheets1.get(2));

        List<Timesheet> timesheets2 = sut.getTimesheetsByProjectId(2);
        Assert.assertEquals(1, timesheets1.size());
        assertTimesheetsMatch(TIMESHEET_4,timesheets1.get(0));


    }

    @Test
    public void createTimesheet_returns_timesheet_with_id_and_expected_values() {


        Timesheet createdTimesheet = sut.createTimesheet(testSheet);
        Integer newId = createdTimesheet.getTimesheetId();
        Assert.assertTrue(newId > 0);

        createdTimesheet.setTimesheetId(newId);
        assertTimesheetsMatch(testSheet,createdTimesheet);



    }

    @Test
    public void created_timesheet_has_expected_values_when_retrieved() {

        Timesheet createdTimesheet = sut.createTimesheet(testSheet);

        Integer newId = createdTimesheet.getTimesheetId();
        Timesheet retrievedTimesheet = sut.getTimesheet(newId);
        assertTimesheetsMatch(createdTimesheet,retrievedTimesheet);

    }

    @Test
    public void updated_timesheet_has_expected_values_when_retrieved() {
        Timesheet timesheetToUpdate = sut.getTimesheet(1);
        timesheetToUpdate.setBillable(false);
        timesheetToUpdate.setDescription("Updated");
        timesheetToUpdate.setEmployeeId(2);
        timesheetToUpdate.setHoursWorked(99.9);
        timesheetToUpdate.setProjectId(2);

        sut.updateTimesheet(timesheetToUpdate);

        Timesheet retrievedTimesheet = sut.getTimesheet(1);
        assertTimesheetsMatch(timesheetToUpdate,retrievedTimesheet);



    }

    @Test
    public void deleted_timesheet_cant_be_retrieved() {



        sut.deleteTimesheet(2);

        Timesheet retrievedTimesheet = sut.getTimesheet(2);
        Assert.assertNull(retrievedTimesheet);
        /*
        List<Timesheet> timesheets = sut.getTimesheetsByProjectId(1);
        Assert.assertEquals(2,timesheets.size());
        assertTimesheetsMatch(TIMESHEET_3,timesheets.get(2));

        Could implement this once TimesheetsbyProjectId is fixed

         */

    }

    @Test
    public void getBillableHours_returns_correct_total() {

       double billableHours = sut.getBillableHours(2,2);
       Assert.assertEquals(0,billableHours,0.1);




        Assert.fail();
    }

    private void assertTimesheetsMatch(Timesheet expected, Timesheet actual) {
        Assert.assertEquals(expected.getTimesheetId(), actual.getTimesheetId());
        Assert.assertEquals(expected.getEmployeeId(), actual.getEmployeeId());
        Assert.assertEquals(expected.getProjectId(), actual.getProjectId());
        Assert.assertEquals(expected.getDateWorked(), actual.getDateWorked());
        Assert.assertEquals(expected.getHoursWorked(), actual.getHoursWorked(), 0.001);
        Assert.assertEquals(expected.isBillable(), actual.isBillable());
        Assert.assertEquals(expected.getDescription(), actual.getDescription());
    }

}
