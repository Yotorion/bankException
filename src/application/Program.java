package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;

public class Program {

	public static void main(String[] args) {
		
		Scanner HP = new Scanner (System.in);
		Locale.setDefault(Locale.CANADA_FRENCH);
		
		System.out.println("Enter account data");
		
		System.out.print("Number: ");
		Integer number = Integer.parseInt(HP.nextLine());
		
		System.out.print("Holder: ");
		String holder = HP.nextLine();
		
		System.out.print("Initial balance: ");
		Double balance = Double.parseDouble(HP.nextLine());
		
		System.out.print("Withdraw limit: ");
		Double withdrawLimit = Double.parseDouble(HP.nextLine());
		
		Account ac = new Account(number, holder, balance, withdrawLimit);
		
		System.out.println("------------------------------------------------");
		
		System.out.print("Enter amount to withdraw: ");
		Double quantity = Double.parseDouble(HP.nextLine());
		
		ac.withdraw(quantity);
		System.out.println("Actual balance: " + ac.getBalance());
		
		HP.close();
		
	}

}
