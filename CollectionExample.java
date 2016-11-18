import java.util.*;
class CollectionExample
{
	public static void main(String[] args)
	{
		List list = new ArrayList();
		list.add("nisha");
		list.add(0);
		list.add('c');
		print(list);
	}
	public static void print(List list)
	{
		Iterator it= list.iterator();
		/*for(String item : list )
		{
			System.out.println(item);
		}*/
		while(it.hasNext())
		{
		   System.out.println(it.next());
		}
	}
	public static void remove()
	{
	 
	}
	
	
}