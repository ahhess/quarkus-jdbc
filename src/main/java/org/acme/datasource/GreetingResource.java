package org.acme.datasource;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public class GreetingResource {

    @Inject
    DB db;

    @Path("/hello")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "hello";
    }

    @Path("/db/create")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String create() {
        try {
            db.createTable();
            db.insert();
            return "ok.";
        } catch (SQLException e) {
            return e.toString();
        }
    }

    @Path("/db/insert")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String insert() {
        try {
            db.insert();
            return "ok.";
        } catch (SQLException e) {
            return e.toString();
        }
    }

    @Path("/db/findJson")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Tab[] findAllJSON() {
        try {
            ArrayList<Tab> list = db.findAll();
            Tab[] tabs = new Tab[list.size()];
            return list.toArray(tabs);
        } catch (SQLException e) {
            return null;
        }
    }

    @Path("/db/findJson2")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList<Tab> findAllJSON2() {
        try {
            return db.findAll();
        } catch (SQLException e) {
            return null;
        }
    }

    @Path("/db/find")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String findAll() {
        try { 
            String s = "";
            for(Tab t : db.findAll()) {
                System.out.println(t);
                s += t.toString();
            }        
            return s;
        } catch (SQLException e) {
            return e.toString();
        }
    }
}