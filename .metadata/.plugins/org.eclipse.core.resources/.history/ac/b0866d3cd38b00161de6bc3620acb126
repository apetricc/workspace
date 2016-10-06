package drawings2;
import csci348.drawings.*;
public class DiagonalLine extends Line{

	public DiagonalLine(int startX, int startY, int endX, int endY) {
		super(startX, startY, endX, endY);
	}
	int length = Math.abs(endX - startX);
	//@Override
	public void drawDown(SimpleDrawing palette) {
		for (int i = startX; i < endX; i++) {
			palette.showPoint(i, i);
		}
	}// drawDown
	
	public void drawUp(SimpleDrawing palette) {
		int y;
		int x;
		for (int i = startX; i < endX; i++) {
				x = i;
				y = startY - i;
				palette.showPoint(i, startY-i);
				System.out.println("X is: " + x + " and Y is: " + y);
			}
	}// drawUp
//	public void drawUp(SimpleDrawing palette) {
//		
//		for (int i = startX; i < startX+length; i++) {
//				palette.showPoint(i, startY-i);
//			}
//	}// drawUp	
//	
}
