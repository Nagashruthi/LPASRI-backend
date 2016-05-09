package imitatedatabase;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import java.util.*;
import org.json.JSONObject;

@Path("/loginValidate")
public class loginfn {

	@GET
	@Path("{uname}/{password}")
	@Produces("application/json")
	public Response loginValidation(@PathParam("uname") String uname,@PathParam("password") String password)
	{		
		loginDB l=new loginDB();
		ArrayList<String> al=new ArrayList<String>();
		al=l.gethm(uname);
		String fin;
		String res1=al.get(0).toString();
		if(res1.equals(password))
		{
			fin=uname;
		}
		else
			fin=null;
		
	JSONObject json=new JSONObject();
	json.put("results",fin);
	
	String result1="" +json;
	return Response.status(200).entity(result1).build();
	
	}
}
