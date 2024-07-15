package hexlet.code;
import java.util.Scanner;

public class App {
    public static final int GREET = 1;
    public static final int EVEN_GAME = 2;
    public static final int CALC_GAME = 3;
    public static final int GCD_GAME = 4;
    public static final int PROGRESSION_GAME = 5;
    public static final int PRIME_GAME = 6;
    public static final int EXIT = 0;
    public static void main(String[] args) {

        Scanner forGameNumber = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");

        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");

        int gameNumber = forGameNumber.nextInt();

        System.out.println("Your choice: " + gameNumber);

        switch (gameNumber) {
            case GREET:
                Greet.greet();
                break;
            case EVEN_GAME:
                Even.runEven();
                break;
            case CALC_GAME:
                Calc.runCalc();
                break;
            case GCD_GAME:
                GCD.runGCD();
                break;
            case PROGRESSION_GAME:
                Progression.runProgression();
                break;
            case PRIME_GAME:
                Prime.runPrime();
                break;
            default:
                break;
        }
    }
}
