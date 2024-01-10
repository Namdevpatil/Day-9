package javaIOStreams;

import java.io.FileOutputStream;
import java.io.IOException;

public class Example4 
{

	public static void main(String[] args)throws IOException
	{
		
		FileOutputStream fileOutputStream = null;
		
		try
		{
			
			String name = "Shravani";
			
			byte byteValues[] = name.getBytes();
			
			fileOutputStream = new FileOutputStream("E:\\Sessions\\10pm session\\Notes\\Day-9\\files\\java.txt");
			
			if(fileOutputStream != null)
			{
				fileOutputStream.write(byteValues);
				System.out.println("data stored in a file");
			}
			else
			{
				System.out.println("not able store data in a file");
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally 
		{
			fileOutputStream.close();
			System.out.println("file is closed.");
		}
		
	}

}
