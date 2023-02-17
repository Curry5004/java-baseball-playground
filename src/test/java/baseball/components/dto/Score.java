package baseball.components.dto;

import static baseball.components.CodeList.*;

public class Score {

    private int ballCount;
    private int strikeCount;
    private boolean fourBall;

    public Score(){
        this.ballCount=0;
        this.strikeCount=0;
    }


    public void countUp(String code){
        if(code.equals(RESULT_BALL)){
            ballCount = ballCount + 1;
        }

        if(code.equals(RESULT_STRIKE)){
            strikeCount = strikeCount + 1;
        }

    }

    public boolean isThisFourBall(){
        if(strikeCount==0 && ballCount ==0){
            return fourBall = true;
        }
        return fourBall = false;
    }

    public boolean isTheGameDone(){
        if(strikeCount==3){
            return true;
        }
        return false;
    }

    public int getBallCount() {
        return ballCount;
    }

    public void setBallCount(int ballCount) {
        this.ballCount = ballCount;
    }

    public int getStrikeCount() {
        return strikeCount;
    }

    public void setStrikeCount(int strikeCount) {
        this.strikeCount = strikeCount;
    }
}
