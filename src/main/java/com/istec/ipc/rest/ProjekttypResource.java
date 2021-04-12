package com.istec.ipc.rest;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Logger;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.istec.ipc.entities.Projekttyp;
import com.istec.ipc.sql.ProjekttypDB;

@Path("/projekttyp")
public class ProjekttypResource {
    private static Logger logger = Logger.getLogger(ProjekttypResource.class.getName());

    @Inject
    ProjekttypDB db;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList<Projekttyp> findAll() {
        try {
            ArrayList<Projekttyp> list = db.getAlleTypen();
            logger.info("projekttypen: " + list);
            return list;
        } catch (SQLException e) {
            logger.severe(e.toString());
            return null;
        }
    }

    @Path("/{id}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Projekttyp find(@PathParam("id") int id) {
        try {
            Projekttyp p = db.getProjekttyp(id);
            if (p!=null) {
                logger.info(p.toString());
                return p;
            }
        } catch (SQLException e) {
            logger.severe(e.toString());
        }
        return new Projekttyp();
    }
}