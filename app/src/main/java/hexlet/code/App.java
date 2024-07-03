package hexlet.code;
import java.util.Scanner;

public class App {
    Even evenGame = new Even();
    Greet greet = new Greet();
    public static void main(String[] args) {

        Scanner forGameNumber = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");

        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");

        int gameNumber = forGameNumber.nextInt();

        System.out.println("Your choice: " + gameNumber);

        switch (gameNumber) {
            case 1:
                Greet.greet();
                break;
            case 2:
                Even.runEven();
                break;
        }
    }
}
