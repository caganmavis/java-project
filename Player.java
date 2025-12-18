public class Player {

    private int lives;

   
    public Player(int lives) {
        this.lives = lives;
    }

   
    public int getLives() {
        return lives;
    }

    public void loseLife() {
        lives = lives - 1;
    }

    public boolean isAlive() {
        if (lives > 0) {
            return true;
        } else {
            return false;
        }
    }
}
