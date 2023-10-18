import java.util.*;
class Strrev{
	public static void main(String [] agr){
	Scanner stdin = new Scanner(System.in);
	String str,nstr="";
	//boolean y;
	System.out.println("Enter a String");
	str = stdin.nextLine();
	for(int i=0;i<str.length();i++)
	{
		char c = str.charAt(i);
		nstr= c+nstr;
	}

	System.out.println("Reverse string = "+nstr);

    //y=str.equals(nstr);
	if(str.equals(nstr)){
		System.out.println("Palidrone");
	}
	else{
		System.out.println("Not Palidrone");
	}
}
}
