package busBookingApp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class BookingDAO {

	public int getBookedCount(int busNo, Date dateOfTravel) throws SQLException {
		// TODO Auto-generated method stub
		String query = "select count(passengerName) from Booking where busNo = ? and dateOfTravel = ?";
		Connection con = DBConnection.getConnection();
		PreparedStatement s = con.prepareStatement(query);
		java.sql.Date sqldate = new java.sql.Date(dateOfTravel.getTime());
		s.setInt(1, busNo);
		s.setDate(2, sqldate);
		ResultSet rs = s.executeQuery();
		rs.next();
		return rs.getInt(1);
	}

	public void addBooking(Booking b) throws SQLException {

		String query = "insert into Booking values(?,?,?)";
		Connection con = DBConnection.getConnection();
		PreparedStatement s = con.prepareStatement(query);
		java.sql.Date sqldate = new java.sql.Date(b.dateOfTravel.getTime());
		s.setString(1, b.passengerName);
		s.setInt(2, b.busNo);
		s.setDate(3, sqldate);
		s.executeUpdate();
		// TODO Auto-generated method stub

	}

}
