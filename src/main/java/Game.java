import java.util.ArrayList;

public class Game {

    private Deck deck;
    private Dealer dealer;
    private ArrayList<Player> players;

    public Game(Deck deck, Dealer dealer, ArrayList<Player> players) {
        this.deck = deck;
        this.dealer = dealer;
        this.players = players;
    }


    public void play() {
        for (Player player : this.players) {
            Card card = dealer.deal(deck);
            player.addCard(card);
            Card card2 = dealer.deal(deck);
            player.addCard(card2);
        }
    }

    public void checkStick(){
        boolean bothReady = false;
        for (Player player : players){
            if ( )
        }
    }

    public Player checkWinner() {
            if (checkDraw()) {
                return null;
            }
            Player winner = players.get(0);

            for (Player player : this.players) {
                if (winner.getHandValue() > 21){
                    winner = players.get(1);
                }
                else if (21 - player.getHandValue() < 21 - winner.getHandValue()) {
                    winner = player;
                }
            }
            return winner;
        }



    public boolean checkDraw() {
        boolean draw = false;
        for (Player player : players) {
            if (21 - player.getHandValue() == 21 - players.get(0).getHandValue()) {
                draw = true;
            } else {
                draw = false;
            }
        }
        return draw;
    }
}
