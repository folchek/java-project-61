package hexlet.code;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;


public class Progression {
    public static int getRandomLengthProgression()
    {
        return (int) (Math.random() * 5) + 5;
    }

    public static int getRandomFirstNumberOfProgression()
    {
        return (int) (Math.random() * 99) + 1;
    }

    public static int getRandomDiffOfProgression()
    {
        return (int) (Math.random() * 2) + 2;
    }
    public static int getRandomElementProgression(int length)
    {
        return (int) (Math.random() * length);
    }

    public static void runProgression () {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        Scanner forName = new Scanner(System.in);
        String name = forName.nextLine();
        System.out.println("Hello, " + name + "!");

        System.out.println("What number is missing in the progression?");
        Scanner forAnswers = new Scanner(System.in);
        int count = 0;
        for (int i = 0; i < 3; i++) {
            int lengthOfProgression = getRandomLengthProgression();
            int diffOfProgression = getRandomDiffOfProgression();
            int firstNumber = getRandomFirstNumberOfProgression();

            int [] progression = new int[lengthOfProgression];

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
        if (count == 3) {
            System.out.println("Congratulations, " + name + "!");
        }
    }


}
