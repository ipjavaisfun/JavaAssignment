
import java.util.Scanner;

public class PowerBillCal { //Assignment#1

	public static void main(String[] args) {
		System.out.println("Power bill Calculator.");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your consumed unit number:");
		int unit = scan.nextInt();
		scan.close();
		
		if(unit<=50) {
			System.out.println("Your bill amount is: $"+unit*1);
		}
		else if(unit>50 & unit<=100) {
			System.out.println("Your bill amount is: $"+((unit-50)*2+(50*1)));	
		}
		else if(unit>100 & unit<=200) {
			System.out.println("Your bill amount is: $"+((unit-100)*3+(50*2)+(50*1)));	
		}
		else if(unit>200 & unit<=400) {
			System.out.println("Your bill amount is: $"+((unit-200)*4+(100*3)+(50*2)+(50*1)));
		}
		else {
			System.out.println("Your bill amount is: $"+(unit*5));
		}
		
	}

}
