package javaIOStreams;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Example6 
{

	public static void main(String[] args)throws IOException
	{
		
		FileOutputStream fileOutputStream = null;
		ObjectOutputStream objectOutputStream = null;
		
		try
		{
						
			fileOutputStream = new FileOutputStream("E:\\Sessions\\10pm session\\Notes\\Day-9\\files\\patient.txt");
			
			objectOutputStream = new ObjectOutputStream(fileOutputStream);
			
			Patient patient = new Patient(101, "Harish", "Heart Problem", "XYZ");
			
			objectOutputStream.writeObject(patient);
			
			System.out.println("object data is stored in a file");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally 
		{
			objectOutputStream.close();
			fileOutputStream.close();
			System.out.println("\nfile is closed.");
		}
		
	}

}
