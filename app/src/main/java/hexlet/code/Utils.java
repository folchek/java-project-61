package hexlet.code;

public class Utils {
    public static final int HIGH = 100;
    public static final int HIGH_FOR_PROGRESSION = 10;
    public static final int LOW_FOR_PROGRESSION = 5;
    public static final int LOW = 100;
    public static final int CHARACTER_COUNT = 3;
    public static final int DIFF = 3;
    public static int getRandomNumber(int start, int finish) {
        int number = (int) (start + (Math.random() * finish));
        return number;
    }
    public static char getRandomChar() {
        int index = (int) (Math.random() * CHARACTER_COUNT);
        char[] charArray = {'+', '-', '*'};
        return charArray[index];
    }
}
