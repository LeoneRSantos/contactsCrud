package exceptions;

/** November 18th, 2021
*  @author Leone Rodrigues Santos
*/

public class InvalidPhoneNumberException extends Exception{

    @Override
    public String toString() {
        
        return "\nNumber invalid, enter only nine algarisms.\n";
    }
    
}
