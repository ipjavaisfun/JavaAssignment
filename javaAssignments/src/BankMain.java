


class Bank {
	int getBalance() {
		return 0;
	}
}
class BankA extends Bank{
	int balance =1000;
	int getBalance() {
		return balance;
	}
}
class BankB extends Bank{
	int balance = 1500;
	int getBalance() {
		return balance;
	}
}
class BankC extends Bank{
	int balance = 2000;
	int getBalance() {
		return balance;
	}
}

public class BankMain {

	public static void main(String[] args) {
		BankA ba = new BankA();
		BankB bb = new BankB();
		BankC bc = new BankC();
		System.out.println(ba.getBalance());
		System.out.println(bb.getBalance());
		System.out.println(bc.getBalance());

	}

}
