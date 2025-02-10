package hu.odin;

import java.util.List;
import java.util.UUID;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/laundries")
public class LaundryResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Laundry> getLaundries() {
        return Laundry.findAll().list();
    }

    @GET
    @Path("{id:\\d+}")
    @Produces(MediaType.APPLICATION_JSON)
    public Laundry getById(@PathParam("id") UUID id){
        return Laundry.findById(id);
    }
    /*
    @POST
    @Transactional
    @Produces(MediaType.APPLICATION_JSON)
    public void
    */
    }
