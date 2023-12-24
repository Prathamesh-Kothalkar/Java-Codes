import java.io.*;
import java.util.*;

public class SoluStr4 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String rstr="";
        int i=A.length()-1;
        while(i>=0){
            rstr+=A.charAt(i);
            i--;
        }
        if(rstr.equals(A)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}



