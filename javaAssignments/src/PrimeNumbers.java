import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fCount = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 'n' number.");
		int n = scan.nextInt();
		scan.close();
	
	for (int i = 2; i <=n; i++) {
		fCount = 0;
		for (int j = 1; j <=n; j++) {
			if (i%j==0) {
				fCount = fCount+1;
			}
			
		}if (fCount==2) {
			System.out.println(i);
			
		}
		
	}
	}

}
