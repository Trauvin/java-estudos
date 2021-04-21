package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourceEmploye;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		
		List <Employee> emp = new ArrayList<>();
		
		
		for (int i=0; i<n; i++) {
			System.out.println("Employee #" + (i+1) + " data:");
			System.out.print("Outsourced: (y/n)? ");
			char response = sc.next().charAt(0);
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double valueHour = sc.nextDouble();
			
			if (response == 'y') {

				System.out.print("Additional charge: ");
				double aditional = sc.nextDouble();
				
				emp.add(new OutsourceEmploye(name, hours, valueHour, aditional));
			}
			else {
				emp.add(new Employee(name, hours, valueHour));
			}
		}
		
		System.out.println();
		System.out.println("PAYMENTS:");
		
		for (Employee e : emp) {
			
			System.out.println(e);
			
		}
		
		
		
	
		
//		Employee emp = new Employee("Rodrigo", 50, 20.0);
//		System.out.println(emp.payment());
//		
//		Employee emp_t = new OutsourceEmploye("Alex", 100, 15.00, 200.00);
//		System.out.println(emp_t.payment());
		
		sc.close();
		
	}

}
