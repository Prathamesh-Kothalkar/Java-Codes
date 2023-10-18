import java.util.Scanner;
class TestA{
	public static void main(String[] agr){
		int a[]={23,45,60,34,56},n=5,item,pos,i;
		Scanner stdin = new Scanner(System.in);
		System.out.println("Enter itrm to be search");
		item=stdin.nextInt();
		for(i=0;i<n;i++)
		{
			if(a[i]==item)
			System.out.println(item+" Found at " +i+" position");
			break;
			//System.out.println(a[i]);
		}
		if(i>=n)
		System.out.println( item+ "Not Found");

}
}