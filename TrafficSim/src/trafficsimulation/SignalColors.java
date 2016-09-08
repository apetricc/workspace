package trafficsimulation;

public enum SignalColors {
	GREEN_RED, YELLOW_RED, RED_GREEN, RED_YELLOW;
	
	private static SignalColors[] vals = values();
	
	public SignalColors next() {
		return vals[(this.ordinal()+1) % vals.length];
	}
}
