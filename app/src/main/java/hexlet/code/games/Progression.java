package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Progression {
    public static final int NUMBER_OF_ROUND = 3;

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

        String[][] questionsAndAnswers = new String[NUMBER_OF_ROUND][];
        String rules = "What number is missing in the progression?";
        for (int i = 0; i < questionsAndAnswers.length; i++) {
            int lengthOfProgression =  Utils.getRandomNumber(5, 10);
            int diffOfProgression =  Utils.getRandomNumber(1, 3);
            int firstNumber =  Utils.getRandomNumber(1, 100);

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
