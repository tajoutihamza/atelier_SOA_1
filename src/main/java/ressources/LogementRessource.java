package ressources;

import entities.Logement;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("logements")
public class LogementRessource {
    private static List<Logement> logements;

    public LogementRessource() {
        logements = new ArrayList<Logement>();
        logements.add(
                new Logement(
                        1, "Ariana", "Raoued",
                        "Ariana", "Villa", "Villa", 120f
                )
        );
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAll() {
        if (logements.isEmpty())
            return Response.status(Response.Status.NOT_FOUND).entity("list is empty").build();
        return Response.status(200).entity(logements).build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_XML)
    public Response addLogement(Logement l) {
        if (logements.add(l))
            return Response.status(Response.Status.CREATED).build();
        return Response.status(Response.Status.NOT_FOUND).build();
    }

    @GET
    @Path("/{ref}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getLogementByReference(@PathParam("ref")  int ref) {
        Logement foundLogement = null;
        for (Logement logement : logements) {
            if (logement.getReference() == ref) {
                foundLogement = logement;
                break;
            }
        }

        if (foundLogement != null) {
            return Response.ok(foundLogement, MediaType.APPLICATION_JSON).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND)
                    .entity("Logement with reference " + ref + " not found")
                    .type(MediaType.TEXT_PLAIN)
                    .build();
        }
    }
}