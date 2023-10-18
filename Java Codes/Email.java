import java.util.*;
//import java.lang;
class Email{
	public static void main(String[] agr)
	{
		Scanner stdin = new Scanner(System.in);
		String email;
		System.out.println("Enter the email id");
		email=stdin.nextLine();
		int x =email.indexOf('@');
		int y = email.indexOf('.');
		char c = email.charAt(0);
		if(x!=-1 && y!=-1 && x<y && c!='@')
		{
			System.out.println("VALID");
		}
		else{
			System.out.println("Invalid");
		}
	}
}