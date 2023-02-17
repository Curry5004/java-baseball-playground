package baseball.components.dto;

public class Vali {

    private String input;
    private String pattern;
    private int length;

    public Vali(String input, String pattern, int length){
        this.input = input;
        this.pattern = pattern;
        this.length = length;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
