package baseball.components;

import baseball.components.dto.Score;
import baseball.components.dto.Vali;

import java.util.Scanner;

import static baseball.components.CodeList.*;

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

    public void playBall(){
        Score score;

        System.out.print("숫자를 입력해주세요 : ");
        String h = scan.next();

        Vali vali = new Vali(h, VALIDATION_SCORE_PATTERN, VALIDATION_SCORE_LENGTH);

        if(!validation.inputVali(vali)){
            System.out.println("올바른 값을 입력해 주세요");
            playBall();
        }

        score = referee.judge(h);

        if(score.isTheGameDone()){
            endGame();
        }

        if(!score.isTheGameDone()){
            announcement(score);
        }
    }



    public void endGame(){
        System.out.print("<게임 종료> \n3개의 숫자를 모두 맞히셨습니다! \n게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요. \n");
        System.out.println("정답 : "+referee.getResult());
        String h = scan.next();

        Vali vali = new Vali(h, VALIDATION_MENU_PATTERN, VALIDATION_MENU_LENGTH);


        /**
         * Validation
         * */
        if(!validation.inputVali(vali)){
            System.out.println("올바른 값을 입력해 주세요");
            endGame();
        }


        /**
         * 입력값 벨리
         * */
        if(h.equals("1")){
            resetGame();
            playBall();
        }

        if(h.equals("2")){
            System.out.println("플레이해주셔서 감사합니다");
        }
    }

    public void announcement(Score score){
        String result = "";

        if(score.getBallCount()!=0){
            result = result + score.getBallCount() + "볼 ";
        }

        if(score.getStrikeCount()!=0){
            result = result + score.getStrikeCount() + "스트라이크";
        }

        if(score.isThisFourBall()){
            result = "낫싱";
        }

        System.out.println(result);

        playBall();
    }

}
