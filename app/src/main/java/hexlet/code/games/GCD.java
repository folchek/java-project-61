package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    public static final int NUMBER_OF_ROUND = 3;

    public static String questionNumberForGCD(int question, int question2) {
        String fistNumber = String.valueOf(question);
        String secondNumber = String.valueOf(question2);
        return fistNumber + " " + secondNumber;
    }

    public static int getGCD(int firstNumber, int secondNumber) {
        while (firstNumber != secondNumber) {
            if (firstNumber > secondNumber) {
                firstNumber = firstNumber - secondNumber;
            } else {
                secondNumber = secondNumber - firstNumber;
            }
        }
        return firstNumber;
    }

    public static void run() {

        String[][] questionsAndAnswers = new String[NUMBER_OF_ROUND][];
        String rules = "Find the greatest common divisor of given numbers.";

        for (int i = 0; i < questionsAndAnswers.length; i++) {
            int firstNumber = Utils.getRandomNumber(1, 100);
            int secondNumber =  Utils.getRandomNumber(1, 100);
            int answer = getGCD(firstNumber, secondNumber);
            String question = questionNumberForGCD(firstNumber, secondNumber);
            String correctAnswer = String.valueOf(answer);
            questionsAndAnswers[i] = new String[] {question, correctAnswer};
        }
        Engine.run(questionsAndAnswers, rules);
    }
}
