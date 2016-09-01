package drawingpackage;
import csci348.drawings.Drawing;

public class HorizontalLine extends Line{
	
	public HorizontalLine(int startX, int startY, int endX, int endY) {
		super(startX, startY, endX, endY);
	}

	@Override
	public void draw(Drawing draw) {
		for (int i = startX; i <= endX; i++) {
			 draw.showPoint(i, startY);
		}
	}
}
