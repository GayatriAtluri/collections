package swap.com.java;

public class ExceptionHandling {
	public static void main(String[] args)
	{
		int num1,num2;
		int[] myIntArray = new int[5];
		
		try{
			
			num1 = 0;
			num2= 62/num1;
			System.out.println("Try block");
			int num = myIntArray[6];
			System.out.println("Value after reading from array " +num);
			
			//TODO: Why outOFBound Not working?
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Dont divide by Zero");
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("IndexOutOfBound Exception");
		}
		
		catch(Exception e)
		{
			System.out.println("Exceptions");
		}
		
		System.out.println("Not Catch block");
	}
}

