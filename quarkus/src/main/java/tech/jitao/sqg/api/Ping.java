package tech.jitao.sqg.api;

import io.smallrye.mutiny.Uni;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/ping")
@Produces(MediaType.TEXT_PLAIN)
@ApplicationScoped
public class Ping {

    @GET
    public Uni<String> process() {
        return Uni.createFrom().item("pong");
    }
}
