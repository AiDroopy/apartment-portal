package hu.odin;

import java.util.Collection;

import jakarta.transaction.Transactional;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

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

    @POST
    @Transactional
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response createPost(Post post) {
        post.persist();
        return Response.status(Response.Status.CREATED).entity(post).build();
    }
}
