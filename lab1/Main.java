package lab1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Hero hero = new Hero(new Walking());

        System.out.println("press 1 to walk\n");
        System.out.println("press 2 to cycle\n");
        System.out.println("press 3 to drive\n");
        System.out.println("press 4 to fly\n");
        System.out.println("press any other key to stop\n");

        Scanner in = new Scanner(System.in);
        if (in.hasNextInt()) {
            int num = in.nextInt();
            while (!(num < 1 || num > 4)) {
                switch (num) {
                    case 1 -> hero.setMovement(new Walking());
                    case 2 -> hero.setMovement(new Cycling());
                    case 3 -> hero.setMovement(new Driving());
                    case 4 -> hero.setMovement(new Flying());
                }
                hero.executeMovement();
                if (in.hasNextInt()) {
                    num = in.nextInt();
                }
                else {
                    num = 0;
                }
            }
        }
        in.close();
    }
}