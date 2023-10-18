import java.util.Scanner;
class Revarr{
	public static void main(String[] agrs){
	Scanner stdin =new Scanner(System.in);
	Revarr t = new Revarr();
	System.out.println("Enter size of Array: ");
	int n=stdin.nextInt();
	System.out.println("Enter Starting Position");
	int k=stdin.nextInt();
	t.rev(n,k);
}
	void rev(int n,int k){
		Scanner stdin =new Scanner(System.in);
		int temp=0;
		int[] ar=new int[n];
		System.out.println("Enter " +n+ " elements");
		for(int i=0;i<n;i++){
			ar[i]=stdin.nextInt();
		}

		int s,g,start=k-1;

		s=start;
		for(int j=s;j>=0;j--){
			System.out.print(ar[j]+" ");
		}

		for(g=ar.length-1;g>start;g--){
			System.out.print(ar[g]+ " ");
		}
}

}