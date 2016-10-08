package drawings2;

import csci348.drawings.Drawing;

public class VerticalLine extends Line {

	public VerticalLine(int startX, int startY, int endX, int endY) {
		super(startX, startY, endX, endY);
	}

	/**
	 * draw shows the points of the VerticalLine on which it is called
	 * 
	 * @param palette
	 *            The Drawing within which the VerticalLine is drawn
	 */
	@Override
	public void draw(Drawing palette) {
		if (startY == endY)
			System.out.println("Can't draw vertical line horizontally--use horizontal line.");
		if (startY < endY) {
			for (int i = startY; i <= endY; i++) {
				palette.showPoint(startX, i);
			}
		} // startY<=endY
		if (startY > endY) {
			for (int i = endY; i <= startY; i++) {
				palette.showPoint(startX, i);
			}
		} // startY > endY
	}// draw

	/**
	 * erase hides the VerticalLine object on which it is called
	 * 
	 * @param palette
	 *            The Drawing within which the VerticalLine is erased
	 */
	public void erase(Drawing palette) {
		if (startY == endY)
			System.out.println("Can't draw vertical line horizontally--use horizontal line.");
		if (startY < endY) {
			for (int i = startY; i <= endY; i++) {
				palette.hidePoint(startX, i);
			}
		} // startY<=endY
		if (startY > endY) {
			for (int i = endY; i <= startY; i++) {
				palette.hidePoint(startX, i);
			}
		} // startY > endY
	}

}// VerticalLine