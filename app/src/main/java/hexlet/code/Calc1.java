package hexlet.code;

public class Calc1 {
    public static final int RANGE_OF_NUMBERS = 100;
    public static final int CHARACTER_COUNT = 3;
    public static final int NUMBER_OF_ROUND = 3;

    public static int getRandomNumber() {
        return (int) (Math.random() * RANGE_OF_NUMBERS);
    }
    public static char getRandomChar() {
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
        String [][] questionsAndAnswers = new String[NUMBER_OF_ROUND][];

        for (int i = 0; i < questionsAndAnswers.length; i++) {
            int firstNumber = getRandomNumber();
            int secondNumber = getRandomNumber();
            char symbol = getRandomChar();
            int answer = getAnswer(firstNumber, secondNumber, symbol);
            String finalQuestion = getExpression(firstNumber, secondNumber, symbol);
            String finalAnswer = String.valueOf(answer);
            questionsAndAnswers[i] = new String[] {finalQuestion, finalAnswer};
        }
        Engine1.run(questionsAndAnswers, "Calc");
    }
}
