package baseball.components;

public class ScoreMaker {

    private Validation vali = Validation.getValidaion();



    public String getScore(){
        double randomNumber = Math.random();
        int length = 3;
        String number = Double.toString(randomNumber);
        String result = number.substring(3,length+3);

        return result;
    }

    public int [] scoreConverter(String input){

        if(!vali.scoreInputVali(input)) {return null;}

        int length = input.length();
        int[] result = new int[length];

        for(int i = 0 ; i < length; i++){
            result[i] = input.charAt(i) - '0';
        }

        return result;
    }

}
