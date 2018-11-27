package ie.lyit.flight;

import java.util.ArrayList;

public class Booking {
	private Flight outbound;
	private Flight inbound;
	private ArrayList<Passenger> passengers;
	private double totalPrice;
	static int count;
	
	///CONSTRUCTORS
	public Booking()
	{
		
	}
	
	public Booking(Flight oF, Flight iF, ArrayList<Passenger> p)
	{
		this.outbound = oF;
		this.inbound = iF;
		this.passengers = p;
	}
	
	
	///GETTER/SETTERS
	public void setOutbound(Flight oF){this.outbound = oF;}
	
	public Flight getOutbound(){return this.outbound;}
	
	public void setInbound(Flight iF){this.inbound = iF;}
	
	public Flight getInbound(){return this.inbound;}
	
	public void setPassengers(ArrayList<Passenger> p){this.passengers = p;}
	
	public ArrayList<Passenger> getPassengers(){return this.passengers;}
	
	public double getTotalPrice(){return this.totalPrice;}
	
	public void setTotalPrice(){this.totalPrice=this.calculatePrice();}
	
	
	
	///SPECIFIC METHODS
	@Override
	public String toString()
	{
		return ("Booking flight from "+inbound.toString()+" to "+inbound.toString()+" Price: "+totalPrice);
	}
	
	@Override
	public boolean equals(Object obj){
	   Booking pObject;
	   if (obj instanceof Booking)
		   pObject = (Booking)obj;
	   else
	       return false;
	 
	   return super.equals(pObject)
	          && this.inbound == pObject.inbound
	          && this.outbound == pObject.outbound;
	}
	
	public boolean findPassenger(Passenger p)
	{
		for (Passenger tempP : this.passengers)
			if(tempP.equals(p)) return true;
		return false;
	}

	private double calculatePrice()
	{
		return (outbound.getPrice()+inbound.getPrice())*count;
	}
}
