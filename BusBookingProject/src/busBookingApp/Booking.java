package busBookingApp;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Booking {
	String passengerName;
	int busNo;
	Date dateOfTravel;

	public Booking() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter username:");
		passengerName = sc.next();
		System.out.println("Enter busNo:");
		busNo = sc.nextInt();
		System.out.println("Enter Date:");
		String date = sc.next();
		SimpleDateFormat d = new SimpleDateFormat("dd-MM-yyyy");

		try {
			dateOfTravel = d.parse(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public int getBusNo() {
		return busNo;
	}

	public void setBusNo(int busNo) {
		this.busNo = busNo;
	}

	public Date getDateOfTravel() {
		return dateOfTravel;
	}

	public void setDateOfTravel(Date dateOfTravel) {
		this.dateOfTravel = dateOfTravel;
	}

	boolean isAvailable() throws SQLException {

		BusDAO b = new BusDAO();
		BookingDAO bo = new BookingDAO();
		int capacity = b.getCapacity(busNo);

		int booked = bo.getBookedCount(busNo, dateOfTravel);

		return booked < capacity;
	}

}
