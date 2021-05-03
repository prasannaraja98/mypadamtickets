package theatre;

public class Theatre {
private int tid;
private String moviename;

private String time;
private String seats;
private String cost;

public String getCost() {
	return cost;
}
public void setCost(String cost) {
	this.cost = cost;
}
public int getTid() {
	return tid;
}
public void setTid(int tid) {
	this.tid = tid;
}
public String getMoviename() {
	return moviename;
}
public void setMoviename(String moviename) {
	this.moviename = moviename;
}

public String getTime() {
	return time;
}
public void setTime(String time) {
	this.time = time;
}
public String getSeats() {
	return seats;
}
public void setSeats(String seats) {
	this.seats = seats;
}

}
