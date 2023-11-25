/*
	Problem :- Given a string, find the index of the first character that does not repeat in the string
	Example:- For the string "asdas", the first non-repeating character is at index 2 (assuming a zero-based index). So, your program would output 2.

*/
/*
	author @Prathamesh-Kothalkar
*/
class CharCheck{

	public static int isRepeat(String x){
				String str=x;
				int len=str.length();
				char ch;
				for(int i=0;i<len;i++){
					ch=str.charAt(i);
					if(str.indexOf(ch)== str.lastIndexOf(ch)){
						return i;

					}
				}
				return -1;
		}

	public static void main(String[] agrs){
			String str="asdas";
			int isRep = isRepeat(str);
			System.out.println(isRep);
		}


}
