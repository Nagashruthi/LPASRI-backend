package imitatedatabase;
import java.util.*;
public class ordersDB {

	public static HashMap<String,ArrayList<ArrayList<String>>> ohm=new HashMap<String,ArrayList<ArrayList<String>>>();
	public static ArrayList<ArrayList<String>> dellist=new ArrayList<ArrayList<String>>();
	
	public void setohm(String a, ArrayList<String> al)
	{
		if(ohm.containsKey(a))
		{
		ArrayList<ArrayList<String>> arr=new ArrayList<ArrayList<String>>();
		arr=ohm.get(a);
		arr.add(al);
		ohm.put(a,arr);
		}
		else
		{
		ArrayList<ArrayList<String>> arr=new ArrayList<ArrayList<String>>();
		arr.add(al);
		ohm.put(a,arr);
	    }
		dellist.add(al);
	}
	
	public ArrayList<ArrayList<String>> getohm(String a)
	{
		return ohm.get(a);
	}
	
	public void display()
	{
		for (Map.Entry<String, ArrayList<ArrayList<String>>> entry : ohm.entrySet()) {
		    System.out.println(entry.getKey()+" : "+entry.getValue());
		}
	}
	public ArrayList<ArrayList<String>> tobedelivered()
	{
		return dellist;
	}
	public void deletedellist(String a, String b)
	{
		int k=-1;
		for(int i=0;i<dellist.size();i++)
		{
			ArrayList<String> temp=dellist.get(i);
			if(temp.get(0).toString().equals(a) && temp.get(1).toString().equals(b))
			{
				k=i;
				break;
			}
		}
		dellist.remove(k);
	}
}
