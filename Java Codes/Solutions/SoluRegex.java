import java.util.*;
import java.util.regex.*;
class SoluRegex{
	public static void main(String agrs[]){
		String str ="He is a very very good boy, isn't he?";
		String[] s=str.trim().concat(" ").split("[ '?,@_]+");
		System.out.println(s.length);
		for(int i=0;i<s.length;i++)
		System.out.println(s[i]);
	}
}