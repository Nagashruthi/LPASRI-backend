package imitatedatabase;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import java.util.*;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/itemstodeliver")
public class itemstodel {

	@GET
	@Produces("application/json")
	public Response loginValidation()
	{		
		ordersDB od=new ordersDB();
		ArrayList<ArrayList<String>> arr=new ArrayList<ArrayList<String>>();
		arr=od.tobedelivered();
		
	JSONArray jsonArray= new JSONArray(arr);
	JSONObject json=new JSONObject();
	json.put("ordres-",jsonArray);
	
	String result="" +json;
	return Response.status(200).entity(result).build();
	
	}
}
