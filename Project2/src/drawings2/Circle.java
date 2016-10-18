package drawings2;

public class Circle extends Shape {


    int startX;
    int startY;
    int radius;
    int endX;
    int endY;
    int width;
    int height;

    public Circle(int startX, int startY, int radius, DrawingPalette palette) {
        super(palette);
        this.startX = startX;
        this.startY = startY;
        this.radius = radius;
        endX = startX + 2 * radius;
        endY = startY + 2 * radius;
        width = startX + radius * 2;
        height = startY + radius * 2;
    }

    /**
     * draw shows the points that form a circle within a bounding box
     *
     * @param palette the DrawingPalette where the Circle will be drawn
     */
    @Override
    public void draw(DrawingPalette palette) {
        int midX = startX + radius;
        int midY = startY + radius;

        for (int i = startX; i < startX + (2 * radius); i++) {
            for (int j = startY; j < startY + (2 * radius); j++) {
                int a = (midX - i);
                int b = (midY - j);
                double c = Math.sqrt((Math.pow(a, 2) + Math.pow(b, 2)));
                if (c <= radius && c > radius - 1) {
                    palette.showPoint(i, j);
                }//if
            }//for j
        }//for i

    }//draw

    public void erase(DrawingPalette palette) {
        int midX = startX + radius;
        int midY = startY + radius;
        for (int i = startX; i < startX + (2 * radius); i++) {
            for (int j = startY; j < startY + (2 * radius); j++) {
                int a = (midX - i);
                int b = (midY - j);
                double c = Math.sqrt((Math.pow(a, 2) + Math.pow(b, 2)));
                if (c <= radius && c > radius - 1) {
                    palette.hidePoint(i, j);
                }
            }
        }

    }

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
        return "Circle"
                + "\nstartX: " + startX
                + "\nstartY: " + startY
                + "\nendX: " + endX
                + "\nendY: " + endY
                + "\nwidth: " + width
                + "\nheight: " + height;

    }

}
