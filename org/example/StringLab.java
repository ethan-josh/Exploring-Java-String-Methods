package org.example;

public class StringLab{
	public static void main(String[] args){

		// Example #1 ******************************
		String greeting = "Hello, Cadets!";
		int length = greeting.length();
		// System.out.println("The length of the string is: " + length);
		// *****************************************

		// Example #2 ******************************
		String message = "Keep learning!";
        char character = message.charAt(5);
        //System.out.println("The character at index 5 is: " + character);
        // *****************************************
        
        // Example #3 ******************************
        String statement = "Java is powerful.";
        String part = statement.substring(5, 7);
        System.out.println("The extracted substring is: " + part);
        // *****************************************
	}
}