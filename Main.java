public class Main {

    public static void main(String[] args) {

        Player player = new Player(3);

       
       
        GuessGame game = new GuessGame(player);

        game.startGame();
    }
}
