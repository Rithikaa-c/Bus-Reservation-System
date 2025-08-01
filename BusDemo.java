package BusResv;
import java.util.*;
import java.util.ArrayList;
public class BusDemo {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Bus> buses=new ArrayList<Bus>();
		ArrayList<Booking> bookings=new ArrayList<Booking>();
		buses.add(new Bus(1,true,2));
		buses.add(new Bus(2,false,45));
		buses.add(new Bus(3,true,60));
		for(Bus b: buses) {
		b.displayBusInfo();	
		}
		int userOpt=1;
		while(userOpt==1){
			System.out.println("Enter 1 to book and 2 to exit");
			userOpt=sc.nextInt();
			if(userOpt==2) {
				System.out.println("Thank you...");
			}
			if(userOpt==1) {
				Booking booking=new Booking();
				if(booking.isAvailable(bookings,buses)) {
					bookings.add(booking);
					System.out.println("Your bookings is confirmed");
				}else {
					System.out.println("Sorry bus is full, try another bus or date");
				}
			}
		}
		
		
	}
}
