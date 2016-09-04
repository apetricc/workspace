package drawingpackage;
import csci348.drawings.Drawing;

public class HorizontalLine extends Line{
	
	public HorizontalLine(int startX, int startY, int endX, int endY) {
		super(startX, startY, endX, endY);
	}

	@Override
	public void draw(Drawing draw) {
		if (startX == endX) System.out.println("Can't draw horizontal line vertically--use vertical line.");
		if (startX < endX) {
			for (int i = startX; i <= endX; i++) {
				 draw.showPoint(i, startY);
			}
		}//startX < endX
		if (startX > endX) {
			for (int i = endX; i <= startX; i++) {
				draw.showPoint(i, startY);
			}
		}//startX > endX
	}//draw
}//HorizontalLine
