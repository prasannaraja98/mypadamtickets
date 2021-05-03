package theatre;
import java.util.*;
public class TheatreController {
	
	public void theatreDetails() {
		
		ArrayList<Theatre> th = new ArrayList<Theatre>();
		Theatre th1 = new Theatre();
		th1.setMoviename("master");
		th1.setTime("9:00 AM");
		th1.setSeats("50");
		th1.setCost("120");
		th.add(th1);
		
		Theatre th2 = new Theatre();
		th2.setMoviename("master");
		th2.setTime("2:00 PM");
		th2.setSeats("30");
		th2.setCost("120");
		th.add(th2);
		
		Theatre th3 = new Theatre();
		th3.setMoviename("master");
		th3.setTime("6:00 PM");
		th3.setSeats("40");
		th3.setCost("120");
		th.add(th3);
		
		Theatre th4 = new Theatre();
		th4.setMoviename("master");
		th4.setTime("9:00 PM");
		th4.setSeats("28");
		th4.setCost("120");
		th.add(th4);
		
		Theatre th5 = new Theatre();
		th5.setMoviename("mangatha");
		th5.setTime("9:00 AM");
		th5.setSeats("28");
		th5.setCost("90");
		th.add(th5);
		
		Theatre th6 = new Theatre();
		th6.setMoviename("mangatha");
		th6.setTime("2:00 PM");
		th6.setSeats("20");
		th6.setCost("90");
		th.add(th6);
	
		Theatre th7 = new Theatre();
		th7.setMoviename("mangatha");
		th7.setTime("6:00 PM");
		th7.setSeats("21");
		th7.setCost("90");

		th.add(th7);
		
		Theatre th8 = new Theatre();
		th8.setMoviename("mangatha");
		th8.setTime("9:00 PM");
		th8.setSeats("20");
		th8.setCost("90");

		th.add(th8);
		
		Theatre th9 = new Theatre();
		th9.setMoviename("soorarai potru");
		th9.setTime("9:00 AM");
		th9.setSeats("22");
		th9.setCost("150");
		th.add(th9);
		
		Theatre th10 = new Theatre();
		th10.setMoviename("soorarai potru");
		th10.setTime("2:00 PM");
		th10.setSeats("23");
		th10.setCost("150");
		th.add(th10);
		
		Theatre th11 = new Theatre();
		th11.setMoviename("soorarai potru");
		th11.setTime("6:00 PM");
		th11.setSeats("45");
		th11.setCost("150");
		
		th.add(th11);
		
		Theatre th12 = new Theatre();
		th12.setMoviename("soorarai potru");
		th12.setTime("9:00 PM");
		th12.setSeats("25");
		th12.setCost("150");
		
		th.add(th12);
		
		Theatre th13 = new Theatre();
		th13.setMoviename("kong vs godzilla");
		th13.setTime("9:00 AM");
		th13.setSeats("50");
		th13.setCost("135");
		th.add(th13);
	
		Theatre th14 = new Theatre();
		th14.setMoviename("kong vs godzilla");
		th14.setTime("2:00 PM");
		th14.setSeats("60");
		th14.setCost("135");
		th.add(th14);
		
		Theatre th15 = new Theatre();
		th15.setMoviename("kong vs godzilla");
		th15.setTime("6:00 PM");
		th15.setSeats("50");
		th15.setCost("135");
		th.add(th15);
	
		Theatre th16 = new Theatre();
		th16.setMoviename("kong vs godzilla");
		th16.setTime("9:00 PM");
		th16.setSeats("53");
		th16.setCost("135");
		th.add(th16);
	
	
	
	TheatreDao theatre = new TheatreDao();
	theatre.insert_theatre_db(th);
	
	
		
	
	}

}
