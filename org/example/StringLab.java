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
        //System.out.println("The extracted substring is: " + part);
        // *****************************************

        // Example #4 ******************************
        String mixedCase = "This Is A Test";
        String upper = mixedCase.toUpperCase();
        String lower = mixedCase.toLowerCase();
        //System.out.println("Uppercase: " + upper);
        //System.out.println("Lowercase: " + lower);
        // *****************************************

        // Example #5 ******************************
        String sentence = "The quick brown fox jumps over the lazy dog.";
        int indexOfFox = sentence.indexOf("fox");
        int indexOfZ = sentence.indexOf('z');
        int indexOfCat = sentence.indexOf("cat");
        // System.out.println("Index of 'fox': " + indexOfFox);
        // System.out.println("Index of 'z': " + indexOfZ);
        // System.out.println("Index of 'cat': " + indexOfCat);
        // *****************************************
 
        // Example #6 ******************************
        String str1 = "Java";
        String str2 = "java";
        String str3 = "Java";

        boolean isEqual1 = str1.equals(str2);
        boolean isEqual2 = str1.equals(str3);
        boolean isEqualIgnoreCase = str1.equalsIgnoreCase(str2);

        System.out.println("\"Java\".equals(\"java\"): " + isEqual1);
        System.out.println("\"Java\".equals(\"Java\"): " + isEqual2);
        System.out.println("\"Java\".equalsIgnoreCase(\"java\"): " + isEqualIgnoreCase);
        // *****************************************

        // Example #7 ******************************

        // *****************************************

        // Example #8 ******************************

        // *****************************************
	}
}