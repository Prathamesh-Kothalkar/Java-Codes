class CmdNnum{
			public static void main(String[] agrs){
			   int i,sum=0,x;
			   for(i=0;i<agrs.length;i++)
			   {
				   x = Integer.parseInt(agrs[i]);
				   sum=sum+x;
			   }
			   System.out.println("Total sum is = "+sum);
			}
}