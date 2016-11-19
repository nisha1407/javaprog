import java.util.*;
public class BlackListWords
{
	static Set blackList= new HashSet();
	
	static
	{
		blackList.add("idiot");
		blackList.add("badword1");
		blackList.add("badword2");
		blackList.add("badword3");
		blackList.add("badword4");
	}
	public static void main(String args[])
	{
		String statment="John doe is an idiot";
		if(hasBlackListedWord(statment))
		{
			System.out.println("Can not print this stament because it has black listed word");
		}
		else
		{
			System.out.println(statment);
		}
	}
	
	public static boolean hasBlackListedWord(String str)
	{
		String[] words=str.split(" ");
		for(String word: words)
		{
			if(blackList.contains(word))
			{
				return true;
			}
		}
		return false;
	}
}