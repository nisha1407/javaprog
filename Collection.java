import java.util.*;
class Collection
{
	public static void main(String args[])
	{
		List l1 = new ArrayList();
		List l2 = new LinkedList();
		System.out.println("-------------------ArrayList--------------------------------");
		addarray(l1);
		System.out.println("-------------------LinkedList--------------------------------");
		addarray(l2);
		System.out.println("Display list for Array");
		display(l1);
		
		//System.out.println("Display list for LinkedList");
		//Scanner sc=new Scanner(System.in);
		//int n=sc.nextInt();
		//Display(l2);
		
	}
	public static void addarray(List list)
	{
		for(int i=0;i<50000;i++)
		{
			list.add("Nisha"+(i+1));
		}		
	}
	
	public static void display(List list)
	{
		long startTime=new Date().getTime();
		
		for(int i=0;i<50000;i++)
		{
			System.out.println(list.get(i));
		}
		
		long endTime=new Date().getTime();
		System.out.println("Start Time"+startTime);
		System.out.println("End Time"+endTime);
		long time=((endTime-startTime)/1000);
		System.out.println("Time is"+time);
	}

}