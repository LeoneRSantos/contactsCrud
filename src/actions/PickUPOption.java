package actions;

import java.util.Scanner;

/** November 17th, 2021
* @author Leone Rodrigues Santos 
*/

public class PickUPOption {

    static Scanner sc = new Scanner(System.in);

    // To pick up the option

    public static int collectOption(){

        int option = 6;

        try {
            System.out.print("\nEnter your option: ");
            option = Integer.parseInt(sc.nextLine());
        } 
        
        catch (NumberFormatException e) {
                       
        }

        return option;
    }
    
}
