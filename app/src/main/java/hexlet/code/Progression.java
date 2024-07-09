package hexlet.code;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;


public class Progression {
    public static int getRandomLengthProgression() {
        int rangeOfProgression = 5;
        return (int) (Math.random() * rangeOfProgression) + rangeOfProgression;
    }

    public static int getRandomFirstNumberOfProgression() {
        int firstNumberOfProgression = 99;
        int errorRate = 1;
        return (int) (Math.random() * firstNumberOfProgression) + errorRate;
    }

    public static int getRandomDiffOfProgression() {
        int differenceOfTheProgression = 2;
        return (int) (Math.random() * differenceOfTheProgression) + differenceOfTheProgression;
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
        int numberOfRounds = 3;
        for (int i = 0; i < numberOfRounds; i++) {
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
        int successRate = 3;
        if (count == successRate) {
            System.out.println("Congratulations, " + name + "!");
        }
    }


}
