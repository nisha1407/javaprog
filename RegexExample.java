import java.util.regex.*;
public class RegexExample
{
	public static void main(String args[])
	{
		Pattern p = Pattern.compile("[a-zA-Z0-9]*");
		
		Matcher matcher= p.matcher("fdhgfjvcbtrytiuyiubvh");
		
		if(matcher.matches())
		{
			System.out.println("String matched the pattern");
		}
		else
		{
			System.out.println("String not matched the pattern");
		}
	}
}
