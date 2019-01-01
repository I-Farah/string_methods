package edu.westga.cs6311.lab02b;

import java.util.Scanner;

/**The class is used to process input from the user, use string class methods and generate random numbers
 * @author Ibrahim Tonifarah
 * @version 8/29/2018
 *
 */

public class StringDriver {
	
	/** This is the entry point of the application
	 * @param args Not used
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a number between 1,000 and 999,999: ");
		String inputValue = scan.nextLine();
		int findComma = inputValue.indexOf(",");
		String frontValue = inputValue.substring(0, findComma);
		String backValue = inputValue.substring(findComma + 1, findComma + 4);
		String newValue = frontValue + backValue;
		System.out.println(newValue);
		
		System.out.print("Enter a number between 1000 and 999999: ");
		String inputValue2 = scan.nextLine();
		String splitAtComma = inputValue2.substring(0, inputValue2.length() - 3);
		String frontWithComma = splitAtComma + ",";
		String valueWithComma = inputValue2.replaceFirst(splitAtComma, frontWithComma);
		System.out.println(valueWithComma);
		
		System.out.print("Enter a sentence or phrase: ");
		String phrase = scan.nextLine();
		System.out.print("Enter the letter to be replaced: ");
		String letter1 = scan.nextLine();
		System.out.print("Enter the letter you want the " + letter1 + " to be replaced by: ");
		String letter2 = scan.nextLine();
		String newPhrase = phrase.replace(letter1, letter2);
		System.out.println("The new phrase is : " + newPhrase);
		
		int numerator = (int) (Math.random() * (89 + 1)) + 10;
		int denominator = (int) (Math.random() * 2);
		System.out.println(" " + numerator);
		System.out.println("X " + denominator);
		System.out.println(" " + numerator * denominator);
		System.out.println();
		
		int numeratorDigit1 = (int) (Math.random() * (5 + 1)) + 4;
		int numeratorDigit2 = (int) (Math.random() * (5 + 1)) + 4;
		String digitsToString = String.valueOf(numeratorDigit1) + String.valueOf(numeratorDigit2);
		int stringToDigits = Integer.parseInt(digitsToString);
		int denominator2 = (int) (Math.random() * (6 + 1)) + 3;
		System.out.println(" " + stringToDigits);
		System.out.println("X " + denominator2);
		System.out.println(stringToDigits * denominator2);
		
		scan.close();
	}

}
