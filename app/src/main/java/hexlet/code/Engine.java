package hexlet.code;

public class Engine {

    public static void correctAnswer() {
        System.out.println("Correct!");
    }

     public static void questionNumber(int question) {
         System.out.println("Question: " + question);
     }

    public static void questionNumberForCalc(int question, int question2, char symbol) {
        System.out.println("Question: " + question + " " + symbol + " " + question2);
    }

     public static void userAnswer(String answer) {
         System.out.println("Your answer: " + answer);
     }

    public static void userIntAnswer(int answer) {
        System.out.println("Your answer: " + answer);
    }

}
