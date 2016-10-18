package drawings2;


public class Diamond extends Shape {
    int startX;
    int startY;
    int height;
    int width;
    int endX;
    int endY;
    Line line1;
    Line line2;
    Line line3;
    Line line4;

    public Diamond(int startX, int startY, int width, int height, DrawingPalette palette) {
        super(palette);
        this.startX = startX;
        this.startY = startY;
        this.width = width;
        this.height = height;
        endX = startX + width;
        endY = startY + height;
    }

    /**
     * draw shows the points of the Diamond
     * @param palette the DrawingPalette to draw the Diamond on
     */
    public void draw(DrawingPalette palette) {
        int aX = startX;
        int aY = startY + height/2;
        int bX = startX  + width / 2;
        int bY = startY + height;
        int cX = startX + width;
        int cY = startY + height/2;
        int dX = startX + width / 2;
        int dY = startY;
        line1 = new Line(aX, aY, bX, bY, palette);
        line2 = new Line(bX, bY, cX, cY, palette);
        line3 = new Line(cX, cY, dX, dY, palette);
        line4 = new Line(dX, dY, aX, aY, palette);
        line1.draw(palette);
        line2.draw(palette);
        line3.draw(palette);
        line4.draw(palette);
    }

    public void erase(DrawingPalette palette) {
        line1.erase(palette);
        line2.erase(palette);
        line3.erase(palette);
        line4.erase(palette);
    }

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
        return "Diamond"
                +"\nstartX: " + startX
                +"\nstartY: " + startY
                +"\nendX: " + endX
                +"\nendY: " + endY
                +"\nwidth: " + width
                +"\nheight: " + height;

    }
}
