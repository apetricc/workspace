package drawingpackage;
import csci348.drawings.Drawing;

public class VerticalLine extends Line{

	
	public VerticalLine(int startX, int startY, int endX, int endY) {
		super(startX, startY, endX, endY);
	}

	@Override
	public void draw(Drawing draw) {
		if (startY==endY) System.out.println("Can't draw vertical line horizontally--use horizontal line.");
		if (startY<endY) {
			for (int i = startY; i <= endY; i++) {
				draw.showPoint(startX, i);
			}
		}//startY<=endY
		if (startY > endY) {
			for (int i = endY; i <=startY; i++) {
				draw.showPoint(startX, i);
			}
		}//startY > endY
	}
	
}//VerticalLine