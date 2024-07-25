package hexlet.code;

public class Utils {

    public static final int HIGH = 100;

    public static final int LOW = 1;

    public static int getRandomNumber(int start, int finish) {
        int number = (int) (start + (Math.random() * finish));
        return number;
    }
}
