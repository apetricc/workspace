package drawings2;

public class Box extends Shape {

    int startX;
    int startY;
    int height;
    int width;
    int endX;
    int endY;
    int xConnect1;
    int yConnect1;
    int xConnect2;
    int yConnect2;
    int xJoint;
    int yJoint;
    Line bottom;
    Line top;
    Line left;
    Line right;

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
        endX = startX + width;
        endY = startY + height;
    }// Box

    /**
     * draw shows the points of the Box object it is called on and adds the Box
     * object to an ArrayList in the DrawProgram it is passed as a parameter
     *
     * @param palette the Drawing within which the Box will appear
     * @param draw    the DrawProgram within which the Box will appear
     */
    public void draw(DrawingPalette palette) {
        int aX = startX;
        int aY = startY;
        int bX = aX + width;
        int bY = startY;
        int cX = aX + width;
        int cY = aY + height;
        int dX = aX;
        int dY = aY + height;
        bottom = new Line(aX, aY, bX, bY, palette);
        right = new Line(bX, bY, cX, cY, palette);
        top = new Line(cX, cY, dX, dY, palette);
        left = new Line(dX, dY, aX, aY, palette);
        bottom.draw(palette);
        top.draw(palette);
        left.draw(palette);
        right.draw(palette);
    }// draw

    public void erase(DrawingPalette palette) {
        bottom.erase(palette);
        top.erase(palette);
        left.erase(palette);
        right.erase(palette);
    }// erase

    public int getStartX() {
        return startX;
    }

    public int getEndX() {
        return endX;
    }

    public int getStartY() {
        return startY;
    }

    public int getEndY() {
        return endY;
    }

    @Override
    public String getShape() {
        return "Box"
                +"\nstartX: " + startX
                +"\nstartY: " + startY
                +"\nendX: " + endX
                +"\nendY: " + endY
                +"\nwidth: " + width
                +"\nheight: " + height;

    }

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
        vLine1.draw(palette);
        hLine1.draw(palette);
        hLine2.draw(palette);
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
        vLine1.draw(palette);
        hLine1.draw(palette);
        hLine2.draw(palette);
    }// leftAndNotAdjacent

    private void right(Box box2, DrawingPalette palette, String modifier) {
        xConnect1 = this.startX;
        yConnect1 = this.startY + this.height / 2;
        xConnect2 = box2.startX + box2.width;
        Line line1 = new Line(xConnect1, yConnect1, xConnect2, yConnect1, palette);
        line1.draw(palette);
    }// right

    private void left(Box box2, DrawingPalette palette, String modifier) {
        xConnect1 = this.startX + this.width;
        yConnect1 = this.startY + this.height / 2;
        xConnect2 = box2.startX;
        Line hLine1 = new Line(xConnect1, yConnect1, xConnect2, yConnect1, palette);
        hLine1.draw(palette);
    }// left

    private void above(Box box2, DrawingPalette palette, String modifier) {
        xConnect1 = this.startX + this.width / 2;
        yConnect1 = this.startY + this.height;
        yConnect2 = box2.startY;
        Line vLine1 = new Line(xConnect1, yConnect1, xConnect1, yConnect2, palette);
        vLine1.draw(palette);

    }// above

    private void below(Box box2, DrawingPalette palette, String modifier) {
        xConnect1 = this.startX + this.width / 2;
        yConnect1 = this.startY;
        xConnect2 = box2.startX + box2.width / 2;
        yConnect2 = box2.startY + height;
        Line vLine1 = new Line(xConnect1, yConnect1, xConnect2, yConnect2, palette);
        vLine1.draw(palette);

    }// below

    /**
     * erase erases the Line objects of the Box object it is called on
     *
     * @param palette the SimpleDrawing within which the Box will be erased
     * @param draw    the DrawProgram within which the Box will be erased
     */


}// Box
