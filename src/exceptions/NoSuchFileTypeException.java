package exceptions;

import java.util.NoSuchElementException;

public class NoSuchFileTypeException extends RuntimeException{
    public NoSuchFileTypeException(String message){
        super(message);
    }
}
