package javaExceptions;

public class Example1 
{

	public static void main(String[] args) 
	{		
		
		System.out.println("-------------statement-1----------------");
		String name = "Hello";
		System.out.println(name);//githt
		
		System.out.println("-------------statement-2----------------");
		String value = null;
		System.out.println(value.length());//wrong
		
		System.out.println("-------------statement-3----------------");
		int value1 = 200, value2 = 20;
		System.out.println(value1/value2);//right
		
		System.out.println("-------------statement-4----------------");
		int values[] = {200, 30, 67, 309, 189};
		System.out.println(values[6]);//wrong
		
		System.out.println("-------------statement-5----------------");
		int age = 20;
		System.out.println(age >= 18);//right
		
	}

}
