package baseball.components;


public class ScoreMaker {

    private Validation vali = Validation.getValidaion();



    // 1~9로 이루어진 3개의 난수 생성
    public String getScore(){
        double randomNumber = Math.random();
        int length = 3;
        String number = Double.toString(randomNumber);
        String result = number.substring(3,length+3);
        
        //생성된 난수에 0 포함 -> 난수 생성 다시 진행
        if(result.contains("0")) {return getScore();};

        return result;
    }

}
