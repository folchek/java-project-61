package hexlet.code;

import java.util.Scanner;

public class Calc {

    public static int getRandomDiceNumber() {
        int rangeOfNumbers = 100;
        return (int) (Math.random() * rangeOfNumbers);
    }

    public static char getRandomChar() {
        int countСharacter = 3;
        int index = (int) (Math.random() * countСharacter);
        char[] charArray = {'+', '-', '*'};
        return charArray[index];

    }

    public static void runCalc() {

        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        Scanner forName = new Scanner(System.in);
        String name = forName.nextLine();
        System.out.println("Hello, " + name + "!");

        System.out.println("What is the result of the expression?");

        Scanner forCalc = new Scanner(System.in);
        int count = 0;
        for (int i = 0; i < 3; i++) {
            int firstNumber = getRandomDiceNumber();
            int secondNumber = getRandomDiceNumber();
            char symbol = getRandomChar();
            Engine.questionNumberForCalc(firstNumber, secondNumber, symbol);
            int answer = forCalc.nextInt();
            Engine.userIntAnswer(answer);

            int result = firstNumber + secondNumber;
            int result2 = firstNumber - secondNumber;
            int result3 = firstNumber * secondNumber;

            if (answer == result || answer == result2 || answer == result3) {
                Engine.correctAnswer();
                count++;
            }
            if (answer != result && symbol == '+') {
                System.out.println(answer + " is wrong answer ;(. Correct answer was " + result + ".");
                System.out.println("Let's try again, " + name + "!");
                break;
            }
            if (answer != result2 && symbol == '-') {
                System.out.println(answer + " is wrong answer ;(. Correct answer was " + result2 + ".");
                System.out.println("Let's try again, " + name + "!");
                break;
            }
            if (answer != result3 && symbol == '*') {
                System.out.println(answer + " is wrong answer ;(. Correct answer was " + result3 + ".");
                System.out.println("Let's try again, " + name + "!");
                break;
            }
        }
        if (count == 3) {
            System.out.println("Congratulations, " + name + "!");
        }
    }
}
