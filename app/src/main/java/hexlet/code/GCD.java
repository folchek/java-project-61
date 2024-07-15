package hexlet.code;

import java.util.Scanner;

public class GCD {
    public static final int RANDOM_NUMBER = 100;
    public static final int ERROR_RATE = 1;
    public static final int NUMBER_OF_ROUNDS = 3;
    public static final int SUCCESS_RATE = 3;

    public static int getRandomDiceNumber() {
        return (int) (Math.random() * RANDOM_NUMBER) + ERROR_RATE;
    }

    public static void runGCD() {

        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        Scanner forName = new Scanner(System.in);
        String name = forName.nextLine();
        System.out.println("Hello, " + name + "!");

        System.out.println("Find the greatest common divisor of given numbers.");

        Scanner forGCD = new Scanner(System.in);
        int count = 0;
        for (int i = 0; i < NUMBER_OF_ROUNDS; i++) {
            int firstNumber = getRandomDiceNumber();
            int secondNumber = getRandomDiceNumber();
            Engine.questionNumberForGCD(firstNumber, secondNumber);
            int answer = forGCD.nextInt();
            Engine.userIntAnswer(answer);

            while (firstNumber != secondNumber) {
                if (firstNumber > secondNumber) {
                    firstNumber = firstNumber - secondNumber;
                } else {
                    secondNumber = secondNumber - firstNumber;
                }
            }

            if (answer == firstNumber) {
                Engine.correctAnswer();
                count++;
            } else {
                System.out.println(answer + " is wrong answer ;(. Correct answer was " + firstNumber + ".");
                System.out.println("Let's try again, " + name + "!");
                break;
            }
        }
        if (count == SUCCESS_RATE) {
            System.out.println("Congratulations, " + name + "!");
        }
    }
}
