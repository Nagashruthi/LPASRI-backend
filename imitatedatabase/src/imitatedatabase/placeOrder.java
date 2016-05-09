package imitatedatabase;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import java.util.*;
import org.json.JSONObject;

@Path("/placeorder")
public class placeOrder {

	@GET
	@Path("{uname}/{pkgid}/{pkgname}/{orderdate}/{deldate}/{status}")
	@Produces("application/json")
	public Response loginValidation(@PathParam("uname") String uname,@PathParam("pkgid") String pkgid,
			@PathParam("pkgname") String pkgname,@PathParam("orderdate") String orderdate,
			@PathParam("deldate") String deldate,@PathParam("status") String status)
	{		
		ordersDB od=new ordersDB();
		ArrayList<String> al=new ArrayList<String>();
		al.add(uname); al.add(pkgid); al.add(pkgname); al.add(orderdate); al.add(deldate); al.add(status);
		od.setohm(uname, al);
		od.display();
		
		String fin="placed the order";
		
		
	JSONObject json=new JSONObject();
	json.put("results",fin);
	
	String result1="" +json;
	return Response.status(200).entity(result1).build();
	
	}
}
