import java.util.function.Consumer;

public class Board implements Renderable {
    public Card[][] cards;

    public Board() {
        cards = new Card[3][3];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++) {
                cards[i][j] = new Card();
                cards[i][j].x = j * 33 + cards[i][j].w;
                cards[i][j].y = i * 33 + cards[i][j].h;
            }

    }

    public void render() {
        this.forEach((Card card) -> card.render());
    }

    public void forEach(Consumer<Card> func) {
        for (int i = 0; i < cards.length; i++) {
            for (int j = 0; j < cards[i].length; j++) {
                func.accept(cards[i][j]);
            }
        }
    }
}
