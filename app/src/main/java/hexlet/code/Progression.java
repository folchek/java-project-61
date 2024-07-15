package hexlet.code;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;


public class Progression {
    public static final int FIRST_NUMBER_OF_THE_PROGRESSION = 98;
    public static final int DIFF_OF_THE_PROGRESSION = 2;
    public static final int ERROR_RATE = 1;
    public static final int RANGE_OF_THE_PROGRESSION = 5;
    public static final int NUMBER_OF_ROUNDS = 3;
    public static final int SUCCESS_RATE = 3;
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

    public static void runProgression() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        Scanner forName = new Scanner(System.in);
        String name = forName.nextLine();
        System.out.println("Hello, " + name + "!");

        System.out.println("What number is missing in the progression?");
        Scanner forAnswers = new Scanner(System.in);
        int count = 0;
        for (int i = 0; i < NUMBER_OF_ROUNDS; i++) {
            int lengthOfProgression = getRandomLengthProgression();
            int diffOfProgression = getRandomDiffOfProgression();
            int firstNumber = getRandomFirstNumberOfProgression();

            int[] progression = new int[lengthOfProgression];

            for (int j = 0; j < lengthOfProgression; j++) {
                progression[j] = firstNumber;
                firstNumber += diffOfProgression;
            }
            int random = getRandomElementProgression(lengthOfProgression);


           // String cleanOutput = Arrays.toString(progression).replace(String.valueOf(progression[random]), "..");

            String result = Arrays.stream(progression)
                    .mapToObj(String::valueOf)
                    .collect(Collectors.joining(" ")).replace(String.valueOf(progression[random]), "..");

            Engine.questionArray(result);
            int answer = forAnswers.nextInt();
            Engine.userIntAnswer(answer);

            if (answer == progression[random]) {
                Engine.correctAnswer();
                count++;
            }
            if (!(answer == progression[random])) {
                System.out.println(answer + " is wrong answer ;(. Correct answer was " + progression[random] + ".");
                System.out.println("Let's try again, " + name + "!");
                break;
            }

        }
        if (count == SUCCESS_RATE) {
            System.out.println("Congratulations, " + name + "!");

        }
    }


}
