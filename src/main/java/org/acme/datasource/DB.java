package org.acme.datasource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;

import io.agroal.api.AgroalDataSource;

/**
 * DB
 */
@Dependent
public class DB {

    @Inject
    AgroalDataSource dataSource;

    public void createTable() throws SQLException {
        Connection connection = dataSource.getConnection();
        Statement statement = connection.createStatement();
        String sql = "create table tab1 (a int primary key, b varchar(50))";
        System.out.println(sql);
        statement.execute(sql);
        statement.close();
        connection.close();
    }

    public void insert() throws SQLException {
        Connection connection = dataSource.getConnection();
        Statement statement = connection.createStatement();
        System.out.println("insert into tab1 (a, b) values (11, 'Elf')");
        statement.execute("insert into tab1 (a, b) values (11, 'Elf')");
        statement.execute("insert into tab1 (a, b) values (1, 'Auto')");
        statement.execute("insert into tab1 (a, b) values (9, 'Bike')");
        statement.close();
        connection.close();
    }
    
    public ArrayList<Tab> findAll() throws SQLException {
        ArrayList<Tab> tabs = new ArrayList<>(); 
        Connection connection = dataSource.getConnection();
        Statement statement = connection.createStatement();
        String sql = "select a, b from tab1";
        System.out.println(sql);
        ResultSet rs = statement.executeQuery(sql);
        while (rs.next()) {
            // tm.put(rs.getInt("a"), rs.getString("b"));
            Tab t = new Tab();
            t.setA(rs.getInt("a"));
            t.setB(rs.getString("b"));
            tabs.add(t);
        }
        statement.close();
        connection.close();
        return tabs;
    }
}