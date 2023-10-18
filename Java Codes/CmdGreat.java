class CmdGreat{
		public static void main(String[] agrs)
		{
			int x = Integer.parseInt(agrs[0]);
			int y = Integer.parseInt(agrs[1]);

			if(x>y)
			System.out.println(x+" is greater");
			else
			System.out.println(y+" is greater");
		}
}