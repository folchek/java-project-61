package hexlet.code;

import java.util.Scanner;

public class Prime {
    public static final int RANDOM_NUMBER = 100;
    public static final int ERROR_RATE = 1;
    public static final int NUMBER_OF_ROUNDS = 3;
    public static final int SUCCESS_RATE = 3;
    public static int getRandomNumber() {
        return (int) (Math.random() * RANDOM_NUMBER) + ERROR_RATE;
    }
    public static boolean isSimple(Integer number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void runPrime() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        Scanner forName = new Scanner(System.in);
        String name = forName.nextLine();
        System.out.println("Hello, " + name + "!");

        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        for (int i = 0; i < NUMBER_OF_ROUNDS; i++) {
            int number = getRandomNumber();
            Engine.questionNumber(number);
            String answer = scanner.nextLine();
            Engine.userAnswer(answer);

            if (isSimple(number) && answer.equals("yes")) {
                Engine.correctAnswer();
                count++;
            }
            if (!isSimple(number) && answer.equals("no")) {
                Engine.correctAnswer();
                count++;
            }
            if (isSimple(number) && answer.equals("no")) {
                System.out.println(answer + " is wrong answer ;(. Correct answer was 'yes' .");
                System.out.println("Let's try again, " + name + "!");
                break;
            }
            if (!isSimple(number) && answer.equals("yes")) {
                System.out.println(answer + " is wrong answer ;(. Correct answer was 'no' .");
                System.out.println("Let's try again, " + name + "!");
                break;
            }

        }
        if (count == SUCCESS_RATE) {
            System.out.println("Congratulations, " + name + "!");
        }

    }

}
