package com.istec.ipc.rest;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Logger;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.istec.ipc.entities.Kostenstelle;
import com.istec.ipc.sql.KostenstelleDB;

@Path("/kst")
public class KostenstelleResource {
    private static Logger logger = Logger.getLogger(KostenstelleResource.class.getName());

    @Inject
    KostenstelleDB db;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList<Kostenstelle> findAll() {
        try {
            ArrayList<Kostenstelle> list = db.getAlleKostenstellen();
            logger.info("Kostenstellen: " + list);
            return list;
        } catch (SQLException e) {
            logger.severe(e.toString());
            return null;
        }
    }
}