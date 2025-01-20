package busBookingApp;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BusDAO {

	public void displayBusInfo() throws SQLException {
		// TODO Auto-gnerated method stub
		String query = "select * from Bus";
		Connection con = DBConnection.getConnection();
		Statement s = con.createStatement();
		ResultSet r = s.executeQuery(query);
		while (r.next()) {
			System.out.println("Bus No :" + r.getInt(1));
			if (r.getInt(2) == 0) {
				System.out.println("AC: No");
			} else {
				System.out.println("AC: Yes");
			}
			System.out.println("Bus Capacity :" + r.getInt(3));
		}
		System.out.println("-------------------------------------------------------------");
	}

	public int getCapacity(int busNo) throws SQLException {
		// TODO Auto-generated method stub
		String query = "Select capacity from Bus where busNo=" + busNo;
		Connection con = DBConnection.getConnection();
		Statement s = con.createStatement();
		ResultSet r = s.executeQuery(query);
		r.next();
		return r.getInt(1);
	}

}
