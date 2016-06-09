package wildflyswarm.logging;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public class MyController {

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public String get() {
    return "{\"value\":\"Hello\"}";
  }

}
