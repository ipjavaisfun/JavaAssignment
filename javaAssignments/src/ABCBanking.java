

import java.util.Scanner;

public class ABCBanking {
	static char letter;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
  do {
  	
		System.out.println("1.Create Account.");
		System.out.println("2.Credit.");
		System.out.println("3.Debit.");
		System.out.println("4.Transfer Amount.");
		System.out.println("5.Mini Statement");
		System.out.println("Enter Option");
		int choice = scan.nextInt();
		
		
	switch(choice) {
		case 1: System.out.println("Account Created.");
		        break;	
		case 2: System.out.println("Account Credited.");
				break;
		case 3: System.out.println("Debit Completed.");
				break;
		case 4: System.out.println("Amount Transferred.");
				break;
		case 5: System.out.println("Statment Printed.");
				break;
		default: System.err.println("Invalid Choice");
		
	}   
		System.out.println("Do you want to continue? Y/N?");
		letter = scan.next().charAt(0);
		
		
		
    }
  while(letter == 'Y'| letter == 'y'); 
  		System.out.println("Thank you! Visit again!");
  		scan.close();
    }
	
	}
	
	
	


