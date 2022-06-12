

import java.util.Scanner;

public class OddEven { //Assignment#3

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Input the toatl number of integers(odd and even) you wish to enter.");
		int numbers = scan.nextInt();
		int i = 1;
		int n = 0;
		int sumOfEven = 0;
		int sumOfOdd = 0;
		
		while (i<=numbers) {
			System.out.println(i+". Enter the integer of your choice.");
				n = scan.nextInt();
				i=i+1;
		if(n%2==0) { 
			sumOfEven = sumOfEven+n;
		}else { 
			sumOfOdd = sumOfOdd+n;
		}
				
	  }
		scan.close();
		System.out.println("Sum of even numbers is: "+sumOfEven);
		System.out.println("Sum of odd numbers is: "+sumOfOdd);
  }
}
