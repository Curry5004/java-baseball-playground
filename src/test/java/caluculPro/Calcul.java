package caluculPro;

import java.util.Scanner;

public class Calcul {

    private Scanner scan;               //입력부
    private int status;                 //현재 저장 결과
    private String symbol;              //수학 기호
    public Calcul (){
        this.scan = new Scanner(System.in);
        this.symbol = "";
    }


    public int start (String input){
        String [] params = input.split(" ");

        int count = params.length;
        status = Integer.parseInt(params[0]);
        for (int i = 1; i < count; i++){
            boolean number = isThisNumber(params[i]);
            calculate(number, params[i]);
        }
        return status;
    }


    public boolean isThisNumber (String param){
        boolean flag = true;
        try{

            int test = Integer.parseInt(param);

        } catch (Exception e){

            flag = false;

        } finally {
            return flag;
        }
    }

    public void calculate (boolean flag, String param){
        if(!flag){
            symbol = param;
            return;
        }


        if(symbol.equals("/")){
            status = status / Integer.parseInt(param);
            return;
        }

        if(symbol.equals("*")){
            status = status * Integer.parseInt(param);
            return;
        }

        if(symbol.equals("+")){
            status = status + Integer.parseInt(param);
            return;
        }

        if(symbol.equals("-")){
            status = status - Integer.parseInt(param);
            return;
        }
    }
}
