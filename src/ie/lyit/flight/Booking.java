package ie.lyit.flight;

import java.util.ArrayList;

public class Booking {
	Flight outbound;
	Flight inbound;
	ArrayList<Passenger> passengers;
	double totalPrice;
	static int count;
	
	public Booking()
	{
		
	}
	
	public Booking(Flight oF, Flight iF, ArrayList<Passenger> p)
	{
		this.outbound = oF;
		this.inbound = iF;
		this.passengers = p;
	}
	/*
	toString():String
	equals(
	obj
	:
	Object
	):boolean
	findPassenger(
	p
	:Passenger
	):boolean
	calculate
	Price():double*/
}
