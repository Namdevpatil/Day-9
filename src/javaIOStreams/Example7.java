package javaIOStreams;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Example7 
{

	public static void main(String[] args)throws IOException
	{
		
		FileInputStream fileInputStream = null;
		
		ObjectInputStream objectInputStream = null;
		
		try
		{
						
			fileInputStream = new FileInputStream("E:\\Sessions\\10pm session\\Notes\\Day-9\\files\\patient.txt");
			
			objectInputStream = new ObjectInputStream(fileInputStream);
			
			Patient patient = (Patient) objectInputStream.readObject();
			
			System.out.println(patient.toString());
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally 
		{
			objectInputStream.close();
			fileInputStream.close();
			System.out.println("\nfile is closed.");
		}
		
	}

}
