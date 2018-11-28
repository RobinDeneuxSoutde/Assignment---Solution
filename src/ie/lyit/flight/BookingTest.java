package ie.lyit.flight;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class BookingTest {
	private Booking b1;
	private Booking b2;
	private Flight f1;
	private Flight f2;
	private Flight f3;
	private Passenger p1;
	private Passenger p2;
	private ArrayList<Passenger> pS;

	@Before
	public void setUp() throws Exception {

		f1 = new Flight("AA01", "DUB", "LYS", 25, 12, 2018, 12, 40, 100.0);
		f2 = new Flight("AA02", "DUB", "LYS", 25, 12, 2018, 12, 40, 25.0);
		f3 = new Flight("AA03", "DUB", "LYS", 25, 12, 2018, 12, 40, 30.0);
		p1 = new Passenger("Mr", "Jane", "Doe", 25, 12, 1985, 2, true);
		p2 = new Passenger("Mr", "John", "Doe", 25, 12, 1985, 2, true);
		pS = new ArrayList<Passenger>();
		pS.add(p1);
		pS.add(p2);
		b1 = new Booking();
		b2 = new Booking(f1,f2,pS);
	}

	@Test
	public void testBookingFlightFlightArrayListOfPassenger() {
		assertEquals("Constructor not working",f1,b2.getOutbound());
		assertEquals("Constructor not working",f2,b2.getInbound());
	}

	@Test
	public void testSetOutbound() {
		b1.setOutbound(f3);
		assertEquals("SetOutbound not working",b1.getOutbound(),f3);
	}

	@Test
	public void testSetInbound() {
		b1.setInbound(f3);
		assertEquals("SetInbound not working",b1.getInbound(),f3);
	}

	@Test
	public void testSetPassengers() {
		b1.setPassengers(pS);
		assertEquals("SetPassengers not working",b1.getPassengers(),pS);
	}
	
	@Test
	public void testCalculatePrice() {
		b2.setOutbound(f3);
		assertEquals("CalculatePrice not working",b2.calculatePrice(),110.00,0.0);
	}

	@Test
	public void testSetTotalPrice() {
		b2.setTotalPrice();
		assertEquals("SetTotalPrice not working",250.00, b2.getTotalPrice(),0.0);
	}

	@Test
	public void testToString() {
		String result =  "Booking Inbound flight:AA02 Outbound:AA02";
		assertEquals("ToString not working",result, b2.toString());
	}

	@Test
	public void testFindPassenger() {
		assertEquals(b1.findPassenger(p1),false);
		assertEquals(b2.findPassenger(p1),true);
		assertEquals(b2.findPassenger(p2),true);
	}



}
