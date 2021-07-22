import java.util.concurrent.ThreadLocalRandom;

public class GameLogics {

    public static final int CELLS = 800;

    public static boolean [][] cells = new boolean[CELLS][CELLS];

    int aliveCellsAtStart = 50000;
    static int generation = 0;

    public void initGame(){
        for (int i = 0; i < aliveCellsAtStart; i++) {
            int x = random(0, CELLS);
            int y = random(0, CELLS);

            cells[x][y] = true;
        }
    }

    public static void nextGeneration(){
        generation++;
        System.out.println("current Gen: " + generation);

        for (int x = 0; x < CELLS; x++) {
            for (int y = 0; y < CELLS; y++) {
                int n = calcNeighbours(x, y);

                //Rule 1: Revive

                if (n == 3 && !cells[x][y]){
                    cells[x][y] = true;
                }

                //Rule 2: low population

                if (n < 2){
                    cells[x][y] = false;
                }

                //Rule 3: Stay alive

                if (n == 2 || n == 3){

                }

                //Rule 4: high population

                if (n > 3){
                    cells[x][y] = false;
                }
            }
        }
    }

    public static int calcNeighbours(int x, int y){
        /*
            Count neighbours alive
         */


        int count = 0;

        /*
            Coordinates of neighbours
         */

        int[] xOffset = {1, 1, 0, -1, -1, -1, 0, 1};
        int[] yOffset = {0, 1, 1, 1, 0, -1, -1, -1};

        for (int i = 0; i < 8; i++) {
            try {
                if (cells[x + xOffset[i]][y + yOffset[i]]){
                    count++;
                }
            } catch (Exception e) {

            }
        }

        return count;
    }

    public static int random(int min, int max){
        return ThreadLocalRandom.current().nextInt(min, max);
    }
}
