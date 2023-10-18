//This is after Edit
import java.util.*;
class Abook{
		String name,str;
		int age;
		String phone;
		Scanner in = new Scanner(System.in);
	void readData(){


		System.out.println("Enter Name = ");
		name=in.nextLine();
		System.out.println("Age = ");
		age=in.nextInt();
		in.nextLine();
		System.out.println("Mobile No= ");
		phone=in.nextLine();
	}

	void putdata(){
		System.out.println(name+" "+age+" "+phone);
	}

	/*void Search(){

		System.out.println("Enter name");
		str=in.nextLine();

	}*/

	public static void main(String[] agrs){
		int n;
		String sname;
		Scanner stdin = new Scanner(System.in);
		///Insert
		System.out.println("Enter No :");
		n=stdin.nextInt();
		Abook a[]=new Abook[n];
		for(int i=0;i<a.length;i++){
			a[i]=new Abook();
			a[i].readData();
		}
		//EndInsert
		//Show all
		for(int i=0;i<a.length;i++){
			a[i].putdata();
		}
		///EndShow
		///Search
		stdin.nextLine();
		System.out.println("Enter Name:");
		sname=stdin.nextLine();
		for(int i=0;i<a.length;i++)
		{
			if(sname.equals(a[i].name))
				a[i].putdata();

		}
		/////EndSearch
	}
}
