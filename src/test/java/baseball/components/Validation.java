package baseball.components;

import java.util.regex.Pattern;

public class Validation {

    private static Validation vali = new Validation();

    private Validation (){

    }

    public static Validation getValidaion(){
        return vali;
    }

    public boolean scoreInputVali(String input){
        boolean flag = true;
        try {
            String pattern = "^[0-9]*$";

            //길이 벨리데이션
            if(!(input.length()==3)){
                flag = false;
            }

            //숫자 외에 다른 값 여부 벨리데이션
            if(!Pattern.matches(pattern,input)){
                flag = false;
            }
        }catch (NullPointerException e ){
            flag = false;
        }
        return flag;
    }
}
