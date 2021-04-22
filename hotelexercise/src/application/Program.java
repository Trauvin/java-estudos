package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Reservation;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Room number: ");
		int number = sc.nextInt();
		System.out.print("Check-in (dd/MM/yyyy): ");
		Date checkin = sdf.parse(sc.next());
		System.out.print("Check-out (dd/MM/yyyy): ");
		Date checkout = sdf.parse(sc.next());
		
		if (!checkout.after(checkin)) {
			System.out.println("Error in reservation: Check-out data must "
					+ "be after check-in date.");
		}
		else {
			Reservation reservation = new Reservation(number, checkin, checkout);
			System.out.println(reservation);
			
			System.out.println("Updated reservation: ");
			System.out.print("Check-in (dd/MM/yyyy): ");
			checkin = sdf.parse(sc.next());
			System.out.print("Check-out (dd/MM/yyyy): ");
			checkout = sdf.parse(sc.next());
			
			String error = reservation.updateDates(checkin, checkout);
			
			if (error != null ) {
				System.out.println(error);
			}
			else {
				System.out.println("Reservation: " + reservation);
			}
			
			System.out.println(reservation);
		}
		
		
		sc.close();
	}

}
