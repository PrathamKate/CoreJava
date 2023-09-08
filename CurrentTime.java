package comm.tns.time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
 
public class CurrentTime {

	public static void main(String[] args) {
		LocalDate Date=LocalDate.now();
		LocalTime Time=LocalTime.now();
		LocalDateTime DateTime=LocalDateTime.now();
		DateTimeFormatter DateTime2=DateTimeFormatter.ofPattern("dd-MM-yy HH:mm:ss");
		String Formate=DateTime.format(DateTime2);
		
		
		System.out.println("Only Time");
		System.out.println(Time);//(hr/mn/sc/ns)
		System.out.println("\nOnly Date");
		System.out.println(Date);//(yyyy/mm/dd)
		System.out.println("\nBoth Time And Date");
		System.out.println(DateTime);//(yyyy/mm/dd/hr/mn/sc/ns)
		System.out.println("\nAfter Formatting");
		System.out.println(Formate);
		
	}

}
