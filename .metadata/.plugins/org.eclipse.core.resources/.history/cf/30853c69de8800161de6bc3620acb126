package drawingpackage;

import csci348.drawings.Drawing;

public class HorizontalLine extends Line {

	public HorizontalLine(int startX, int startY, int endX, int endY) {
		super(startX, startY, endX, endY);
	}

	/**
	 * draw shows the points of the HorizontalLine on which it is called
	 * 
	 * @param palette
	 *            The Drawing within which the HorizontalLine is drawn
	 */
	@Override
	public void draw(Drawing palette) {
		if (startX == endX)
			System.out.println("Can't draw horizontal line vertically--use vertical line.");
		if (startX < endX) {
			for (int i = startX; i <= endX; i++) {
				palette.showPoint(i, startY);
			}
		} // startX < endX
		if (startX > endX) {
			for (int i = endX; i <= startX; i++) {
				palette.showPoint(i, startY);
			}
		} // startX > endX
	}// draw

	/**
	 * erase hides the points of the HorizontalLine on which it is called
	 * 
	 * @param palette
	 *            The Drawing within which the HorizontalLine is erased
	 */
	public void erase(Drawing palette) {
		if (startX == endX)
			System.out.println("Can't draw horizontal line vertically--use vertical line.");
		if (startX < endX) {
			for (int i = startX; i <= endX; i++) {
				palette.hidePoint(i, startY);
			}
		} // startX < endX
		if (startX > endX) {
			for (int i = endX; i <= startX; i++) {
				palette.hidePoint(i, startY);
			}
		} // startX > endX
	}
}// HorizontalLine
