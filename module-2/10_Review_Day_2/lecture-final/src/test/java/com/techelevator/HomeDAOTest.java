package com.techelevator;

import com.techelevator.homes.dao.HomeDAO;
import com.techelevator.homes.dao.JDBCHomeDAO;
import com.techelevator.homes.exception.HomeNotFoundException;
import com.techelevator.homes.model.Address;
import com.techelevator.homes.model.Home;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.util.List;

public class HomeDAOTest extends DAOIntegrationTest{

    private JdbcTemplate jdbcTemplate;
    private HomeDAO homeDAO;

    public HomeDAOTest() {
        jdbcTemplate = new JdbcTemplate(getDataSource());
    }


    @Before
    public void setUp() {
        homeDAO = new JDBCHomeDAO(getDataSource());
    }

    @Test
    public void test_retrieveHomeByMLS() {

         //arrange  - insert test data into the db
         String mls = addHome();

        // act - call the method we want to test
        try {
            Home foundHome = homeDAO.retrieveHomeByMLSId(mls);
            Assert.assertEquals("addressLine1Val", foundHome.getAddress().getAddressLine());
            Assert.assertEquals(mls, foundHome.getMlsNumber());

        } catch (HomeNotFoundException e) {
            Assert.fail();
        }

    }

    @Test
    public void test_retrieveHomesForSale() {

        String sql = "SELECT count(*) FROM home";

        Integer count = jdbcTemplate.queryForObject(sql, Integer.class);

        // add two test homes to database
        String mls1 = addHome();
        String mls2 = addHome();

        count = jdbcTemplate.queryForObject(sql, Integer.class);

        // act
        List<Home> homeList = homeDAO.retrieveHomesForSale();
        Assert.assertEquals(count.intValue(), homeList.size());

        Home homeToCheck = homeList.get(homeList.size() - 1);

        Assert.assertEquals(mls2, homeToCheck.getMlsNumber());
        //go through and check each value
        Assert.assertEquals("shortDescValue", homeToCheck.getShortDescription());


    }


    @Test
    public void test_DeleteHome() {

        String mls = addHome();

        try {
            homeDAO.deleteHome(mls);

            SqlRowSet results = jdbcTemplate.queryForRowSet("SELECT * FROM home WHERE mlsnumber = ?", mls);

           // Assert.assertFalse(results.next());

            if (results.next()) {
                Assert.fail();
            }

        } catch (HomeNotFoundException e) {
            Assert.fail();
        }


    }

    @Test
    public void test_AddHome() {

        //Arrange
        Address address = new Address();
        address.setAddressLine("123 Oak Street");
        address.setCity("Columbus");
        address.setState("Ohio");
        address.setZip(43035);

        Home hometoAdd = new Home();
        hometoAdd.setAddress(address);
        hometoAdd.setMlsNumber("ZZZ");
        hometoAdd.setNumberOfBathrooms(4.0);
        hometoAdd.setNumberOfBedrooms(4.0);
        hometoAdd.setPrice(new BigDecimal(100));
        hometoAdd.setShortDescription("Description");

        //act
        Home addedHome = homeDAO.addHome(hometoAdd);

        if (addedHome.getHomeId() < 1) {
            Assert.fail();
        }

        Assert.assertEquals("123 Oak Street", addedHome.getAddress().getAddressLine());
        Assert.assertEquals("ZZZ", addedHome.getMlsNumber());






    }





    private String addHome() {

        //insert dummy home into the database

        String addressSQL = "INSERT INTO address(addressLine, city, state, zip) " +
                "VALUES( 'addressLine1Val', 'cityVal', 'stateVal', 30001) RETURNING addressid";

        Integer addressId = jdbcTemplate.queryForObject(addressSQL, Integer.class);

        String randomMLS = randomMLSId();

        String homeSQL = "INSERT INTO home (mlsnumber, addressid, numberofbathrooms, numberofbedrooms, price, shortdescription) " +
                "VALUES('" + randomMLS + "',?, 4,3,1000,'shortDescValue') RETURNING homeid";

        Integer id = jdbcTemplate.queryForObject(homeSQL, Integer.class, addressId );

        //String homeSQL = "INSERT INTO home (mlsnumber, addressid, numberofbathrooms, numberofbedrooms, price, shortdescription) " +
        //        "VALUES('" + randomMLS + "',?, 4,3,1000,'shortDescValue') ";
        //jdbcTemplate.update(homeSQL, addressId);

        return randomMLS;

    }

    private String randomMLSId() {

        String random = "MLS:" + (int) ((Math.random()) * 10000 );
        System.out.println(random);
        return random;
    }


}
