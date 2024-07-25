package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {

    private static final int CHARACTER_COUNT = 3;

    public static char getRandomOperator() {
        int index = (int) (Math.random() * CHARACTER_COUNT);
        char[] charArray = {'+', '-', '*'};
        return charArray[index];
    }

    public static String getExpression(int firstNumber, int secondNumber, char symbol) {
        String question1 = String.valueOf(firstNumber);
        String question2 = String.valueOf(secondNumber);
        String question3 = String.valueOf(symbol);
        return question1 + " " + question3 + " " + question2;
    }

    public static int getCalculate(int firstNumber, int secondNumber, char symbol) {
        return switch (symbol) {
            case '+' -> firstNumber + secondNumber;
            case '-' -> firstNumber - secondNumber;
            case '*' -> firstNumber * secondNumber;
            default -> throw new Error("Unknown symbol: " + symbol + " !");
        };
    }

    public static void run() {
        String[][] questionsAndAnswers = new String[Engine.NUMBER_OF_ROUNDS_IN_GAME][];
        String rules = "What is the result of the expression?";
        for (int i = 0; i < Engine.NUMBER_OF_ROUNDS_IN_GAME; i++) {
            int firstNumber = Utils.getRandomNumber(Utils.LOW, Utils.HIGH);
            int secondNumber = Utils.getRandomNumber(Utils.LOW, Utils.HIGH);
            char symbol = getRandomOperator();
            int answer = getCalculate(firstNumber, secondNumber, symbol);
            String question = getExpression(firstNumber, secondNumber, symbol);
            String correctAnswer = String.valueOf(answer);
            questionsAndAnswers[i] = new String[] {question, correctAnswer};
        }

        Engine.run(questionsAndAnswers, rules);

    }
}
