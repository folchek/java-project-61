package hexlet.code;

public class Utils {
    public static final int CHARACTER_COUNT = 3;
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
