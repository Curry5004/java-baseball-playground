package baseball.components;

import baseball.components.dto.Vali;

import java.util.regex.Pattern;

import static baseball.components.CodeList.SCORE_LENGTH;

public class Validation {

    private static Validation vali = new Validation();

    private Validation (){

    }

    public static Validation getValidaion(){
        return vali;
    }

    public boolean inputVali(Vali vali){
        boolean flag = true;
        String pattern = vali.getPattern();
        int length = vali.getLength();
        String input = vali.getInput();

        //공란 입력 Vali
        if(input==null){
            return flag = false;
        }

        //숫자 외에 다른 값 여부 벨리데이션,
        if(!Pattern.matches(pattern,input)){
            return flag = false;
        }

        //길이 벨리데이션
        if(!(input.length()==length)){
            return flag = false;
        }

        if(isDuplicate(input)){
            return flag = false;
        }

        return flag;
    }

    /**
     * 중복된 값이 있는가?
     */
    public boolean isDuplicate(String input){
        String flag = "";

        for(int i = 0; i<SCORE_LENGTH-1; i++){
            String temp = input.substring(i,i+1);
            String control = input.substring(i+1, SCORE_LENGTH);

            flag = flag + control.contains(temp);
        }

        if(flag.contains("true")){
            return true;
        }

        return false;
    }
}
