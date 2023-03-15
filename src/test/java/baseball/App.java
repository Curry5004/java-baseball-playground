package baseball;

import baseball.components.Game;

public class App {
    public static void main(String[] args){
        Game game = new Game();
        game.resetGame();
        game.playBall();
    }
}
