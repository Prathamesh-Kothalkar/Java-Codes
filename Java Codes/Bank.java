import java.util.*;
class Bank{
	int id;
	String name;
	double bal;

	void getData(){
		Scanner stdin = new Scanner(System.in);
		System.out.println("Enter Account Number");
		id=stdin.nextInt();
		stdin.nextLine();
		System.out.println("Enter Name");
		name=stdin.nextLine();
		System.out.println("Enter amount");
		bal=stdin.nextDouble();
		System.out.println("===============================");
	}

	void putData(){
		System.out.println(id+"\t\t"+name+"\t\t"+bal);
	}

	public static void main(String agr[]){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Num of Customer");
		int n = in.nextInt();
		Bank[] ac = new Bank[n];
		for(int i=0;i<ac.length;i++){
			ac[i]=new Bank();
			System.out.println("Enter Detail of " +(i+1)+" number");
			ac[i].getData();
		}
		System.out.println();
		System.out.println("==========================================");
		System.out.println("Acc\t\tName\t\tBalance\t\t");
		System.out.println("==========================================");
		for(int j = 0;j<ac.length;j++){
			if(ac[j].bal>=1000)
				ac[j].putData();
		}
		System.out.println("==========================================");

}
}