package exceptions;

/** November 13th, 2021
* @author Leone Rodrigues Santos 
*/

public class EmptyListException extends Exception{

    @Override
    public String toString() {
        
        return "\nThere're no contacts.\n" + "There're no phone numbers.\n";
    }
    
}
