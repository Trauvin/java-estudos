package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.LegalEntity;
import entities.Person;
import entities.PhisicalPerson;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Person> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		
		for (int i=0; i<n; i++) {
			System.out.print("Tax Payer #" + (i+1) + ": ");
			System.out.print("Individual or Company (i/c)? ");
			char resp = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Annual income: ");
			double annualIncome = sc.nextDouble();
			
			switch(resp) {
			
				case 'i':
					System.out.print("Health expenditures: ");
					double health = sc.nextDouble();
					
					list.add(new PhisicalPerson(name, annualIncome, health));
					break;
					
				case 'c':
					System.out.print("Number of employees: ");
					int employees = sc.nextInt();
					
					list.add(new LegalEntity(name, annualIncome, employees));
					break;
					
				default:
					System.out.println("Command not found!");
					
			}
			
			System.out.println();
		}
		

		System.out.println("TAXES PAID: ");
		for (Person p : list) {
			System.out.println(p.getName() + ": $ " + String.format("%.2f" ,p.calcTax()));
		}
		
		double sum = 0.0;
		for (Person person : list) {
			sum += person.calcTax();
		}
		
		System.out.println();
		System.out.println("TOTAL TAXES: " + String.format("%.2f", sum));
		
		sc.close();
	}

}
