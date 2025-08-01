package BusResv;

public class Bus {
	private int busNo;
	private boolean ac;
	private int capacity;
	Bus(int no,boolean ac,int cap){
		this.busNo=no;
		this.ac=ac;
		this.capacity=cap;
	}
	public int getbusNo() {
		return busNo;
	}
	public boolean isAc() {
		return ac;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapcity(int cap) {
		capacity=cap;
	}
	
	public void setAc(boolean val) {
		ac=val;
	}
	public void displayBusInfo() {
		System.out.println("Bus No: "+busNo+" Total Capacity: "+capacity+" Ac: "+ac);
	}
}
