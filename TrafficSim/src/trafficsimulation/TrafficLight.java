package trafficsimulation;

public class TrafficLight {

	public static final int GREEN = 0;
	public static final int YELLOW = 1;
	public static final int RED = 2;
	private int greenTiming;
	private int yellowTiming;
	private int redTiming;
	private int signalColor;
		
	public TrafficLight(int greenTiming, int yellowTiming, int redTiming) {
		this.greenTiming = greenTiming;
		this.yellowTiming = yellowTiming;
		this.redTiming = redTiming;
		signalColor = GREEN;
	}

	public int getGreenTiming() {
		return greenTiming;
	}

	public int getYellowTiming() {
		return yellowTiming;
	}

	public int getRedTiming() {
		return redTiming;
	}

	public void setGreenTiming(int greenTiming) {
		this.greenTiming = greenTiming;
		
	}

	public void setYellowTiming(int yellowTiming) {
		this.yellowTiming = yellowTiming;
		
	}

	public void setRedTiming(int redTiming) {
		this.redTiming = redTiming;
		
	}

	public void changeSignal() {
		switch (signalColor) {
		case GREEN:
			signalColor = YELLOW;
			break;
		case YELLOW:
			signalColor = RED;
			break;
		case RED:
			signalColor = GREEN;
			break;

		}
	}
	
	public int getMainSignalColor() {
		return signalColor;
	}

	public Object getSideSignalColor() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
