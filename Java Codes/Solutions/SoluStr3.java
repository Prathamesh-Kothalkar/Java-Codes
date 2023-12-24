import java.util.*;
class SoluStr3{
	public static void main(String agrs[]){
		Scanner in = new Scanner(System.in);
		String str=in.nextLine();

		int k=in.nextInt();
		String cur=str.substring(0,k);
		String max=cur;
		String min=cur;
		System.out.println("Default Same For Max Min="+ max+" "+min);
		for(int i=1;i<=str.length()-k;i++){
			System.out.println("Number of loop: "+i);
			cur=str.substring(i,i+k);
			if(cur.compareTo(max)>0){
				max=cur;
				System.out.println(i+"Loop Max =" + max);
			}
			if(cur.compareTo(min)<0){
				min=cur;
				System.out.println(i+"Loop Min=" + min);
		}
	}
	System.out.println(max+" "+min);

}
}
