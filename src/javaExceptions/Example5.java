package javaExceptions;

public class Example5 
{
	
	public static void doOperations(int value1, int value2) throws RuntimeException
	{
		try
		{
			System.out.println(value1/value2);
		}
		catch(RuntimeException e)
		{
			throw new RuntimeException("divide by zero is not possible");
		}
	}

	public static void main(String[] args) 
	{
		try
		{
			doOperations(200, 5);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
