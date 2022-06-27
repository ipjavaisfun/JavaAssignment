

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
		scan.close();
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
class Main{
	public static void main(String[] args) {
		McDonald mcd = new McDonald();
		mcd.nameOfRestaurant();
		mcd.menu();
		mcd.totalPrice();
		
	}
}
