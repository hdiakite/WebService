package service;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/hello")
public class HellowordService {
	
	
	@GET
	@Path("/{name}")
	public Response getMsg(@PathParam("name") String name) {
		String output = "<html> " + "<title>" + "Java WebService Example" + "</title>"  + "<body><h1><div style='font-size: larger;'>"
				+ "Hello <span style='text-transform: capitalize; color: green;'>" + name + "</span></div></h1></body>" + "</html>";
		return Response.status(200).entity(output).build();
	}
	
}
