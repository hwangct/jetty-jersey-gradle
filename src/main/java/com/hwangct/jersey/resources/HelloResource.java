package com.hwangct.jersey.resources;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class HelloResource {

    @GET
    @Path("/{param}")
    public String hello(@PathParam("param") String name) {
        return name;
    }

}