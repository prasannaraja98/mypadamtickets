package seat;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import theatre.Theatre;
import theatre.TheatreController;
import theatre.TheatreDao;

import org.springframework.web.bind.annotation.RequestParam;

import java.text.SimpleDateFormat;
import java.util.*;

@Controller
public class SeatController {
	
	String date;
	String time;
	String seats;
	String cost;
	
		@RequestMapping("/masterbooking")
		
		public ModelAndView payment(@RequestParam("date")String date, @RequestParam("time")String time, @RequestParam("seats")String seats) throws Exception{
			Seat seat=new Seat();
			this.date=date;
			this.time=time;
			this.seats=seats;
			
			seat.setDate(date);
			seat.setTime(time);
			seat.setSeats(seats);
			System.out.println(seat.getDate());
			System.out.println(seat.getTime());
			System.out.println(seat.getSeats());
			SeatDao dao=new SeatDao();
			TheatreDao tdao=new TheatreDao();
			ModelAndView model=new ModelAndView();
			if(dao.is_theatre_empty())
			{
				TheatreController theatre = new TheatreController(); // insert query
				theatre.theatreDetails();
				System.out.println("Theatre table is empty :"+ " created table");
			}
			List<Theatre> ls = tdao.theatre_details_display();
			boolean flag=false;
			String total="";
			for(Theatre th:ls) {
				if(th.getMoviename().equals("master") && th.getTime().equals(time)) {
					int seat1=Integer.parseInt(seats);
					int seat2=Integer.parseInt(th.getSeats());
					if(seat1>seat2) {
						System.out.println("Seats not available");
						flag=false;
						break;
						
			           }
					else {
						flag=true;
						System.out.println("in else block");
						int updated_seat_count = seat2 -seat1;
						tdao.update_theatre_seat_count(th, updated_seat_count);
						int cost = Integer.parseInt(th.getCost());
						int total_cost = cost *Integer.parseInt(seats);
						 total = String.valueOf(total_cost);
						 this.cost=total;
						seat.setCost(total);
						//user ticket booking details stored in seatdb
						new SeatDao().seat_table(seat);
						break;
					}
				}
			}
			if(flag)
			{
				model = new ModelAndView("payment");
				model.addObject("cost",cost);
				model.addObject("date",date);
				model.addObject("time",time);
				model.addObject("seats",seats);
				
			}
			else
			{
				model = new ModelAndView("seats");
				
			}
			return model;
		}

		@RequestMapping("/zillabooking.html")
		
		public ModelAndView zillapayment(@RequestParam("date")String date, @RequestParam("time")String time, @RequestParam("seats")String seats) {
			this.date=date;
			this.time=time;
			this.seats=seats;
			Seat seat=new Seat();
			seat.setDate(date);
			seat.setTime(time);
			seat.setSeats(seats);
			String seat5=seats;
			System.out.println(seat.getDate());
			System.out.println(seat.getTime());
			System.out.println(seat.getSeats());
			SeatDao dao=new SeatDao();
			TheatreDao tdao=new TheatreDao();
			ModelAndView model=new ModelAndView();
			if(dao.is_theatre_empty())
			{
				TheatreController theatre = new TheatreController(); // insert query
				theatre.theatreDetails();
				System.out.println("Theatre table is empty :"+ " created table");
			}
			List<Theatre> ls = tdao.theatre_details_display();
			boolean flag=false;
			for(Theatre th:ls) {
				if(th.getMoviename().equals("kong vs godzilla") && th.getTime().equals(time)) {
					int seat1=Integer.parseInt(seat5);
					int seat2=Integer.parseInt(th.getSeats());
					if(seat1>seat2) {
						System.out.println("Seats not available");
						flag=false;
						break;
						
			           }
					else {
						flag=true;
						System.out.println("in else block");
						int updated_seat_count = seat2 -seat1;
						tdao.update_theatre_seat_count(th, updated_seat_count);
						int cost = Integer.parseInt(th.getCost());
						int total_cost = cost *Integer.parseInt(seat5);
						
						String total = String.valueOf(total_cost);
						this.cost=total;
						seat.setCost(total);
						//user ticket booking details stored in seatdb
						new SeatDao().seat_table(seat);
						break;
					}
				}
			}
			if(flag)
			{
				model = new ModelAndView("payment");
				model.addObject("cost",cost);
				model.addObject("date",date);
				model.addObject("time",time);
				model.addObject("seats",seats);
			}
			else
			{
				model = new ModelAndView("seats");
			}
			return model;
		}


