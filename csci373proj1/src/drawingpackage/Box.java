package drawingpackage;

import csci348.drawings.Drawing;

public class Box extends DrawProgram{

	
	private int startX;
	private int startY;
	private int height;
	private int width;
	private String title;
	
	
	
	public Box(int startX, int startY,int width, int height) {
		this.startX = startX;
		this.startY = startY;
		this.width = width;
		this.height = height;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String newTitle) {
		this.title = newTitle;
	}
	
	public int getX() {
		return startX;
	}

	public void setStartX(int startX) {
		this.startX = startX;
	}

	public int getY() {
		return startY;
	}

	public void setStartY(int startY) {
		this.startY = startY;
	}
	//public HorizontalLine(int startX, int startY, int endX, int endY)
	//public Box(int startX, int startY,int width, int height)
	public void draw(Drawing box) {
		HorizontalLine hLine1 = new HorizontalLine(startX, startY, startX + width, startY);
		HorizontalLine hLine2 = new HorizontalLine(startX, startY+height, startX + width, startY + height);
		hLine1.draw(box);
		hLine2.draw(box);
		//		VerticalLine vLine1 = new VerticalLine(startX, startY, endX, endY);
		VerticalLine vLine1 = new VerticalLine(startX, startY, startX, startY + height);
		VerticalLine vLine2 = new VerticalLine(startX + width, startY, startX+width, startY + height);
		vLine1.draw(box);
		vLine2.draw(box);
	}
	
