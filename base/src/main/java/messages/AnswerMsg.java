package messages;

import java.io.Serializable;

public class AnswerMsg implements Serializable {
    String answer;
    Status status;

    public AnswerMsg(){
        answer = "";
    }

    public void addMsg(String msg){
        answer += msg + "\n";
    }

    public void addError(String msg){
        answer += "error: " + msg + "\n";
    }

}
