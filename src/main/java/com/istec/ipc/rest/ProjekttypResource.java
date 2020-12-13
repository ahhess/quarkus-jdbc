package com.istec.ipc.rest;

import java.sql.SQLException;
import java.util.Vector;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.istec.ipc.projekte.Projekttyp;
import com.istec.ipc.projekte.ProjekttypDB;

@Path("/projekttyp")
public class ProjekttypResource {

    @Inject
    ProjekttypDB db;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Vector<Projekttyp> findAll() {
        try {
            Vector<Projekttyp> list = db.getAlleTypen();
            System.out.println("projekttypen: "+list);
            return list;
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
            Vector<Projekttyp> list = db.getAlleTypen();
            for(Projekttyp p: list){
                if (p.getProjekttypID() == id) {
                    System.out.println(p);
                    return p;
                }
            }
        } catch (SQLException e) {
            System.err.println(e);
        }
        return null;
    }

}