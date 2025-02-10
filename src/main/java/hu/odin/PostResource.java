package hu.odin;

import java.util.Collection;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/posts")
public class PostResource {
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<Post> getAll() {
        return Post.listAll();
    }

    @GET
    @Path("{id:\\d+}")
    @Produces(MediaType.APPLICATION_JSON)
    public Post getById(Long id){
        return Post.findById(id);
    }

    /*
    @POST
    @Transactional
    @Produces(MediaType.APPLICATION_JSON)
    public void
    */
    }
