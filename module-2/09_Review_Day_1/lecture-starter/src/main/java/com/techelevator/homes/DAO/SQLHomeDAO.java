package com.techelevator.homes.DAO;
import com.techelevator.homes.model.Address;
import com.techelevator.homes.model.Home;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;

public class SQLHomeDAO implements HomeDAO {
    private JdbcTemplate jdbcTemplate;

    public SQLHomeDAO(DataSource dataSource){
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public Home addHome(Home homeToAdd){

        Address address = homeToAdd.getAddress();

        String sql = "INSERT into address(addressLine, city, state, zip) " +
                "VALUES(?,?,?,?) RETURNING addressId";
        Integer addressID = jdbcTemplate.queryForObject(sql,Integer.class,
                address.getAddressLine(),
                address.getCity(),
                address.getState(),
                address.getZip());
        sql = "INSERT into home(mlsNumber, addressId, numberOfBathrooms, numberOfBedrooms, price, shortDescription)" +
                "VALUES(?,?,?,?,?,?) RETURNING homeId";

        Integer homeID =  jdbcTemplate.queryForObject(sql,Integer.class,
                homeToAdd.getMlsNumber(),
                addressID,
                homeToAdd.getNumberOfBathrooms(),
                homeToAdd.getNumberOfBedrooms(),
                homeToAdd.getPrice(),
                homeToAdd.getShortDescription());

        homeToAdd.setHomeId(homeID);
        return homeToAdd;

    }
}
