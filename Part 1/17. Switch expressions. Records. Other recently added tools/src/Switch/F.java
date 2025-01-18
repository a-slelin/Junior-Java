package Switch;

public class F {
    public static void main(String[] args) {
        int up = 0;
        int down = 0;
        int left = 0;
        int right = 0;
        char direction = 'R';

        switch (direction) {
            case 'U' -> {
                System.out.println("Двигаться вверх!");
                ++up;
            }
            case 'D' -> {
                System.out.println("Двигаться вниз!");
                ++down;
            }
            case 'R' -> {
                System.out.println("Повернуть направо!");
                ++right;
            }
            case 'L' -> {
                System.out.println("Повернуть налево!");
                ++left;
            }
        }

        System.out.println(right);
    }
}
