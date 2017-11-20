package ch.hslu.plab.CyberDojoNov;

public class BracketsPair {
    private char startingChar;
    private char matchingEnd;
    private boolean isOpen = true;
    public BracketsPair(char input, char matchingEnd) {
        this.startingChar = input;
        this.matchingEnd = matchingEnd;
    }
    public void Close(){
        this.isOpen = false;
    }

    public boolean canClose(char input){
        return input == matchingEnd;
    }

    public boolean isOpen() {
        return isOpen;
    }
}
