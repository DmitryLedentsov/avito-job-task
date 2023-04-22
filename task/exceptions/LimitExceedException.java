package task.exceptions;

public class LimitExceedException extends IllegalArgumentException{
    public LimitExceedException(){
        super("number too big");
    }
}
