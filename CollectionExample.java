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
		//Iterator<String> it= new Iterator()
		for(String item : list )
		{
			System.out.println(item);
		}
	}
	
}