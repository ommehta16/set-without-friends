import java.util.ArrayList;

public class Card implements Renderable {
    static ArrayList<Card> active; // literally just a list of all current cards
    public int color;
    public int shape;
    public int fill;
    public boolean hovered = false;

    public double x, y, w, h; // (x,y) is center

    public Card() {
        color = (int) (Math.random() * 3);
        shape = (int) (Math.random() * 3);
        fill = (int) (Math.random() * 3);

        x = 0;
        y = 0;
        w = 20;
        h = 20;
    }

    public Card(double x, double y) {
        color = (int) (Math.random() * 3);
        shape = (int) (Math.random() * 3);
        fill = (int) (Math.random() * 3);

        this.x = x;
        this.y = y;
        w = 10;
        h = 10;
    }

    public void render() {
        if (!hovered)
            StdDraw.setPenColor(StdDraw.WHITE);
        else
            StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
        StdDraw.filledRectangle(x, y, w / 2, h / 2);
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.rectangle(x, y, w / 2, h / 2);
    }

    public void close() {
        // delete
        active.remove(this);
    }

    public void onMouse(double x, double y, boolean clicked) {
        double l = this.x - this.w / 2;
        double r = this.x + this.w / 2;
        double b = this.y - this.h / 2;
        double t = this.y + this.h / 2;

        if (!(l < x && x < r && b < y && y < t)) {
            hovered = false;
            return;
        }
        hovered = true;
        // System.out.println("IM ON TV!");
        // ok what tf do we do on hover

    }
}