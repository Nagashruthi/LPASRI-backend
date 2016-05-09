package imitatedatabase;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import org.json.JSONObject;

@Path("/completedelivery")
public class postdel {

	@GET
	@Path("{uname}/{pkgid}")
	@Produces("application/json")
	public Response loginValidation(@PathParam("uname") String uname,@PathParam("pkgid") String pkgid)
	{		
		ordersDB od=new ordersDB();
		od.deletedellist(uname, pkgid);
		od.display();
				
	String s1="Successfully verified the signature";
	JSONObject json=new JSONObject();
	json.put("ordres-",s1);
	
	String result="" +json;
	return Response.status(200).entity(result).build();
	
	}
}
