package javaExceptions;

public class Example4 
{
	
	public static void doOperations(int value1, int value2) 
	{		
		System.out.println(value1/value2);
	}

	public static void main(String[] args) 
	{
		try
		{
			doOperations(200, 0);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
