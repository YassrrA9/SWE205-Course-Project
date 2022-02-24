package sample;



public class Reservation extends Car{
	private int[] number;
	private int duration;
	private Car car;
	private double price;

	
	public Reservation(){
		
	}
	
	public Reservation(int[] number, int duration, Car car, double price) {
		this.number = number;
		this.duration = duration;
		this.car = car;
		this.price = price;
	}
	
	public void deleteReservation(String numReserv) {
		numReserv=null;
	}
	
	public void editReservation(Reservation resv) {
		
	}
	
	public boolean isvalid() {
		return true;
	}
	
	public void preOrder() {
		
	}
}
