package baseball.components;

import baseball.components.dto.Score;

import static baseball.components.CodeList.*;

public class Referee {

    private String result;

    public void playBall(String result){
        this.result = result;
    }


    public Score judge(String input){
        Score score = new Score();


        for(int i=0; i<SCORE_LENGTH; i++){
            String scoreCode = "";
            String temp = input.substring(i,i+1);

            scoreCode = judgeProcessing(temp,i);
            score.countUp(scoreCode);
        }

        score.isThisFourBall();

        return score;
    }

    public String judgeProcessing(String temp, int index){
        if(!this.result.contains(temp)){
            return RESULT_NOTING;
        }

        if(this.result.indexOf(temp) == index){
            return RESULT_STRIKE;
        }

        return RESULT_BALL;
    }


    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
