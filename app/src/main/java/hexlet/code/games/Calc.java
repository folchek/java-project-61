package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    public static final int NUMBER_OF_ROUND = 3;

    public static String getExpression(int firstNumber, int secondNumber, char symbol) {
        String question1 = String.valueOf(firstNumber);
        String question2 = String.valueOf(secondNumber);
        String question3 = String.valueOf(symbol);
        return question1 + " " + question3 + " " + question2;
    }
    public static int getAnswer(int firstNumber, int secondNumber, char symbol) {
        int result = firstNumber + secondNumber;
        int result2 = firstNumber - secondNumber;
        int result3 = firstNumber * secondNumber;
        if (symbol == '+') {
            return result;
        }
        if (symbol == '-') {
            return result2;
        }
        return result3;
    }

    public static void run() {
        String[][] questionsAndAnswers = new String[NUMBER_OF_ROUND][];
        String rules = "What is the result of the expression?";
        for (int i = 0; i < questionsAndAnswers.length; i++) {
            int firstNumber = Utils.getRandomNumber(1, 100);
            int secondNumber = Utils.getRandomNumber(1, 100);
            char symbol = Utils.getRandomChar();
            int answer = getAnswer(firstNumber, secondNumber, symbol);
            String question = getExpression(firstNumber, secondNumber, symbol);
            String correctAnswer = String.valueOf(answer);
            questionsAndAnswers[i] = new String[] {question, correctAnswer};
        }
        Engine.run(questionsAndAnswers, rules);
    }
}
