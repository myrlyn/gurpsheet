package gurpssheet;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("hello")
public class Hello {

	public Hello() {
		// TODO Auto-generated constructor stub
	}
	@GET
	@Path("world")
	@Produces(MediaType.APPLICATION_JSON)
	public String helloWorld() {
		return "{\"message\": \"Hello World\"}";
		
	}

}
