package javaIOStreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Example5 
{

	public static void main(String[] args)throws IOException
	{
		
		FileInputStream fileInputStream = null;
		
		try
		{
						
			fileInputStream = new FileInputStream("E:\\Sessions\\10pm session\\Notes\\Day-9\\files\\java.txt");
			
			int i = 0;
			
			while((i = fileInputStream.read()) != -1)
			{
				System.out.print((char)i);
			}	
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally 
		{
			fileInputStream.close();
			System.out.println("\nfile is closed.");
		}
		
	}

}
