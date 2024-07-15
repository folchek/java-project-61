package hexlet.code;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Progression1 {
    public static final int FIRST_NUMBER_OF_THE_PROGRESSION = 98;
    public static final int DIFF_OF_THE_PROGRESSION = 2;
    public static final int ERROR_RATE = 1;
    public static final int RANGE_OF_THE_PROGRESSION = 5;
    public static final int NUMBER_OF_ROUND = 3;

    public static int getRandomLengthProgression() {
        return (int) (Math.random() * RANGE_OF_THE_PROGRESSION) + RANGE_OF_THE_PROGRESSION;
    }
    public static int getRandomFirstNumberOfProgression() {
        return (int) (Math.random() * FIRST_NUMBER_OF_THE_PROGRESSION) + ERROR_RATE;
    }
    public static int getRandomDiffOfProgression() {
        return (int) (Math.random() * DIFF_OF_THE_PROGRESSION) + DIFF_OF_THE_PROGRESSION;
    }
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

        for (int i = 0; i < questionsAndAnswers.length; i++) {
            int lengthOfProgression = getRandomLengthProgression();
            int diffOfProgression = getRandomDiffOfProgression();
            int firstNumber = getRandomFirstNumberOfProgression();

            int random = getRandomElementProgression(lengthOfProgression);

            int[] progression = getRandomProgression(lengthOfProgression, diffOfProgression, firstNumber);

            String result = Arrays.stream(progression)
                    .mapToObj(String::valueOf)
                    .collect(Collectors.joining(" ")).replace(String.valueOf(progression[random]), "..");

            String finalAnswer = String.valueOf(progression[random]);

            questionsAndAnswers[i] = new String[] {result, finalAnswer};
        }
        Engine1.run(questionsAndAnswers, "Progression");

    }
}
