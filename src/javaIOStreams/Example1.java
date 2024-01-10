package javaIOStreams;

import java.util.Scanner;

public class Example1 
{

	public static void main(String[] args) 
	{
		
		/**
		 * System.in
		 * System.out
		 * System.err
		 */

		System.out.println("Hello");
		
		System.out.println("-----------------------");
		
		System.err.println("wrong approach.");
		
		System.out.println("-----------------------");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		String name = scanner.nextLine();
		
		scanner.close();
		
		System.out.println(name);
		
		
	}

}
