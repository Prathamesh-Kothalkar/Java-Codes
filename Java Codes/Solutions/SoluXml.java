import java.util.*;
import java.util.regex.*;
class SoluXml{
	public static void main(String agrs[]){
		Scanner in = new Scanner(System.in);

		String str = in.nextLine();
		Pattern regex=Pattern.compile("<(.+)>([^<]+)</\\1>");
		Matcher match=regex.matcher(str);
		if(match.find())
		System.out.println(match.group(2));
		else
		System.out.println("none");
	}
}