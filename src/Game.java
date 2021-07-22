public class Game {
    public static void main(String[] args) {
        GUI gui = new GUI();
        GameLogics gameLogics = new GameLogics();
        GameClock gameClock = new GameClock();

        gameLogics.initGame();
        gui.createFrame();
        gameClock.start();
    }
}
