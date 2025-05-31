import java.util.ArrayList;

public class Card implements Renderable {
    static ArrayList<Card> active; // literally just a list of all current cards
    public int color;
    public int shape;
    public int fill;
    public boolean hovered;

    public double x, y, w, h; // (x,y) is center

    public Card() {
        color = (int) (Math.random() * 3);
        shape = (int) (Math.random() * 3);
        fill = (int) (Math.random() * 3);

        x = 0;
        y = 0;
        w = 10;
        h = 10;
    }

    public Card(double x, double y) {
        color = (int) (Math.random() * 3);
        shape = (int) (Math.random() * 3);
        fill = (int) (Math.random() * 3);

        this.x = x;
        this.y = y;
        w = 0;
        h = 0;
    }

    public void render() {
        StdDraw.setPenColor(StdDraw.WHITE);
        StdDraw.filledRectangle(x, y, w / 2, h / 2);
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.rectangle(x, y, w / 2, h / 2);
    }

    public void close() {
        // delete
        active.remove(this);
    }

    public void onMouse(double x, double y, boolean clicked) {
        double l = this.x;
        double r = this.x + this.w;
        double b = this.y;
        double t = this.y + this.h;

        if (!(l < x && x < r && b < y && y < t)) {
            hovered = false;
            return;
        }
        hovered = true;
        // ok what tf do we do on hover

    }
}