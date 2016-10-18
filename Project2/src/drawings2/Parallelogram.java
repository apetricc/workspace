package drawings2;


public class Parallelogram extends Shape {

    int startX;
    int startY;
    int height;
    int width;
    int endX;
    int endY;
    Line bottom;
    Line right;
    Line top;
    Line left;

    public Parallelogram(int startX, int startY, int width, int height, DrawingPalette palette) {
        super(palette);
        this.startX = startX;
        this.startY = startY;
        this.height = height;
        this.width = width;
        endX = startX + width;
        endY = startY + height;
    }

    public void draw(DrawingPalette palette) {
        int aX = startX;
        int aY = startY;
        int bX = startX + width;
        int bY = startY;
        int cX = (startX + width / 2 + width);
        int cY = startY + height;
        int dX = startX + width / 2;
        int dY = startY + height;
        bottom = new Line(aX, aY, bX, bY, palette);
        right = new Line(bX, bY, cX, cY, palette);
        top = new Line(cX, cY, dX, dY, palette);
        left = new Line(dX, dY, aX, aY, palette);
        bottom.draw(palette);
        right.draw(palette);
        top.draw(palette);
        left.draw(palette);

    }//draw

    public void erase(DrawingPalette palette) {
        bottom.erase(palette);
        top.erase(palette);
        right.erase(palette);
        left.erase(palette);

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
        return "Parallelogram"
                + "\nstartX: " + startX
                + "\nstartY: " + startY
                + "\nendX: " + endX
                + "\nendY: " + endY
                + "\nwidth: " + width
                + "\nheight: " + height;

    }
}
