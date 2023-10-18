import java.util.Scanner;

class Varargs{
	static void display(String...s)
	{
		for(String i : s)
		{
		 System.out.println(i);
		}
	}

	public static void main(String[] arg){
		Scanner src =new Scanner (System.in);
	 	String n=src.nextLine();
	 	display(n);
	 	display("My Name is Prathamesh");
	}
}