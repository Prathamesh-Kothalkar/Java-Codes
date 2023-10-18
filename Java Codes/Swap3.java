import java.util.Scanner;
class Swap3{
	public static void main(String[] agr){
	Scanner in = new Scanner(System.in);
	System.out.println("Enter A Value :");
	int a = in.nextInt();
	System.out.println("Enter B Value :");
	int b = in.nextInt();
	System.out.println("Enter C Value :");
	int c = in.nextInt();
	System.out.println("Before Swap :");
	System.out.println("\ta="+a+" b="+b+" c="+c);
	//Swap
	a=a+b;
	b=a-b;
	a=a-b;

	b=b+c;
	c=b-c;
	b=b-c;
	System.out.println("After Swap :");
	System.out.println("\ta="+a+" b="+b+" c="+c);
	}
	}