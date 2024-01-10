package javaIOStreams;

import java.io.File;
import java.io.IOException;

public class Example3 
{

	public static void main(String[] args)throws IOException
	{
		try
		{
			
			File file = new File("E:\\Sessions\\10pm session\\Notes\\Day-9\\files");
			
			String docs[] = file.list();
			
			for(String doc: docs)
			{
				System.out.println(doc);
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
