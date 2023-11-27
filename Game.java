package JavaDevelopmentKit.Lesson6.HW;

import java.util.Random;

public class Game {
    int[] doors;

    public String runGame() {
        doors = new int[]{1, 1, 1};
        Random rand = new Random();
        doors[rand.nextInt(3)] = 2;
        doors[rand.nextInt(3)] = -1;

        for (int i = 0; i < 3; i++) {
            if (doors[i] == 1) {
                doors[i] = -1;
                i = 3;
            }
        }

        int result = 0;
        for (int i = 0; i < 3; i++) {
            if (doors[i] != -1) {
                result = doors[i];
            }
        }

        if (result == 2) {
            return"auto";
        } else {
            return"goat";
        }
    }
}