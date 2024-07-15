package hexlet.code;

public class GCD1 {
    public static final int NUMBER_OF_ROUND = 3;
    public static final int RANDOM_NUMBER = 100;
    public static final int ERROR_RATE = 1;

    public static int getRandomDiceNumber() {
        return (int) (Math.random() * RANDOM_NUMBER) + ERROR_RATE;
    }
    public static String questionNumberForGCD(int question, int question2) {
        String fistNumber = String.valueOf(question);
        String secondNumber = String.valueOf(question2);
        return fistNumber + " " + secondNumber;
    }

    public static int getGCD(int firstNumber,int secondNumber) {
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

        String [][] questionsAndAnswers = new String[NUMBER_OF_ROUND][];

        for (int i = 0; i < questionsAndAnswers.length; i++) {
            int firstNumber = getRandomDiceNumber();
            int secondNumber = getRandomDiceNumber();
            int answer = getGCD(firstNumber, secondNumber);
            String finalQuestion = questionNumberForGCD(firstNumber, secondNumber);
            String finalAnswer = String.valueOf(answer);
            questionsAndAnswers[i] = new String[] {finalQuestion, finalAnswer};
        }
        Engine1.run(questionsAndAnswers, "GCD");
    }
}
