package busBookingApp;

import java.sql.SQLException;
import java.util.Scanner;

public class BusBooking {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		BusDAO busdao = new BusDAO();
		busdao.displayBusInfo();

		int useropt = 1;
		Scanner sc = new Scanner(System.in);

		while (useropt == 1) {

			System.out.println("Enter option 1 for booking and 2 to exit");

			useropt = sc.nextInt();
			sc.nextLine();
			if (useropt == 1) {
				Booking b = new Booking();
				if (b.isAvailable()) {
					BookingDAO book = new BookingDAO();
					book.addBooking(b);
					System.out.println("Booking successful");
				} else {
					System.out.println("Bus is fully occupied");
				}

			}

		}

	}

}
