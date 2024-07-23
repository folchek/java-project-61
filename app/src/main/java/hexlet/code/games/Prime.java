package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {

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
        String[][] questionsAndAnswers = new String[Engine.NUMBER_OF_ROUNDS_IN_GAME][];

        for (int i = 0; i < Engine.NUMBER_OF_ROUNDS_IN_GAME; i++) {
            int number =  Utils.getRandomNumber(Utils.LOW, Utils.HIGH);
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
