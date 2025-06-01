import java.util.function.Consumer;

public class Board implements Renderable {
    public Card[][] cards;

    public Board() {
        cards = new Card[3][3];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++) {
                cards[i][j] = new Card();
                cards[i][j].x = 50 + (j - 1) * 33;
                cards[i][j].y = 60 + (i - 1) * 25;
            }
    }

    public void render() {
        this.forEach((Card card) -> {
            card.render();
        });
    }

    public void forEach(Consumer<Card> func) {
        for (int i = 0; i < cards.length; i++) {
            for (int j = 0; j < cards[i].length; j++) {
                func.accept(cards[i][j]);
            }
        }
    }

    public void onMouse(double x, double y, boolean clicked) {
        this.forEach((Card c) -> {
            c.onMouse(x, y, clicked);
        });
    }

    public void onAddRow() {
        StdDraw.setCanvasSize(500, 700);
    }

    public void onRemoveRow() {
        StdDraw.setCanvasSize(500, 500);
    }
}
