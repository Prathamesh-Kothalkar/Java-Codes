import java.util.*;
class Prime{
	public static void main(String[] agrs){
		int n;
		boolean f=false,v=false;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Number");
		n=in.nextInt();
		if (n==1 || n==0){
			System.out.println("Not Prime");
			v=true;
		}
	if(!v){
		for(int i=2;i<=n;i++)
		{
			if(n%i==0){
			f=true;
			break;
		}
		}

		if(!f)
			System.out.println("Prime");
		else
			System.out.println("Not Prime");
	}


}
}