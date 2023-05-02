package baseball;

public class ValidationUnit {

    private static final int SCORE_LENGTH = 3;
    private static final int MAX_NO = 9;
    private static final int MIN_NO = 1;

    public static boolean isThatThreeNumber(int number) {
        if((int)(Math.log10(number)+1)==SCORE_LEgNGTH){
            return true;
        }
        return false;
    }

    public static boolean number1to9Vali(int inputNumber) {
        if(inputNumber<=MAX_NO && inputNumber>=MIN_NO){
            return true;
        }
        return false;
    }

    public static boolean numberDuplicationValidation(int input) {
        String number = String.valueOf(input);

        return false;
    }
}
