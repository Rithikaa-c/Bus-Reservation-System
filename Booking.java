package BusResv;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class Booking {
	String passengerName;
	int busNo;
	Date date;
	Booking(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter passenger name: ");
		passengerName=sc.nextLine();
		System.out.println("Enter bus no: ");
		busNo=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter date(dd-mm-yyyy): ");
		String dateInput=sc.nextLine();
		SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
		try {
			date=dateFormat.parse(dateInput);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public boolean isAvailable(ArrayList<Booking>bookings,ArrayList<Bus>buses){
		int capacity=0;
		for(Bus bus:buses) {
			if(bus.getbusNo()==busNo) {
				capacity=bus.getCapacity();
			}
		}
		int booked=0;
		for(Booking b:bookings) {
			if(b.busNo==busNo && b.date.equals(date)) {
				booked++;
			}
		}
		return booked<capacity ?true:false;
	}
}