	public void connectBoxes(Box box2, Drawing draw) {
		boolean horizontallyAdjacent = (this.startY == box2.startY);
		boolean verticallyAdjacent = (this.startX == box2.startX);
		boolean box1IsAbove = (this.startY < box2.startY);
		boolean box1IsLeft = (this.startX < box2.startX);
		boolean box1IsRight = (this.startX > box2.startX);
		boolean box1IsBelow = (this.startY > box2.startY);

		if (box1IsLeft && horizontallyAdjacent) left(box2, draw);
		if (box1IsAbove && verticallyAdjacent) above(box2, draw);
		if (box1IsBelow && verticallyAdjacent) below(box2, draw);
		if (box1IsRight && horizontallyAdjacent) right(box2, draw);
		if (box1IsLeft && box1IsAbove) leftAndAbove(box2, draw);
		if (box1IsLeft && box1IsBelow) leftAndBelow(box2, draw);
				
		if (box1IsRight && box1IsAbove) rightAndAbove(box2, draw);
		if (box1IsRight && box1IsBelow) rightAndBelow(box2, draw);
		
	}//connectBoxes
private void rightAndBelow(Box box2, Drawing draw) {
	int xConnect1 = this.startX;
	int yConnect1 = this.startY + this.height/2;
	int xConnect2 = box2.startX + box2.width;
	int yConnect2 = box2.startY + box2.height/2;
	int xJoint = xConnect1 - Math.abs(xConnect2-xConnect1)/2;
	HorizontalLine hLine1 = new HorizontalLine(xConnect1, yConnect1, xJoint, yConnect1);
	VerticalLine vLine1 = new VerticalLine(xJoint, yConnect1, xJoint,yConnect2);
	HorizontalLine hLine2 = new HorizontalLine(xJoint, yConnect2, xConnect2, yConnect2);
	vLine1.draw(draw);
	hLine1.draw(draw);
	hLine2.draw(draw);		
	}

private void rightAndAbove(Box box2, Drawing draw) {
	int xConnect1 = this.startX;
	int yConnect1 = this.startY + this.height/2;
	int xConnect2 = box2.startX + box2.width;
	int yConnect2 = box2.startY + box2.height/2;
	int xJoint = xConnect1 - Math.abs(xConnect2-xConnect1)/2;
	HorizontalLine hLine1 = new HorizontalLine(xConnect1, yConnect1, xJoint, yConnect1);
	VerticalLine vLine1 = new VerticalLine(xJoint, yConnect1, xJoint,yConnect2);
	HorizontalLine hLine2 = new HorizontalLine(xJoint, yConnect2, xConnect2, yConnect2);
	vLine1.draw(draw);
	hLine1.draw(draw);
	hLine2.draw(draw);	
		
	}



private void right(Box box2, Drawing draw) {
	int xConnect1 = this.startX;
	int yConnect1 = this.startY + this.height/2;
	int xConnect2 = box2.startX + box2.width;
	int yConnect2 = box2.startY + box2.height/2;
	HorizontalLine hLine1 = new HorizontalLine(xConnect1, yConnect1, xConnect2, yConnect2);
	hLine1.draw(draw);		
	}
private void left (Box box2, Drawing draw) {
	int xConnect1 = this.startX + this.width;
	int yConnect1 = this.startY + this.height/2;
	int xConnect2 = box2.startX;
	int yConnect2 = box2.startY + box2.height/2;
	int yJoint = yConnect1 + (Math.abs(yConnect1-yConnect2)/2);
	VerticalLine vLine1 = new VerticalLine(xConnect1, yConnect1, xConnect1,yJoint);
	HorizontalLine hLine1 = new HorizontalLine(xConnect1, yJoint, xConnect2, yJoint);
	VerticalLine vLine2 = new VerticalLine(xConnect2, yConnect2, xConnect2, yJoint);
	vLine1.draw(draw);
	hLine1.draw(draw);
	vLine2.draw(draw);
}
private void above(Box box2, Drawing draw) {
	int xConnect1 = this.startX + this.width/2;
	int yConnect1 = this.startY + this.height;
	int xConnect2 = box2.startX + box2.width/2;
	int yConnect2 = box2.startY;
	int yJoint = yConnect1 + (Math.abs(yConnect1-yConnect2)/2);
	VerticalLine vLine1 = new VerticalLine(xConnect1, yConnect1, xConnect1,yJoint);
	HorizontalLine hLine1 = new HorizontalLine(xConnect1, yJoint, xConnect2, yJoint);
	VerticalLine vLine2 = new VerticalLine(xConnect2, yConnect2, xConnect2, yJoint);
	vLine1.draw(draw);
	hLine1.draw(draw);
	vLine2.draw(draw);
		
	}
private void below(Box box2, Drawing draw) {
	int xConnect1 = this.startX + this.width/2;
	int yConnect1 = this.startY;
	int xConnect2 = box2.startX + box2.width/2;
	int yConnect2 = box2.startY + height;
	VerticalLine vLine1 = new VerticalLine(xConnect1, yConnect1, xConnect2,yConnect2);
	vLine1.draw(draw);

	}


// 
//	public void leftAndAbove(int xConnect1, int yConnect1, int xConnect2, int yConnect2, int yJoint, Drawing draw) {
//		VerticalLine vLine1 = new VerticalLine(xConnect1, yConnect1, xConnect1,yJoint);
//		HorizontalLine hLine1 = new HorizontalLine(xConnect1, yJoint, xConnect2, yJoint);
//		VerticalLine vLine2 = new VerticalLine(xConnect2, yConnect2, xConnect2, yJoint);
//		vLine1.draw(draw);
//		hLine1.draw(draw);
//		vLine2.draw(draw);
//	}
	private void leftAndAbove( Box box2, Drawing draw) {
		int xConnect1 = this.startX + this.width;
		int yConnect1 = this.startY + this.height/2;
		int xConnect2 = box2.startX;
		int yConnect2 = box2.startY + box2.height/2;
		int xJoint = xConnect1 + Math.abs(xConnect2-xConnect1)/2;
		HorizontalLine hLine1 = new HorizontalLine(xConnect1, yConnect1, xJoint, yConnect1);
		VerticalLine vLine1 = new VerticalLine(xJoint, yConnect1, xJoint,yConnect2);
		HorizontalLine hLine2 = new HorizontalLine(xJoint, yConnect2, xConnect2, yConnect2);
		vLine1.draw(draw);
		hLine1.draw(draw);
		hLine2.draw(draw);	
		
	}
	private void leftAndBelow(Box box2, Drawing draw) {
		int xConnect1 = this.startX + this.width;
		int yConnect1 = this.startY + this.height/2;
		int xConnect2 = box2.startX;
		int yConnect2 = box2.startY + box2.height/2;
		int xJoint = xConnect1 + Math.abs(xConnect2-xConnect1)/2;
		HorizontalLine hLine1 = new HorizontalLine(xConnect1, yConnect1, xJoint, yConnect1);
		VerticalLine vLine1 = new VerticalLine(xJoint, yConnect1, xJoint,yConnect2);
		HorizontalLine hLine2 = new HorizontalLine(xJoint, yConnect2, xConnect2, yConnect2);
		vLine1.draw(draw);
		hLine1.draw(draw);
		hLine2.draw(draw);	
		}
	
}
