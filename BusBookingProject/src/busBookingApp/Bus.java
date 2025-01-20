package busBookingApp;

public class Bus {
	int busNo;
	boolean AC;
	int capacity;

	public Bus(int busNo, boolean aC, int capacity) {

		this.busNo = busNo;
		AC = aC;
		this.capacity = capacity;
	}

	public int getBusNo() {
		return busNo;
	}

	public void setBusNo(int busNo) {
		this.busNo = busNo;
	}

	public boolean isAC() {
		return AC;
	}

	public void setAC(boolean aC) {
		AC = aC;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

}
