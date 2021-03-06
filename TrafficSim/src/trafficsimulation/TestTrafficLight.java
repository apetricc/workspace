package trafficsimulation;

import static org.junit.Assert.*;

import org.junit.Test;

import org.junit.Test;
import org.junit.Before;

public class TestTrafficLight {

	private static final int DEFAULT_GREEN_TIMING = 30;
	private static final int DEFAULT_YELLOW_TIMING = 5;
	private static final int DEFAULT_RED_TIMING = 35;
	
	TrafficLight tLight01;
	
	@Before
	public void setUp() {
		//making the object first 
		tLight01 = new TrafficLight(DEFAULT_GREEN_TIMING, DEFAULT_YELLOW_TIMING, DEFAULT_RED_TIMING);
	}
	
	@Test
	public void testMakeTrafficLight() {
		
		assertEquals(DEFAULT_GREEN_TIMING, tLight01.getGreenTiming());
		assertEquals(DEFAULT_YELLOW_TIMING, tLight01.getYellowTiming());
		assertEquals(DEFAULT_RED_TIMING, tLight01.getRedTiming());
		assertEquals(TrafficLight.GREEN, tLight01.getMainSignalColor());
	}

	@Test
	public void testChangeTimings() {
		tLight01.setGreenTiming(18);
		tLight01.setYellowTiming(7);
		tLight01.setRedTiming(21);
		assertEquals(18, tLight01.getGreenTiming());
		assertEquals(7, tLight01.getYellowTiming());
		assertEquals(21, tLight01.getRedTiming());
	}
	
	
	@Test
	public void testChangeSignal() {
		tLight01.changeSignal();
		assertEquals(TrafficLight.YELLOW, tLight01.getMainSignalColor());
		
		tLight01.changeSignal();
		assertEquals(TrafficLight.RED, tLight01.getMainSignalColor());
		
		tLight01.changeSignal();
		assertEquals(TrafficLight.GREEN,tLight01.getMainSignalColor());
		
		
		
	}
	
	
	
}//class TestTrafficLight
