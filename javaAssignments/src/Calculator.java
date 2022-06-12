

import java.util.Scanner;

public class Calculator { //Assignment#2
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("SIMPLE CALCULATOR.");
		System.out.println("1.ADDITION");
		System.out.println("2.SUBSTRACTION");
		System.out.println("3.MULTIPLICATION");
		System.out.println("4.DIVISION");
		System.out.println("Enter your choice.");
		int choice = scan.nextInt();
		System.out.println("Enter your first value.");
		int number1 = scan.nextInt();
		System.out.println("Enter your second value.");
		int number2 = scan.nextInt();
		scan.close();
	switch(choice) {
		case 1: System.out.println("Answer is: "+(number1+number2));
				break;
		case 2: System.out.println("Answer is: "+(number1-number2));
		        break;
		case 3: System.out.println("Answer is: "+(number1*number2));
				break;
		case 4: System.out.println("Answer is: "+(number1/number2));
				break;
		default: System.err.println("Invalid Choice. Please enter your choice from 1-4.");
	   }	
	}
}
