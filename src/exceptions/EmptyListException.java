package exceptions;

public class EmptyListException extends Exception{

    @Override
    public String toString() {
        
        return "\nThere're no contacts.\n" + "There're no phone numbers.\n";
    }
    
}
