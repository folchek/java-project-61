package hexlet.code;

import java.util.Scanner;

public class Engine1 {
    public static final int NUMBER_OF_ROUNDS = 3;
    public static final int SUCCESS_RATE = 3;

    public static void correctAnswer() {
        System.out.println("Correct!");
    }

    public static void run(int[][] questionsAndAnswers, String rules) {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        Scanner forName = new Scanner(System.in);
        String name = forName.nextLine();
        System.out.println("Hello, " + name + "!");
    if (rules.equals("Prime")) {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        for (int i = 0; i < questionsAndAnswers.length; i++) {
            int generatedQuestion = questionsAndAnswers[i][0];
            System.out.println("Question: " + generatedQuestion);
            String answer = scanner.nextLine();
                if (questionsAndAnswers[i][1] == 1 && answer.equals("yes")) {
                    correctAnswer();
                    count++;
                    continue;
                }
                if (questionsAndAnswers[i][1] == 0 && answer.equals("no")) {
                    correctAnswer();
                    count++;
                    continue;
                }
                if (questionsAndAnswers[i][1] == 1 && answer.equals("no")) {
                    System.out.println(answer + " is wrong answer ;(. Correct answer was 'yes' .");
                    System.out.println("Let's try again, " + name + "!");
                    break;
                }
                if (questionsAndAnswers[i][1] == 0 && answer.equals("yes")) {
                    System.out.println(answer + " is wrong answer ;(. Correct answer was 'no' .");
                    System.out.println("Let's try again, " + name + "!");
                    break;
                }
        }
        if (count == SUCCESS_RATE) {
            System.out.println("Congratulations, " + name + "!");
        }
    }
    if (rules.equals("Even")) {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        Scanner forEven = new Scanner(System.in);
        int count = 0;
        for (int i = 0; i < questionsAndAnswers.length; i++) {
            int generatedQuestion = questionsAndAnswers[i][0];
            System.out.println("Question: " + generatedQuestion);
            String answer = forEven.nextLine();
            if (questionsAndAnswers[i][1] == 1 && answer.equals("yes")) {
                correctAnswer();
                count++;
                continue;
            }
            if (questionsAndAnswers[i][1] == 1  && answer.equals("no")) {
                System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.");
                System.out.println("Let's try again, " + name + "!");
                break;
            }
            if (questionsAndAnswers[i][1] == 0  && answer.equals("no")) {
                correctAnswer();
                count++;
                continue;
            }
            if (questionsAndAnswers[i][1] == 0 && answer.equals("yes")) {
                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
                System.out.println("Let's try again, " + name + "!");
                break;
            }
        }
        if (count == SUCCESS_RATE) {
            System.out.println("Congratulations, " + name + "!");
        }
    }
    }
    public static void run(String[][] questionsAndAnswers, String rules1) {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        Scanner forName = new Scanner(System.in);
        String name = forName.nextLine();
        System.out.println("Hello, " + name + "!");
        if (rules1.equals("GCD")) {
            System.out.println("Find the greatest common divisor of given numbers.");
            Scanner forGCD = new Scanner(System.in);
            int count = 0;
            for (int i = 0; i < questionsAndAnswers.length; i++) {
                String  generatedQuestion = questionsAndAnswers[i][0];
                System.out.println("Question: " + generatedQuestion);
                String answer = forGCD.nextLine();
                if (answer.equals(questionsAndAnswers[i][1])) {
                    correctAnswer();
                    count++;
                    continue;
                } else {
                    System.out.println(answer + " is wrong answer ;(. Correct answer was " + questionsAndAnswers[i][1] + ".");
                    System.out.println("Let's try again, " + name + "!");
                    break;
                }
            }
            if (count == SUCCESS_RATE) {
                System.out.println("Congratulations, " + name + "!");
            }
        }
        if (rules1.equals("Calc")) {
            System.out.println("What is the result of the expression?");
            Scanner forCalc = new Scanner(System.in);
            int count = 0;
            for (int i = 0; i < questionsAndAnswers.length; i++) {
                String  generatedQuestion = questionsAndAnswers[i][0];
                System.out.println("Question: " + generatedQuestion);
                String answer = String.valueOf(forCalc.nextInt());
                if (answer.equals(questionsAndAnswers[i][1])) {
                    correctAnswer();
                    count++;
                    continue;
                } else {
                    System.out.println(answer + " is wrong answer ;(. Correct answer was " + questionsAndAnswers[i][1] + ".");
                    System.out.println("Let's try again, " + name + "!");
                    break;
                }
            }
            if (count == SUCCESS_RATE) {
                System.out.println("Congratulations, " + name + "!");
            }
        }
        if (rules1.equals("Progression")) {
            System.out.println("What number is missing in the progression?");
            Scanner forProg = new Scanner(System.in);
            int count = 0;

            for (int i = 0; i < questionsAndAnswers.length; i++) {
                String  generatedQuestion = questionsAndAnswers[i][0];
                System.out.println("Question: " + generatedQuestion);

                String answer = String.valueOf(forProg.nextInt());

                if (answer.equals(questionsAndAnswers[i][1])) {
                    correctAnswer();
                    count++;
                    continue;
                } else {
                    System.out.println(answer + " is wrong answer ;(. Correct answer was " + questionsAndAnswers[i][1] + ".");
                    System.out.println("Let's try again, " + name + "!");
                    break;
                }
            }
            if (count == SUCCESS_RATE) {
                System.out.println("Congratulations, " + name + "!");
                }
            }
        }
}


