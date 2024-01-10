package javaExceptions;

public class Example6 
{

	public static void ageValidation(int age) throws AgeProblemException
	{
		
		if(age >= 18)
		{
			System.out.println("the person is able to cast the vote.");
		}
		else
		{
			throw new AgeProblemException("the person is not have proper age to cast the vote...!");
		}

	}

	public static void main(String[] args) 
	{
		try
		{
			ageValidation(15);//problematic part
		}
		catch(AgeProblemException e)//handler part
		{
			System.err.println(e.getMessage());
		}
	}

}