	@RequestMapping("/mangathabooking.html")
		
		public ModelAndView mangathapayment(@RequestParam("date")String date, @RequestParam("time")String time, @RequestParam("seats")String seats) {
		
		this.date=date;
		this.time=time;
		this.seats=seats;
		Seat seat=new Seat();
	
		seat.setDate(date);
		seat.setTime(time);
		seat.setSeats(seats);
		System.out.println(seat.getDate());
		System.out.println(seat.getTime());
		System.out.println(seat.getSeats());
		SeatDao dao=new SeatDao();
		TheatreDao tdao=new TheatreDao();
		ModelAndView model=new ModelAndView();
		if(dao.is_theatre_empty())
		{
			TheatreController theatre = new TheatreController(); // insert query
			theatre.theatreDetails();
			System.out.println("Theatre table is empty :"+ " created table");
		}
		List<Theatre> ls = tdao.theatre_details_display();
		boolean flag=false;
		for(Theatre th:ls) {
			if(th.getMoviename().equals("mangatha") && th.getTime().equals(time)) {
				int seat1=Integer.parseInt(seats);
				int seat2=Integer.parseInt(th.getSeats());
				if(seat1>seat2) {
					System.out.println("Seats not available");
					flag=false;
					break;
					
		           }
				else {
					flag=true;
					System.out.println("in else block");
					int updated_seat_count = seat2 -seat1;
					tdao.update_theatre_seat_count(th, updated_seat_count);
					int cost = Integer.parseInt(th.getCost());
					int total_cost = cost *Integer.parseInt(seats);
					String total = String.valueOf(total_cost);
					this.cost=total;
					seat.setCost(total);
					//user ticket booking details stored in seatdb
					new SeatDao().seat_table(seat);
					break;
				}
			}
		}
		if(flag)
		{
			model = new ModelAndView("payment");
			model.addObject("cost",cost);
			model.addObject("date",date);
			model.addObject("time",time);
			model.addObject("seats",seats);
		}
		else
		{
			model = new ModelAndView("seats");
		}
		return model;
			}

	@RequestMapping("/sooraraipotrubooking.html")
	
	public ModelAndView sooraraipotrupayment(@RequestParam("date")String date, @RequestParam("time")String time, @RequestParam("seats")String seats) {
		this.date=date;
		this.time=time;
		this.seats=seats;
		Seat seat=new Seat();
	
		seat.setDate(date);
		seat.setTime(time);
		seat.setSeats(seats);
		System.out.println(seat.getDate());
		System.out.println(seat.getTime());
		System.out.println(seat.getSeats());
		SeatDao dao=new SeatDao();
		TheatreDao tdao=new TheatreDao();
		ModelAndView model=new ModelAndView();
		if(dao.is_theatre_empty())
		{
			TheatreController theatre = new TheatreController(); // insert query
			theatre.theatreDetails();
			System.out.println("Theatre table is empty :"+ " created table");
		}
		List<Theatre> ls = tdao.theatre_details_display();
		boolean flag=false;
		for(Theatre th:ls) {
			if(th.getMoviename().equals("soorarai potru") && th.getTime().equals(time)) {
				int seat1=Integer.parseInt(seats);
				int seat2=Integer.parseInt(th.getSeats());
				if(seat1>seat2) {
					System.out.println("Seats not available");
					flag=false;
					break;
					
		           }
				else {
					flag=true;
					System.out.println("in else block");
					int updated_seat_count = seat2 -seat1;
					tdao.update_theatre_seat_count(th, updated_seat_count);
					int cost = Integer.parseInt(th.getCost());
					int total_cost = cost *Integer.parseInt(seats);
					String total = String.valueOf(total_cost);
					this.cost=total;
					seat.setCost(total);
					//user ticket booking details stored in seatdb
					new SeatDao().seat_table(seat);
					break;
				}
			}
		}
		if(flag)
		{
			model = new ModelAndView("payment");
			model.addObject("cost",cost);
			model.addObject("date",date);
			model.addObject("time",time);
			model.addObject("seats",seats);
		}
		else
		{
			model = new ModelAndView("seats");
		}
		return model;
	}
	
	
		@RequestMapping("/ticketgeneration")
	public ModelAndView ticket() {
ModelAndView model=new ModelAndView("ticketgeneration");
		model.addObject("date",date);
		model.addObject("time",time);
		model.addObject("seats",seats);
		model.addObject("cost",cost);
		System.out.println("data entered");
	System.out.println(date+time+seats+cost);
		
			
			return model;
		}
	}

