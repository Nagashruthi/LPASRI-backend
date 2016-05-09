package imitatedatabase;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import java.util.*;
import org.json.JSONObject;

@Path("/getContactNumber")
public class getContactNumber {

	@GET
	@Path("{uname}")
	@Produces("application/json")
	public Response loginValidation(@PathParam("uname") String uname)
	{
		loginDB l=new loginDB();
		ArrayList<String> arr=l.gethm(uname);
		
		l.display();
		
		String res1=arr.get(8).toString();
		
	JSONObject json=new JSONObject();
	json.put("results",res1);
	
	String result1="" +json;
	return Response.status(200).entity(result1).build();
	
	}

}
