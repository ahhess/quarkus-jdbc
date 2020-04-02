package org.acme.datasource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public class GreetingResource {

    // @Inject
    // DB db;

    @Path("/hello")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hallihallo!";
    }

    // @Path("/db/create")
    // @GET
    // @Produces(MediaType.TEXT_PLAIN)
    // public String create() {
    //     try {
    //         db.createTable();
    //         db.insert();
    //         return "ok.";
    //     } catch (SQLException e) {
    //         return e.toString();
    //     }
    // }

    // @Path("/db/insert")
    // @GET
    // @Produces(MediaType.TEXT_PLAIN)
    // public String insert() {
    //     try {
    //         db.insert();
    //         return "ok.";
    //     } catch (SQLException e) {
    //         return e.toString();
    //     }
    // }

    // @Path("/db/find")
    // @GET
    // @Produces(MediaType.APPLICATION_JSON)
    // public ArrayList<Tab> findAllJSON2() {
    //     try {
    //         return db.findAll();
    //     } catch (SQLException e) {
    //         return null;
    //     }
    // }
}