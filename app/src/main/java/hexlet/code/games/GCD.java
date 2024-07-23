package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {

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

        String[][] questionsAndAnswers = new String[Engine.NUMBER_OF_ROUNDS_IN_GAME][];
        String rules = "Find the greatest common divisor of given numbers.";

        for (int i = 0; i < Engine.NUMBER_OF_ROUNDS_IN_GAME; i++) {
            int firstNumber = Utils.getRandomNumber(Utils.LOW, Utils.HIGH);
            int secondNumber =  Utils.getRandomNumber(Utils.LOW, Utils.HIGH);
            int answer = getGCD(firstNumber, secondNumber);
            String question = questionNumberForGCD(firstNumber, secondNumber);
            String correctAnswer = String.valueOf(answer);
            questionsAndAnswers[i] = new String[] {question, correctAnswer};
        }

        Engine.run(questionsAndAnswers, rules);

    }
}
