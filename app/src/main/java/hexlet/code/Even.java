package hexlet.code;
import java.util.Scanner;

public class Even {
    public static final int rangeOfNumbers = 100;
    public static final int numberOfRounds = 3;
    public static final int successRate = 3;
    public static int getRandomDiceNumber() {
        return (int) (Math.random() * rangeOfNumbers);
    }

    public static void runEven() {

        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        Scanner forName = new Scanner(System.in);
        String name = forName.nextLine();
        System.out.println("Hello, " + name + "!");

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        Scanner forAnswer = new Scanner(System.in);

        int count = 0;
        for (int i = 0; i < numberOfRounds; i++) {
            int random = getRandomDiceNumber();
            Engine.questionNumber(random);
            String answer = forAnswer.nextLine();

            boolean isEven = random % 2 == 0;
            boolean isntEven = !(random % 2 == 0);

            if (isEven && answer.equals("yes")) {
                Engine.userAnswer(answer);
                Engine.correctAnswer();
                count++;
            }
            if (isEven && answer.equals("no")) {
                System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.");
                System.out.println("Let's try again, " + name + "!");
                break;
            }
            if (isntEven && answer.equals("no")) {
                Engine.userAnswer(answer);
                Engine.correctAnswer();
                count++;
            }
            if (isntEven && answer.equals("yes")) {
                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
                System.out.println("Let's try again, " + name + "!");
                break;
            }
        }

        if (count == successRate) {
            System.out.println("Congratulations, " + name + "!");
        }
    }
}
