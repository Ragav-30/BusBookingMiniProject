package busBookingApp;

import java.util.ArrayList;
import java.util.Scanner;

public class BusBooking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Bus> buses = new ArrayList<Bus>();
		ArrayList<Booking> bookings = new ArrayList<Booking>();

		buses.add(new Bus(1, true, 15));
		buses.add(new Bus(2, true, 10));
		buses.add(new Bus(3, false, 15));
		int useropt = 1;
		Scanner sc = new Scanner(System.in);

		for (Bus bus : buses) {
			bus.displayBusInfo();
		}

		while (useropt == 1) {

			System.out.println("Enter option 1 for booking and 2 to exit");

			useropt = sc.nextInt();
			sc.nextLine();
			if (useropt == 1) {
				Booking b = new Booking();
				if (b.isAvailable(buses, bookings)) {
					bookings.add(b);
					System.out.println("Booking successful");
				} else {
					System.out.println("Bus is fully occupied");
				}

			}

		}

	}

}
