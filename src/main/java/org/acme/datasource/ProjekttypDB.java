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
public class ProjekttypDB {

    @Inject
    AgroalDataSource dataSource;

    public void createTable() throws SQLException {
        Connection connection = dataSource.getConnection();
        Statement statement = connection.createStatement();
        String sql = "create table Projekttyp (projekttypID int primary key, projekttyp varchar(5), bezeichnung varchar(50))";
        System.out.println(sql);
        statement.execute(sql);
        statement.close();
        connection.close();
    }

    public void insert() throws SQLException {
        Connection connection = dataSource.getConnection();
        Statement statement = connection.createStatement();
        System.out.println("insert into ....");
        statement.execute("insert into Projekttyp (projekttypID, projekttyp, bezeichnung) values (1, 'S', 'System')");
        statement.execute("insert into Projekttyp (projekttypID, projekttyp, bezeichnung) values (2, 'I', 'Intern')");
        statement.execute("insert into Projekttyp (projekttypID, projekttyp, bezeichnung) values (3, 'A', 'Aufwand')");
        statement
                .execute("insert into Projekttyp (projekttypID, projekttyp, bezeichnung) values (4, 'F', 'Festpreis')");
        statement.close();
        connection.close();
    }

    // public ArrayList<Tab> findAll() throws SQLException {
    // ArrayList<Tab> tabs = new ArrayList<>();
    // Connection connection = dataSource.getConnection();
    // Statement statement = connection.createStatement();
    // String sql = "select a, b from tab1";
    // System.out.println(sql);
    // ResultSet rs = statement.executeQuery(sql);
    // while (rs.next()) {
    // Tab t = new Tab();
    // t.setA(rs.getInt("a"));
    // t.setB(rs.getString("b"));
    // tabs.add(t);
    // }
    // statement.close();
    // connection.close();
    // return tabs;
    // }

    public ArrayList<Projekttyp> findProjekttypen() throws SQLException {
        ArrayList<Projekttyp> list = new ArrayList<>();
        Connection connection = dataSource.getConnection();
        Statement statement = connection.createStatement();
        String sql = "SELECT projekttypID, projekttyp, bezeichnung FROM Projekttyp ORDER BY Projekttyp";
        System.out.println(sql);
        ResultSet rs = statement.executeQuery(sql);
        while (rs.next()) {
            Projekttyp t = new Projekttyp();
            t.setProjekttypID(rs.getInt("projekttypID"));
            t.setProjekttyp(rs.getString("projekttyp"));
            t.setProjekttypBezeichnung(rs.getString("bezeichnung"));
            list.add(t);
            System.out.println(t);
        }
        rs.close();
        statement.close();
        connection.close();
        return list;
    }

    public Projekttyp findProjekttyp(int id) throws SQLException {
        Connection connection = dataSource.getConnection();
        Statement statement = connection.createStatement();
        String sql = "SELECT projekttypID, projekttyp, bezeichnung FROM Projekttyp where ProjekttypID = " + id;
        System.out.println(sql);
        Projekttyp t = null;
        ResultSet rs = statement.executeQuery(sql);
        if (rs.next()) {
            t = new Projekttyp();
            t.setProjekttypID(rs.getInt("projekttypID"));
            t.setProjekttyp(rs.getString("projekttyp"));
            t.setProjekttypBezeichnung(rs.getString("bezeichnung"));
            System.out.println(t);
        }
        rs.close();
        statement.close();
        connection.close();
        return t;
    }

}
