package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    public static final int NUMBER_OF_ROUND = 3;

    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }
    public static void run() {
        String[][] questionsAndAnswers = new String[NUMBER_OF_ROUND][];
        String rules = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        for (int i = 0; i < questionsAndAnswers.length; i++) {
            int number = Utils.getRandomNumber(1, 100);
            String correctAnswer = "";
            if (isEven(number)) {
                correctAnswer = "yes";
            } else {
                correctAnswer = "no";
            }
            String question = String.valueOf(number);
            questionsAndAnswers[i] = new String[] {question, correctAnswer};
        }
        Engine.run(questionsAndAnswers, rules);
    }
}
