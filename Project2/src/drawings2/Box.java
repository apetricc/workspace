package drawings2;

public class Box extends Shape {

    private int startX;
    private int startY;
    private int height;
    private int width;
    int xConnect1;
    int yConnect1;
    int xConnect2;
    int yConnect2;
    int xJoint;
    int yJoint;
    Line hLine1;
    Line hLine2;
    Line vLine1;
    Line vLine2;

    /**
     * Public constructor for the Box class
     *
     * @param startX the x coordinate of the upper left corner of the Box
     * @param startY the y coordinate of the upper left corner of the Box
     * @param width  the width of the Box
     * @param height the height of the Box
     */
    public Box(int startX, int startY, int width, int height, DrawingPalette palette) {
        super(palette);
        this.startX = startX;
        this.startY = startY;
        this.width = width;
        this.height = height;
    }// Box

    /**
     * draw shows the points of the Box object it is called on and adds the Box
     * object to an ArrayList in the DrawProgram it is passed as a parameter
     *
     * @param palette the Drawing within which the Box will appear
     * @param draw    the DrawProgram within which the Box will appear
     */
    public void draw(DrawingPalette palette, String modifier) {
        hLine1 = new Line(startX, startY, startX + width, startY, palette);
        hLine2 = new Line(startX, startY - height, startX + width, startY - height, palette);
        hLine1.draw(palette, modifier);
        hLine2.draw(palette, modifier);
        vLine1 = new Line(startX, startY, startX, startY - height, palette);
        vLine2 = new Line(startX + width, startY, startX + width, startY - height, palette);
        vLine1.draw(palette, modifier);
        vLine2.draw(palette, modifier);
    }// draw

    /**
     * connectboxDiagram draws connecting lines between two Box objects
     *
     * @param box2    the Box to connect to from the Box connectBoxes is called on
     * @param palette the Drawing that the Box objects are in
     */
    public void connectBoxes(Box box2, DrawingPalette palette, String modifier) {
        boolean horizontallyAdjacent = (this.startY == box2.startY);
        boolean verticallyAdjacent = (this.startX == box2.startX);
        boolean box1IsAbove = (this.startY < box2.startY);
        boolean box1IsLeft = (this.startX < box2.startX);
        boolean box1IsRight = (this.startX > box2.startX);
        boolean box1IsBelow = (this.startY > box2.startY);

        if (box1IsRight && horizontallyAdjacent)
            right(box2, palette, modifier);
        if (box1IsLeft && horizontallyAdjacent)
            left(box2, palette, modifier);
        if (box1IsAbove && verticallyAdjacent)
            above(box2, palette, modifier);
        if (box1IsBelow && verticallyAdjacent)
            below(box2, palette, modifier);
        if (box1IsLeft && !horizontallyAdjacent)
            leftAndNotAdjacent(box2, palette, modifier);
        if (box1IsRight && !horizontallyAdjacent)
            rightAndNotAdjacent(box2, palette, modifier);
    }// connectBoxes

    private void rightAndNotAdjacent(Box box2, DrawingPalette palette, String modifier) {
        xConnect1 = this.startX;
        yConnect1 = this.startY + this.height / 2;
        xConnect2 = box2.startX + box2.width;
        yConnect2 = box2.startY + box2.height / 2;
        xJoint = xConnect1 - Math.abs(xConnect2 - xConnect1) / 2;
        Line hLine1 = new Line(xConnect1, yConnect1, xJoint, yConnect1, palette);
        Line vLine1 = new Line(xJoint, yConnect1, xJoint, yConnect2, palette);
        Line hLine2 = new Line(xJoint, yConnect2, xConnect2, yConnect2, palette);
        vLine1.draw(palette, modifier);
        hLine1.draw(palette, modifier);
        hLine2.draw(palette, modifier);
    }// rightAndNotAdjacent

    private void leftAndNotAdjacent(Box box2, DrawingPalette palette, String modifier) {
        xConnect1 = this.startX + this.width;
        yConnect1 = this.startY + this.height / 2;
        xConnect2 = box2.startX;
        yConnect2 = box2.startY + box2.height / 2;
        xJoint = xConnect1 + Math.abs(xConnect2 - xConnect1) / 2;
        Line hLine1 = new Line(xConnect1, yConnect1, xJoint, yConnect1, palette);
        Line vLine1 = new Line(xJoint, yConnect1, xJoint, yConnect2, palette);
        Line hLine2 = new Line(xJoint, yConnect2, xConnect2, yConnect2, palette);
        vLine1.draw(palette, modifier);
        hLine1.draw(palette, modifier);
        hLine2.draw(palette, modifier);
    }// leftAndNotAdjacent

    private void right(Box box2, DrawingPalette palette, String modifier) {
        xConnect1 = this.startX;
        yConnect1 = this.startY + this.height / 2;
        xConnect2 = box2.startX + box2.width;
        Line line1 = new Line(xConnect1, yConnect1, xConnect2, yConnect1, palette);
        line1.draw(palette, modifier);
    }// right

    private void left(Box box2, DrawingPalette palette, String modifier) {
        xConnect1 = this.startX + this.width;
        yConnect1 = this.startY + this.height / 2;
        xConnect2 = box2.startX;
        Line hLine1 = new Line(xConnect1, yConnect1, xConnect2, yConnect1, palette);
        hLine1.draw(palette, modifier);
    }// left

    private void above(Box box2, DrawingPalette palette, String modifier) {
        xConnect1 = this.startX + this.width / 2;
        yConnect1 = this.startY + this.height;
        yConnect2 = box2.startY;
        Line vLine1 = new Line(xConnect1, yConnect1, xConnect1, yConnect2, palette);
        vLine1.draw(palette, modifier);

    }// above

    private void below(Box box2, DrawingPalette palette, String modifier) {
        xConnect1 = this.startX + this.width / 2;
        yConnect1 = this.startY;
        xConnect2 = box2.startX + box2.width / 2;
        yConnect2 = box2.startY + height;
        Line vLine1 = new Line(xConnect1, yConnect1, xConnect2, yConnect2, palette);
        vLine1.draw(palette, modifier);

    }// below

    /**
     * erase erases the Line objects of the Box object it is called on
     *
     * @param palette the SimpleDrawing within which the Box will be erased
     * @param draw    the DrawProgram within which the Box will be erased
     */
    public void erase(DrawingPalette palette) {
//		palette.shapes.remove(this);
        hLine1.erase(palette);
        hLine2.erase(palette);
        vLine1.erase(palette);
        vLine2.erase(palette);
    }// erase

    public int getStartX() {
        return startX;
    }

    public int getEndX() {
        return startX + this.width;
    }

    public int getStartY() {
        return startY;
    }

    public int getEndY() {
        return startY - this.height;
    }

}// Box
