package baseball.components;

import baseball.components.dto.Score;
import baseball.components.dto.Vali;

import java.util.Scanner;

import static baseball.components.CodeList.VALIDATION_MENU_PATTERN;
import static baseball.components.CodeList.VALIDATION_SCORE_MENU;

public class Game {
    private Referee referee;
    private ScoreMaker scoreMaker;
    private Scanner scan;
    private Validation validation = Validation.getValidaion();


    public Game(){
        this.scan = new Scanner(System.in);
    }

    public void resetGame(){
        this.referee = new Referee();
        this.scoreMaker = new ScoreMaker();
        String result = scoreMaker.getScore();
        referee.playBall(result);
    }

    public void playBall(boolean state){
        Score score;

        System.out.print("숫자를 입력해주세요 : ");
        String h = scan.next();

        Vali vali = new Vali(h, VALIDATION_MENU_PATTERN, VALIDATION_SCORE_MENU);
        if(validation.inputVali(vali))

        score = referee.judge(h);

        if(score.isTheGameDone()){
            replay();
        }
    }

    public void replay(){
        System.out.print("3개의 숫자를 모두 맞히셨습니다! 게임 종료 </br> 게임을 새로 시작허려면 1, 종료하려면 2를 입력하세요. </br>");
        String h = scan.next();

        Vali vali = new Vali(h, VALIDATION_MENU_PATTERN, VALIDATION_SCORE_MENU);

    }
}
