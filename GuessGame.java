import java.util.Random;
import java.util.Scanner;

public class GuessGame {

    private Player player;
    private int number;

    public GuessGame(Player player) {
        this.player = player;

        Random random = new Random();
        number = random.nextInt(10) + 1;
    }

    
    public void startGame() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to my simple number guessing game");

        while (player.isAlive()) {

            System.out.print("Please enter a number between 1 and 10: ");
            int guess = scanner.nextInt();

            if (guess == number) {
                System.out.println("Correct You win");
                return;
            } else {
                player.loseLife();
                System.out.println("Wrong guess");
                System.out.println("Remaining lives: " + player.getLives());
            }
        }

        System.out.println("Game over. The correct number was: " + number);
    }
}
