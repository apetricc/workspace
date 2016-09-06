package drawingpackage;

import csci348.drawings.Drawing;

public class Line extends DrawProgram {
	protected final int startX;
	protected final int startY;
	protected final int endX;
	protected final int endY;

	public Line(int startX, int startY, int endX, int endY) {
		this.startX = startX;
		this.startY = startY;
		this.endX = endX;
		this.endY = endY;
	}

	// I have a feeling this will need to use slope intercept form somehow, y =
	// mx + b
	// m = (y2 - y1)/(x2-x1)
	/**
	 * super.paintComponent(g);
	 * 
	 * int linesToDraw = 15; int width = getWidth(); int height = getHeight();
	 * int number, y, x, dy, dx; x = 0; y = height; number = 15; dx = width /
	 * number; dy = height / number; for( int i = 1; i < number; i++ ) { x +=
	 * dx; y -= dy; g.drawLine( 0, 0, y, x );
	 * 
	 * @param draw
	 */

	public void draw(Drawing draw) {
		double width = Math.abs(endX - startX);
		double height = Math.abs(endY - startY);
		double m = (endY - startY) / (endX - startX);
		double dx = m / width;
		double dy = m / height;
		if (startX <= endX) {
			for (int i = startX; i < endX; i += 1) {
				// draw.showPoint(i, i*m);
				for (int j = startY; j < endY; j += 1) {
					Double d = j / m;
					Integer intVal = (d).intValue();
					draw.showPoint(intVal, j);
				} // for j
			} // for i
		}
		if (startX > endX) {
			for (int i = endX; i < startX; i++) {
				for (int j = startY; j < endY; j++) {
					Double d = j / m;
					Integer intVal = (d).intValue();
					draw.showPoint(intVal, j);
				}
			}
		}
	}// draw

	public void erase() {

	}

}
