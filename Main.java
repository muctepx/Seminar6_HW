package JavaDevelopmentKit.Lesson6.HW;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Game game = new Game();
        HashMap<Integer, String> result = new HashMap<>();
        int winning = 0;
        for (int i = 0; i < 1000; i++) {
            String values = game.runGame();
            result.put(i + 1, values);
            if (values.equals("auto")) {
                winning ++;
            }
        }
        System.out.println(result);
        System.out.println("Количество выигрышей: " + winning);
    }
}
