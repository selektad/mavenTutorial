package com.criticalsoftware.tutorial.resources;

import com.criticalsoftware.tutorial.pojo.SumPOJO;
import com.criticalsoftware.tutorial.services.SumService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/rest")
public class SumResource {


    @GET
    @Path("/hello")
    @Produces(MediaType.TEXT_PLAIN)
    public String helloWorld(){
        return "Hello World!";
    }

    @POST
    /*@Path("/{numA}/{numB}")*/
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Integer getSumInJson(SumPOJO sumpojo/*, @PathParam("numA") Integer numA, @PathParam("numB") Integer numB /*Integer numA, Integer numB*/){
        //SumPOJO sumpojo = new SumPOJO(numA, numB);
        //sumpojo.setNumA(numA);
        //sumpojo.setNumB(numB);



        Integer result = SumService.sum(sumpojo);
        return result;
    }

    /*@POST
    @Path("/post")
    @Consumes(MediaType.APPLICATION_JSON)*/



}
