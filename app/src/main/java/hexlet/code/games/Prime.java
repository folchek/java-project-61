package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    public static final int NUMBER_OF_ROUND = 3;

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

    public static void run() {
        String rules = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] questionsAndAnswers = new String[NUMBER_OF_ROUND][];

        for (int i = 0; i < questionsAndAnswers.length; i++) {
            int number =  Utils.getRandomNumber(1, 100);
            String correctAnswer = "";
            if (isSimple(number)) {
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
