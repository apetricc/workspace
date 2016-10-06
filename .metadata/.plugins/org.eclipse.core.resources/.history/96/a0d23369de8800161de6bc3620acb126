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

	/**
	 * draw shows the points of the Line object in the Drawing passed as a
	 * parameter
	 * 
	 * @param palette
	 *            The Drawing object that the line will be shown in.
	 */
	public void draw(Drawing palette) {
		double m = (endY - startY) / (endX - startX);
		if (startX <= endX) {
			for (int i = startX; i < endX; i += 1) {
				// draw.showPoint(i, i*m);
				for (int j = startY; j < endY; j += 1) {
					Double d = j / m;
					Integer intVal = (d).intValue();
					palette.showPoint(intVal, j);
				} // for j
			} // for i
		}
		if (startX > endX) {
			for (int i = endX; i < startX; i++) {
				for (int j = startY; j < endY; j++) {
					Double d = j / m;
					Integer intVal = (d).intValue();
					palette.showPoint(intVal, j);
				}
			}
		}
	}// draw

}
