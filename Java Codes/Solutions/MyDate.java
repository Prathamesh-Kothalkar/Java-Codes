import java.util.*;
class MyDate{
	public static void main(String agrs[]){
		String[] days={" ","Sunday","Monday","Friday","Tuesday","Wednsday","Friday","Staurday"};
		 Calendar calendar = Calendar.getInstance();

		        // Demonstrate Calendar's get()method
		        calendar.set(Calendar.MONTH,4-1);
		        calendar.set(Calendar.DATE,15);
		        calendar.set(Calendar.YEAR,2005);
         System.out.println("Current Calendar's Year: " + calendar.get(Calendar.YEAR));
		        System.out.println("Current Calendar's Day: " + days[calendar.get(Calendar.DAY_OF_WEEK)]);
	}
}