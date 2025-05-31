public class Set {
    public static void main(String[] args) {
        StdDraw.setXscale(-1.0, 1.0);
        StdDraw.setYscale(-1.0, 1.0);
        StdDraw.enableDoubleBuffering();

        while (true) {
            StdDraw.clear(StdDraw.WHITE);
            double x = StdDraw.mouseX();
            double y = StdDraw.mouseY();

            if (StdDraw.isMousePressed()) {
                // do mouse press things
            }
            StdDraw.circle(1, 1, 0.1);
            StdDraw.show();
            StdDraw.pause(20);
        }
    }
}