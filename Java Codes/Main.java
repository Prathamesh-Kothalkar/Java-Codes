class Shape{
   void dis(){
   System.out.println("This is Shape");
   }
   }
  class Rect extends Shape{
	  void rec(){
		  System.out.println("This is Rectangle");
	  }
  }
  class Circ extends Shape{
	  void cir(){
		  System.out.println("This is Circle Shape");
	  }
  }

  class Squa extends Rect{
	  void squu(){
		  System.out.println("Square is a rectangle");
	  }
  }

  class Main{
	  public static void main(String[] agrs){
		  Squa s = new Squa();
		  Circ c = new Circ();
		  s.dis();
		  s.rec();
		  s.squu();
		  c.dis();
		  c.cir();
	  }
  }