package drawings2;

/**
 * Created by petriccione on 10/15/16.
 */
public class Connector extends Shape {

    int xConnect1;
    int yConnect1;
    int xConnect2;
    int yConnect2;
    int xJoint;
    Line hLine1;
    Line hLine2;
    Line vLine1;
    Line vLine2;
    Line line1;
    Shape shape1;
    Shape shape2;
    int width;
    int height;
    int startX;
    int startY;
    int endX;
    int endY;
    boolean horizontallyAdjacent;
    boolean verticallyAdjacent;
    boolean box1IsAbove;
    boolean box1IsLeft;
    boolean box1IsRight;
    boolean box1IsBelow;

    /**
     * Public constructor for Connector class
     *
     * @param shape1  The first Box that will be connected by the Connector
     * @param shape2  The second Box that will be connected by the Connector
     * @param palette The DrawingPalette where the Connector will be shown
     */
    public Connector(Shape shape1, Shape shape2, DrawingPalette palette) {
        super(palette);
        this.shape1 = shape1;
        this.shape2 = shape2;
        startX = shape1.getStartX();
        startY = shape1.getStartY();
        endX = shape2.getStartX();
        endY = shape2.getStartY();
    }

    /**
     * draw makes the Connector object visible in the window
     *
     * @param palette The DrawingPalette where the Connector will be drawn
     */
    public void draw(DrawingPalette palette) {
        horizontallyAdjacent = (shape1.getStartY() == shape2.getStartY());
        verticallyAdjacent = (shape1.getStartX() == shape2.getStartX());
        box1IsAbove = (shape1.getStartY() < shape2.getStartY());
        box1IsLeft = (shape1.getStartX() < shape2.getStartX());
        box1IsRight = (shape1.getStartX() > shape2.getStartX());
        box1IsBelow = (shape1.getStartY() > shape2.getStartY());

        if (box1IsRight && horizontallyAdjacent)
            right(shape2, palette);
        if (box1IsLeft && horizontallyAdjacent)
            left(shape2, palette);
        if (box1IsAbove && verticallyAdjacent)
            above(shape2, palette);
        if (box1IsBelow && verticallyAdjacent)
            below(shape2, palette);
        if (box1IsLeft && !horizontallyAdjacent)
            leftAndNotAdjacent(shape2, palette);
        if (box1IsRight && !horizontallyAdjacent)
            rightAndNotAdjacent(shape2, palette);
    }// connectBoxes

    /**
     * right is one case of how two Shapes will be connected
     *
     * @param box2
     * @param palette
     */
    private void right(Shape box2, DrawingPalette palette) {
        xConnect1 = shape1.getStartX();
        yConnect1 = shape1.getStartY() + shape1.getHeight() / 2;
        xConnect2 = box2.getStartX() + box2.getWidth();
        line1 = new Line(xConnect1, yConnect1, xConnect2, yConnect1, palette);
        line1.draw(palette);
        width = Math.abs(line1.endX - line1.startX);
        height = 0;
    }// right

    private void left(Shape box2, DrawingPalette palette) {
        xConnect1 = shape1.getStartX() + shape1.getWidth();
        yConnect1 = shape1.getStartY() + shape1.getHeight() / 2;
        xConnect2 = box2.getStartX();
        hLine1 = new Line(xConnect1, yConnect1, xConnect2, yConnect1, palette);
        hLine1.draw(palette);
        width = Math.abs(line1.endX - line1.startX);
        height = 0;
    }// left

    private void above(Shape box2, DrawingPalette palette) {
        xConnect1 = shape1.getStartX() + shape1.getWidth() / 2;
        yConnect1 = shape1.getStartY() + shape1.getHeight();
        yConnect2 = box2.getStartY();
        vLine1 = new Line(xConnect1, yConnect1, xConnect1, yConnect2, palette);
        vLine1.draw(palette);
        width = 0;
        height = Math.abs(vLine1.endY - vLine1.startY);

    }// above

    private void below(Shape box2, DrawingPalette palette) {
        xConnect1 = shape1.getStartX() + shape1.getWidth() / 2;
        yConnect1 = shape1.getStartY();
        xConnect2 = box2.getStartX() + box2.getWidth() / 2;
        yConnect2 = box2.getStartY() + height;
        vLine1 = new Line(xConnect1, yConnect1, xConnect2, yConnect2, palette);
        vLine1.draw(palette);
        width = 0;
        height = Math.abs(vLine1.endY - vLine1.getStartY());

    }// below

    private void leftAndNotAdjacent(Shape box2, DrawingPalette palette) {
        xConnect1 = shape1.getStartX() + shape1.getWidth();
        yConnect1 = shape1.getStartY() + shape1.getHeight() / 2;
        xConnect2 = box2.getStartX();
        yConnect2 = box2.getStartY() + box2.getHeight() / 2;
        xJoint = xConnect1 + Math.abs(xConnect2 - xConnect1) / 2;
        hLine1 = new Line(xConnect1, yConnect1, xJoint, yConnect1, palette);
        vLine1 = new Line(xJoint, yConnect1, xJoint, yConnect2, palette);
        hLine2 = new Line(xJoint, yConnect2, xConnect2, yConnect2, palette);
        vLine1.draw(palette);
        hLine1.draw(palette);
        hLine2.draw(palette);
        width = Math.abs(hLine1.startX - hLine2.startX);
        height = Math.abs(hLine1.startY - hLine2.startY);

    }// leftAndNotAdjacent


    private void rightAndNotAdjacent(Shape box2, DrawingPalette palette) {
        xConnect1 = shape1.getStartX();
        yConnect1 = shape1.getStartY() + shape1.getHeight() / 2;
        xConnect2 = box2.getStartX() + box2.getWidth();
        yConnect2 = box2.getStartY() + box2.getHeight() / 2;
        xJoint = xConnect1 - Math.abs(xConnect2 - xConnect1) / 2;
        hLine1 = new Line(xConnect1, yConnect1, xJoint, yConnect1, palette);
        vLine1 = new Line(xJoint, yConnect1, xJoint, yConnect2, palette);
        hLine2 = new Line(xJoint, yConnect2, xConnect2, yConnect2, palette);
        vLine1.draw(palette);
        hLine1.draw(palette);
        hLine2.draw(palette);
        width = Math.abs(hLine1.startX - hLine2.startX);
        height = Math.abs(hLine1.startY - hLine2.startY);
    }// rightAndNotAdjacent


    /**
     * erase erases the Line objects of the Box object it is called on
     *
     * @param palette the SimpleDrawing within which the Box will be erased
     * @param draw    the DrawProgram within which the Box will be erased
     */
    public void erase(DrawingPalette palette) {
        if ((box1IsRight && horizontallyAdjacent) || (box1IsLeft && horizontallyAdjacent))
            line1.erase(palette);
        if ((box1IsAbove && verticallyAdjacent) || (box1IsBelow && verticallyAdjacent))
            vLine1.erase(palette);

        if ((box1IsLeft && !horizontallyAdjacent) || (box1IsRight && !horizontallyAdjacent)) {
            hLine1.erase(palette);
            vLine1.erase(palette);
            hLine2.erase(palette);
        } else {
            hLine1.erase(palette);
            hLine2.erase(palette);
            vLine1.erase(palette);
            vLine2.erase(palette);
        }
    }// erase

    @Override
    public int getStartX() {
        return startX;
    }

    @Override
    public int getStartY() {
        return startY;
    }

    @Override
    public int getEndX() {
        return endX;
    }

    @Override
    public int getEndY() {
        return endY;
    }

    public String getShape() {
        return "connector";
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
}
