package exceptions;

/** November 17th, 2021
* @author Leone Rodrigues Santos 
*/

public class InvalidDDDException extends Exception{

    @Override
    public String toString() {
        
        return "\nInvalid DDD, enter only three algarism.\n";
    }
    
}
