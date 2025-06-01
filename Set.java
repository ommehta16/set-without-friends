public class Set {
    public static void main(String[] args) {
        StdDraw.setCanvasSize(500, 500);
        StdDraw.setXscale(0, 100); // 0 to 100 bc im too dumb to do -1 to 1
        StdDraw.setYscale(0, 100);
        StdDraw.enableDoubleBuffering();

        Board a = new Board();
        double x, y;
        boolean pressed = false;
        while (true) {
            x = StdDraw.mouseX();
            y = StdDraw.mouseY();

            if (StdDraw.isMousePressed())
                pressed = true;
            else
                pressed = false;

            // MOUSE UPDATES
            a.onMouse(x, y, pressed);

            // GENERAL UPDATES

            // RENDERING

            // hack to clear bc stddraw.clear apparently clears front buffer
            StdDraw.setPenColor(StdDraw.WHITE);
            StdDraw.rectangle(50, 50, 50, 50);
            a.render();
            StdDraw.show();
            StdDraw.pause(10);
        }
    }
}