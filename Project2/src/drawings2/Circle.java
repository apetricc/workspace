package drawings2;
import csci348.drawings.*;
public class Circle extends SimpleDrawProgram{
	public Circle(int startX, int startY, int radius) {
		super();
		this.startX = startX;
		this.startY = startY;
		this.radius = radius;
	}


	private int startX;
	private int startY;
	private int radius;
	int x;
	int y;	
	
	public void drawCircle(SimpleDrawing palette) {
		int midX = startX + radius;
		int midY = startY + radius;
		for (int i = startX; i < startX+(2*radius); i++) {
			for (int j=startY; j< startY+(2*radius); j++) {
				//a^2 + b^2 == c^2
				int a=(midX-i);
				int b=(midY-j);
				double c=Math.sqrt((Math.pow(a, 2)+Math.pow(b, 2)));
				 if(c<=radius&&c>radius-1){
					 palette.showPoint(i,j);
				}
			}
		}
	}

}
