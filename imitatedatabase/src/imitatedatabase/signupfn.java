package imitatedatabase;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import java.util.*;
import org.json.JSONObject;

@Path("/signup")
public class signupfn {

	@GET
	@Path("{uname}/{password}/{name}/{apt}/{street}/{city}/{state}/{zip}/{emailid}/{contnum}")
	@Produces("application/json")
	public Response loginValidation(@PathParam("uname") String uname,@PathParam("password") String password,@PathParam("name") String name,
			@PathParam("apt") String apt,@PathParam("street") String street,@PathParam("city") String city,@PathParam("state") String state,@PathParam("zip") String zip,
			@PathParam("emailid") String emailid,@PathParam("contnum") String contnum)
	{
	
		ArrayList<String> al=new ArrayList<String>();
		al.add(password); al.add(name); al.add(apt); al.add(street); al.add(city); al.add(state); al.add(zip);al.add(emailid); al.add(contnum);
		
		loginDB l=new loginDB();
		l.sethm(uname, al);
		l.display();
		
		String res1="inserted";
		
	JSONObject json=new JSONObject();
	json.put("results",res1);
	
	String result1="" +json;
	return Response.status(200).entity(result1).build();
	
	}
	
}
