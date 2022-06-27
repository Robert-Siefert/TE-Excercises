package com.techelevator;

import com.techelevator.homes.dao.HomeDAO;
import com.techelevator.homes.dao.JDBCHomeDAO;
import com.techelevator.homes.model.Home;
import org.junit.Before;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;

import java.nio.charset.Charset;
import java.util.List;
import java.util.Random;

public class HomeDAOTest extends DAOIntegrationTest{

    private JdbcTemplate jdbcTemplate;
    private HomeDAO homeDAO;
    public HomeDAOTest(){
        jdbcTemplate = new JdbcTemplate(getDataSource());
    }
    @Before
    public void setup(){
        homeDAO = new JDBCHomeDAO(getDataSource());

    }

    @Test
    public void randomTest(){
        List<Home> homeList;
    }


    private String addHome(){
        //insert a dummy home into DB

        String sql = " ";

        //Integer addressId = jdbcTemplate.queryForObject(sql,Integer.class);
        return sql;
    }



}
