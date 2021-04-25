package application;


import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account data");
		
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Initial Balance: ");
		double initialBalance = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		double withdraw = sc.nextDouble();
		
		Account account = new Account(number, holder, initialBalance, withdraw);
		
		System.out.print("Enter amount for withdraw: ");
		double withdrawAmount = sc.nextDouble();


		try { 
			
			account.withdraw(withdrawAmount);
			
			System.out.printf("New balance: %.2f", account.getBalance());
		} 
		catch (DomainException e) {
			System.out.println(e.getMessage());
		}
			
		
		
		sc.close();
	}

}
