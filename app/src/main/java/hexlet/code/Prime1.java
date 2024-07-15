package hexlet.code;

public class Prime1 {
    public static final int NUMBER_OF_ROUND = 3;
    public static final int RANDOM_NUMBER = 100;
    public static final int ERROR_RATE = 1;

    public static int getRandomNumber() {
        return (int) (Math.random() * RANDOM_NUMBER) + ERROR_RATE;
    }
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

        int[][] questionsAndAnswers = new int[NUMBER_OF_ROUND][];
//В результате проверки методом isSimple, answer становится равным 0 или 1. 0 - означает неверный ответ, 1 - верный.
        for (int i = 0; i < questionsAndAnswers.length; i++) {
            int number = getRandomNumber();
            int answer = 0;
            if (isSimple(number)) {
                answer = 1;
            }
            questionsAndAnswers[i] = new int[] {number, answer};
        }
        Engine1.run(questionsAndAnswers, "Prime");
    }
}
