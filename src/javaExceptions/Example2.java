package javaExceptions;

public class Example2 
{

	public static void main(String[] args) 
	{		
		
		System.out.println("-------------statement-1----------------");
		try
		{
			String name = "Hello";
			System.out.println(name);//right
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		System.out.println("-------------statement-2----------------");
		try
		{
			String value = null;
			System.out.println(value.length());//wrong
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		System.out.println("-------------statement-3----------------");
		try
		{
			int value1 = 200, value2 = 20;
			System.out.println(value1/value2);//right
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		System.out.println("-------------statement-4----------------");
		try
		{
			int values[] = {200, 30, 67, 309, 189};
			System.out.println(values[6]);//wrong
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		System.out.println("-------------statement-5----------------");
		try
		{
			int age = 20;
			System.out.println(age >= 18);//right
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
