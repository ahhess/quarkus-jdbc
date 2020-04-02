package org.acme.datasource;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/projekttyp")
public class ProjekttypResource {

    @Inject
    ProjekttypDB db;

    @Path("/create")
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

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList<Projekttyp> findAll() {
        try {
            return db.findProjekttypen();
        } catch (SQLException e) {
            System.err.println(e);
            return null;
        }
    }

    @Path("/{id}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Projekttyp find(@PathParam("id") int id ) {
        try {
            return db.findProjekttyp(id);
        } catch (SQLException e) {
            System.err.println(e);
            return null;
        }
    }

}