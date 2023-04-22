package task.exceptions;

public class NotEnoughSizeException extends IllegalArgumentException{
    public NotEnoughSizeException(){
        super("array too small");
    }
}
