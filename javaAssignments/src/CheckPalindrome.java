

import java.util.Scanner;

public class CheckPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String to check."); //Check Words JAVA and Malayalam
		
		String word1 = sc.next();
		String reverse = "";
		
		for(int i = word1.length()-1;i>=0;i--) {
			reverse+=word1.charAt(i);
		}
		if(reverse.equalsIgnoreCase(word1)){
			System.out.println("It's a Palindrome.");
		}
		else {
			System.out.println("It's not a Palindrome.");
		
		}
		}

	}


