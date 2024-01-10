package javaIOStreams;

import java.io.File;
import java.io.IOException;

public class Example2 
{

	public static void main(String[] args)throws IOException
	{
		try
		{
			File file = new File("E:\\Sessions\\10pm session\\Notes\\Day-9\\files\\java23.txt");
			
			if(file.createNewFile())
			{
				System.out.println("new file is created.");
			}
			else
			{
				System.out.println("file is already created.");
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
