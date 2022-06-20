# DAO testing exercises

Designers of the `EmployeeProjects` database are enhancing it with timesheet tracking. They've developed a new DAO to handle creating, reading, updating, and deleting records from the `timesheet` table. For this exercise, you'll be responsible for writing DAO tests.

## Learning objectives

After completing this exercise, you'll understand:

* How to write DAO tests.
* How to use tests to find bugs in a DAO.

## Evaluation criteria and functional requirements

The instruction team evaluates your code for this assignment based on the following criteria:

* The project must not have any build errors.
* Code is clean, concise, and readable.

## Getting started

1. You'll use the same `EmployeeProjects` database you used for the DAO exercises.
2. Import the DAO Testing exercises project into IntelliJ.

## Step One: Explore starting code

Before you begin, review the provided classes in the `model` and `dao` packages.

Also, familiarize yourself with the provided test classes and the `test-data.sql` file.

## Step Two: Implement the `JdbcTimesheetDaoTests` methods

In the nine test methods, replace the `Assert.fail()` with the code necessary to implement the test described by the method name. You can refer to the comments in the `TimesheetDao` interface for descriptions of what each DAO method does.

Use this unit's reading and the DAO tests from the previous DAO exercises as examples to reference while working. Constant `Timesheet` objects have been provided that you can use in your tests.

When fully implemented, five of the tests pass, and four continue to fail due to bugs in `JdbcTimesheetDao`.

