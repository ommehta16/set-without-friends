public class Set {
    public static void main(String[] args) {
        StdDraw.setXscale(0, 100);
        StdDraw.setYscale(0, 100);
        StdDraw.enableDoubleBuffering();

        Board game = new Board();

        while (true) {
            StdDraw.clear(StdDraw.WHITE);
            // reload baord
            game.render();
            StdDraw.show();
            StdDraw.pause(20);
        }
    }
}