import java.util.*;
public class MapExample
{
	public static void main(String args[])
	{
		//Map<String,String> emp=new HasMap<String,String>();
		//Map<String,String> emp=new TreeMap<String,String>();
		Map<String,String> emp=new LinkedHashMap<String,String>();
		emp.put("fname","Nisha");
		emp.put("lname","Solanki");
		emp.put("empid","41");
		emp.put("department","development");
		System.out.println(emp);
		System.out.println(emp.get("fname")+"  "+emp.get("lname")+" "+emp.get("salary"));
		print(emp);
	}
	
	public static void print(Map map)
	{
		//System.out.println(map.get("fname"));
		Set<Map.Entry>	entrySet=map.entrySet();
		for(Map.Entry e:entrySet)
		{
			System.out.println(e.getKey()+"======>"+e.getValue());
		}
	}
}