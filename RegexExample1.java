import java.util.regex.*;
import java.io.*;
import java.net.*;

public class RegexExample1
{
	public static String read(InputStream is)throws Exception
	{
		InputStreamReader reader = new InputStreamReader(is);
		StringBuilder sb = new StringBuilder();
		byte []b=new byte[256];
		while((is.read(b))!=-1)
		{
			sb.append(new String(b));
		}
		is.close();
		return sb.toString();
	}
	
	public static void printAnchor(String str)
	{
		String anchorRegex="<a\\s+href\\s*=\\s*\"(.*)\"\\s*>";
		Pattern pattern = Pattern.compile(anchorRegex,Pattern.CASE_INSENSITIVE);
		Matcher matcher= pattern.matcher(str);
		while(matcher.find())
		{
			System.out.println();
			String aTag= str.substring(matcher.start(),matcher.end());
			System.out.println(aTag);
		}
	}
	public static void main(String args[])throws Exception
	{
		URL url= new URL(args[0]);
		InputStream is=url.openStream();
		//System.out.println(read(is));
		printAnchor(read(is));
		
		//SimpleDateFormat 
	}
}
