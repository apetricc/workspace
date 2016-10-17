package drawings2;

/**
 * Created by petriccione on 10/15/16.
 */
public class Connector extends Shape{

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
    Line line1;
    Box box1;
    Box box2;
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

    public Connector(Box box1, Box box2, DrawingPalette palette) {
        super(palette);
        this.box1 = box1;
        this.box2 = box2;
        startX = box1.startX;
        startY = box1.startY;
        endX = box2.startX;
        endY = box2.startY;
    }
    public void draw(DrawingPalette palette) {
        horizontallyAdjacent = (box1.startY == box2.startY);
        verticallyAdjacent = (box1.startX == box2.startX);
        box1IsAbove = (box1.startY < box2.startY);
        box1IsLeft = (box1.startX < box2.startX);
        box1IsRight = (box1.startX > box2.startX);
        box1IsBelow = (box1.startY > box2.startY);

        if (box1IsRight && horizontallyAdjacent)
            right(box2, palette);
        if (box1IsLeft && horizontallyAdjacent)
            left(box2, palette);
        if (box1IsAbove && verticallyAdjacent)
            above(box2, palette);
        if (box1IsBelow && verticallyAdjacent)
            below(box2, palette);
        if (box1IsLeft && !horizontallyAdjacent)
            leftAndNotAdjacent(box2, palette);
        if (box1IsRight && !horizontallyAdjacent)
            rightAndNotAdjacent(box2, palette);
    }// connectBoxes


    private void right(Box box2, DrawingPalette palette) {
        xConnect1 = box1.startX;
        yConnect1 = box1.startY + box1.height / 2;
        xConnect2 = box2.startX + box2.width;
        line1 = new Line(xConnect1, yConnect1, xConnect2, yConnect1, palette);
        line1.draw(palette);
        width = Math.abs(line1.endX - line1.startX);
        height = 0;
    }// right

    private void left(Box box2, DrawingPalette palette) {
        xConnect1 = box1.startX + box1.width;
        yConnect1 = box1.startY + box1.height / 2;
        xConnect2 = box2.startX;
        hLine1 = new Line(xConnect1, yConnect1, xConnect2, yConnect1, palette);
        hLine1.draw(palette);
        width = Math.abs(line1.endX - line1.startX);
        height = 0;
    }// left

    private void above(Box box2, DrawingPalette palette) {
        xConnect1 = box1.startX + box1.width / 2;
        yConnect1 = box1.startY + box1.height;
        yConnect2 = box2.startY;
        vLine1 = new Line(xConnect1, yConnect1, xConnect1, yConnect2, palette);
        vLine1.draw(palette);
        width = 0;
        height = Math.abs(vLine1.endY - vLine1.startY);

    }// above
    private void below(Box box2, DrawingPalette palette) {
        xConnect1 = box1.startX + box1.width / 2;
        yConnect1 = box1.startY;
        xConnect2 = box2.startX + box2.width / 2;
        yConnect2 = box2.startY + height;
        vLine1 = new Line(xConnect1, yConnect1, xConnect2, yConnect2, palette);
        vLine1.draw(palette);
        width = 0;
        height = Math.abs(vLine1.endY - vLine1.startY);

    }// below
    private void leftAndNotAdjacent(Box box2, DrawingPalette palette) {
        xConnect1 = box1.startX + box1.width;
        yConnect1 = box1.startY + box1.height / 2;
        xConnect2 = box2.startX;
        yConnect2 = box2.startY + box2.height / 2;
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



    private void rightAndNotAdjacent(Box box2, DrawingPalette palette) {
        xConnect1 = box1.startX;
        yConnect1 = box1.startY + box1.height / 2;
        xConnect2 = box2.startX + box2.width;
        yConnect2 = box2.startY + box2.height / 2;
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
        if ((box1IsRight && horizontallyAdjacent)||(box1IsLeft && horizontallyAdjacent))
            line1.erase(palette);
        if ((box1IsAbove && verticallyAdjacent)||(box1IsBelow && verticallyAdjacent))
            vLine1.erase(palette);

        if ((box1IsLeft && !horizontallyAdjacent)||(box1IsRight && !horizontallyAdjacent)) {
            hLine1.erase(palette);
            vLine1.erase(palette);
            hLine2.erase(palette);
        }
        else {
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

}
