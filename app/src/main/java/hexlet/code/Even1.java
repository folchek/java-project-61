package hexlet.code;

public class Even1 {
    public static final int RANGE_OF_NUMBERS = 100;
    public static final int NUMBER_OF_ROUND = 3;

    public static int getRandomDiceNumber() {
        return (int) (Math.random() * RANGE_OF_NUMBERS);
    }
    public static boolean isEven(int number) {
        if(number % 2 == 0) {
            return true;
        }
        return false;
    }
    public static void run() {
        int [][] questionsAndAnswers = new int[NUMBER_OF_ROUND][];
//В результате проверки методом isEven, answer становится равным 0 или 1. 0 - означает неверный ответ, 1 - верный.
        for (int i = 0; i < questionsAndAnswers.length; i++) {
            int number = getRandomDiceNumber();
            int answer = 0;
            if (isEven(number)) {
                answer = 1;
            }
            questionsAndAnswers[i] = new int[] {number, answer};
        }
        Engine1.run(questionsAndAnswers, "Even");
    }
}
