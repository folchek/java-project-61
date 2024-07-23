package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Progression {

    public static int getRandomElementProgression(int length) {
        return (int) (Math.random() * length);
    }

    public static int[] getRandomProgression(int length, int diff, int firstNumber) {
        int[] progression = new int[length];

        for (int j = 0; j < length; j++) {
            progression[j] = firstNumber;
            firstNumber += diff;
        }
        return progression;
    }

    public static void run() {

        String[][] questionsAndAnswers = new String[Engine.NUMBER_OF_ROUNDS_IN_GAME][];
        String rules = "What number is missing in the progression?";
        for (int i = 0; i < Engine.NUMBER_OF_ROUNDS_IN_GAME; i++) {
            int lengthOfProgression =  Utils.getRandomNumber(Utils.LOW_FOR_PROGRESSION, Utils.HIGH_FOR_PROGRESSION);
            int diffOfProgression =  Utils.getRandomNumber(Utils.LOW, Utils.DIFF);
            int firstNumber =  Utils.getRandomNumber(Utils.LOW, Utils.HIGH);

            int random = getRandomElementProgression(lengthOfProgression);

            int[] progression = getRandomProgression(lengthOfProgression, diffOfProgression, firstNumber);

            String result = Arrays.stream(progression)
                    .mapToObj(String::valueOf)
                    .collect(Collectors.joining(" ")).replace(String.valueOf(progression[random]), "..");

            String correctAnswer = String.valueOf(progression[random]);

            questionsAndAnswers[i] = new String[] {result, correctAnswer};
        }

        Engine.run(questionsAndAnswers, rules);

    }
}
