package caluculPro;

import java.util.Scanner;

public class Calcul {

    private Scanner scan;               //입력부
    private int status;                 //현재 저장 결과
    private String symbol;              //수학 기호
    public Calcul (){
        this.scan = new Scanner(System.in);
        this.status = 0;
        this.symbol = "";
    }

    public int input(){
        String value = scan.nextLine();
        String[] values = value.split("");
        int length = values.length;
        this.status = Integer.parseInt(values[0]);

        for(int i = 1;  i < length; i++){
            String param =  values[i];
            boolean numVali = isThisNumber(param);
            calculate(numVali, param);
        }

        return this.status;
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

    public void calculate (boolean status, String param){
        if(status){
            this.symbol = param;
            return;
        }

        switch (this.symbol){
            case "/":
                this.status = this.status / Integer.parseInt(param);
            case "*":
                this.status = this.status * Integer.parseInt(param);
            case "+":
                this.status = this.status + Integer.parseInt(param);
            case "-":
                this.status = this.status - Integer.parseInt(param);
        }
    }
}
