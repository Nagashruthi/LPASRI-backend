package imitatedatabase;
import java.util.*;
public class loginDB {

	public static HashMap<String,ArrayList<String>> hm=new HashMap<String, ArrayList<String>>();
	
	public void sethm(String a,ArrayList<String> al)
	{
		hm.put(a,al);
	}
	
	public ArrayList<String> gethm(String a)
	{
		return hm.get(a);
	}
	public void display()
	{
		for (Map.Entry<String, ArrayList<String>> entry : hm.entrySet()) {
		    System.out.println(entry.getKey()+" : "+entry.getValue());
		}
	}
}
