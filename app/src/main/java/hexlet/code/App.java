package hexlet.code;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to the Brain Games!");
        Scanner scanner = new Scanner(System.in);
        Cli cli = new Cli();
        System.out.println(cli.getRequest());
        String name = scanner.nextLine();
        System.out.println(cli.getGreeting() + name + "!");

    }
}
