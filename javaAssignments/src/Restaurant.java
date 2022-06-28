

import java.util.Scanner;

public abstract class Restaurant {
	public abstract void totalPrice();
	public abstract void menu();
	
	public void nameOfRestaurant() {
		System.out.println("======CITY Restaurant=======");
	}
}
class McDonald extends Restaurant{

	@Override
	public void totalPrice() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your order item price:");
		double price = scan.nextDouble();
		System.out.println("Total price is:"+(price+(price*6/100)));
			
	}

	@Override
	public void menu() {
		System.out.println("************************");
		System.out.println("Restaurant Menu");
		System.out.println("----------------");
		System.out.println("Beef Burger - 2.99");
		System.out.println("Chciken Sandwich - 3.99");
		System.out.println("Chicken nuggets(5pcs) - 3.99");
		System.out.println("Drink - 0.99");
		System.out.println("************************");	
	}
	
}
class KFC extends Restaurant{

	@Override
	public void totalPrice() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your order item price:");
		double kprice = sc.nextDouble();
		System.out.println("Total price is:"+(kprice+(kprice*6/100)));
		
		
	}

	@Override
	public void menu() {
		System.out.println("************************");
		System.out.println("KF Menu");
		System.out.println("----------------");
		System.out.println("KF PopCorn Shrip - 5.99");
		System.out.println("KF Chciken Wings(6 pcs) - 3.99");
		System.out.println("KF Chicken nuggets(5pcs) - 3.99");
		System.out.println("KF Drink - 0.99");
		System.out.println("************************");		
	}
	
}
class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		McDonald mcd = new McDonald();
		KFC kf = new KFC();
		System.out.println("Enter Choice");
		System.out.println("ENTER '1' for McDonald");
		System.out.println("ENTER '2' for KFC");
		int choice = sc.nextInt();
	switch (choice) {
		case 1: mcd.nameOfRestaurant();
				mcd.menu();
				mcd.totalPrice();
				break;
		case 2: kf.nameOfRestaurant();
				kf.menu();
				kf.totalPrice();
				break;

		default: System.out.println("Invalid Choice.");
				break;
		}		
	}
}
