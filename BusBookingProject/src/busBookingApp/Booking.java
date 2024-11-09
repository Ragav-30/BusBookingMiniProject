package busBookingApp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
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

	boolean isAvailable(ArrayList<Bus> buses, ArrayList<Booking> bookings) {
		int capacity = 0;
		for (Bus b : buses) {
			if (b.getBusNo() == busNo) {
				capacity = b.getCapacity();
			}
		}
		int booked = 0;
		for (Booking b : bookings) {
			if (b.busNo == busNo && b.dateOfTravel.equals(dateOfTravel)) {
				booked++;
			}
		}
		return booked < capacity;
	}

}
