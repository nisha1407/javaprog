import java.lang.*;
import java.util.*;
public class Divide
{
	public static void runDivisionMethod()	throws InputMismatchException
	{
		double var1,var2;
		Scanner sc=new Scanner(System.in);
		Exampl1 e1=new Exampl1();
		
		/*System.out.println("Enter 1st no");
		var1=sc.nextDouble();
		System.out.println("Enter 2nd no");
		var2=sc.nextDouble();
		System.out.println("Division is"+e1.divide(var1,var2));*/
	//try
	//{
		System.out.println("Enter 1st no");
		var1=sc.nextDouble();
		System.out.println("Enter 2nd no");
		var2=sc.nextDouble();
		System.out.println("Division is"+e1.divide(var1,var2));
	//}
	//catch(InputMismatchException e)
	//{
		//System.out.println("Input must be number");
		//System.out.println(e);
		//e.printStackTrace();
		throw new InputMismatchException("Input must be number");
	//}
		
	}
	public static void main(String args[])
	{
		try
		{
			runDivisionMethod();
		}
		catch(InputMismatchException e)
		{
			System.out.println("Running the program again");
			e.printStackTrace();
			runDivisionMethod();
		}
		catch(Exception e)
		{
			System.out.println("In Exception");
		}
	}
}