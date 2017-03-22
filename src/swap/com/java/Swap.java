package swap.com.java;


public class Swap {

	public void badSwap(int var1, int var2)
	{
		int tempt = var1;
		var1 = var2;
		var2 = tempt;
		System.out.println("var1: " +var1);
		System.out.println("var2: " +var2);
		
		
	}
	public void tricky(Point arg1, Point arg2)
	{
		arg1.x=100;
		arg2.y=150;
		Point temp =arg1;
		arg1 = arg2;
		arg2=temp;
	}
	
	public static void main(String[] args)
	{
		Swap swp = new Swap();
		Point pnt1= new Point(0,0);
		Point pnt2 = new Point(0,0);
		System.out.println("X: " +pnt1.x + " Y:" +pnt1.y);
		System.out.println("X: " +pnt2.x+ " Y: " +pnt2.y);
		System.out.println(" ");
		swp.tricky(pnt1,pnt2);
		System.out.println("X: " +pnt1.x + " Y:" +pnt1.y);
		System.out.println("X: " +pnt2.x+ " Y:" +pnt2.y);
		System.out.println(" ");
		
		swp.badSwap(10,15);
	}
}
