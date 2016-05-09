package imitatedatabase;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import java.util.*;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/getCustomerAddress")
public class getCustAdd {

	@GET
	@Path("{uname}")
	@Produces("application/json")
	public Response loginValidation(@PathParam("uname") String uname)
	{		
		loginDB l=new loginDB();
		ArrayList<String> arr=new ArrayList<String>();
		arr=l.gethm(uname);
		
		ArrayList<String> fin=new ArrayList<String>();
		fin.add(arr.get(2)); fin.add(arr.get(3)); fin.add(arr.get(4)); fin.add(arr.get(5)); fin.add(arr.get(6));
		
	JSONArray jsonArray= new JSONArray(fin);
	JSONObject json=new JSONObject();
	json.put("ordres-",jsonArray);
	
	String result="" +json;
	return Response.status(200).entity(result).build();
	
	}

}
