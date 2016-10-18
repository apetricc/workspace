package drawings2;

public class Box extends Shape {

    int startX;
    int startY;
    int height;
    int width;
    int endX;
    int endY;
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
     * @param palette the DrawProgram within which the Box will appear
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

    /**
     * erase hides the points of the Box.
     * @param palette the DrawingPalette window to erase the Box from.
     */
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
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public String getShape() {
        return "Box"
                + "\nstartX: " + startX
                + "\nstartY: " + startY
                + "\nendX: " + endX
                + "\nendY: " + endY
                + "\nwidth: " + width
                + "\nheight: " + height;

    }//getShape


}// Box
