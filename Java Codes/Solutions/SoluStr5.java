import java.io.*;
import java.util.*;

public class SoluStr5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        String s2 = in.nextLine();

        String a = s1.toUpperCase();
        String b= s2.toUpperCase();

         if(a.length() != b.length()){
            System.out.println("Not Anagrams");
        }
        else{
            char[] a_char = a.toCharArray();
            char[] b_char = b.toCharArray();
            Arrays.sort(a_char);
            Arrays.sort(b_char);
            String a_str = new String(a_char);
            String b_str = new String(b_char);

			String str1=a_str;
			String str2 = b_str;
			System.out.println(str1+" "+str2);
            if(str1.equals(str2)){

                System.out.println("Anagrams");
            }
            else{
               System.out.println("Not Anagrams");
            }
        }
    }
}
