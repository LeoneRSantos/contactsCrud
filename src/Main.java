//import java.util.Scanner;

import actions.ContactActions;
import actions.GeneralActions;
import models.Person;
import models.Phone;

/** November 1st, 2021
* @author Leone Rodrigues Santos 
*/

public class Main{

    
    public static void main(String[] args) {
        GeneralActions ga = new GeneralActions();
        ContactActions ca = new ContactActions();
        Person ps = new Person();
        Phone phone = new Phone();

        boolean keep = true;

        while (keep) {
            
            GeneralActions.printMenu();
            int option = ca.collectOption();

            switch (option) {
                
                case 0:
                    keep = ga.wantContinue();
                    break;
                
                case 1: // Add
                    ContactActions.persons.add(ps.createPerson());
                    ContactActions.phones.add(phone.createPhone());
                    System.out.println("\nContact added.\n");
                    break;

                case 2: // Remove
                    ga.printList();
                    option = ca.collectOption();

                    try {
                        ContactActions.persons.remove(option);
                        ContactActions.phones.remove(option);
                        System.out.print("\nContact removed.\n");
                    } 
                    catch (IndexOutOfBoundsException in) {
                        System.out.print("\nInvalid index. Please, check your option entered.\n");
                    }
                    
                    break;

                case 3: // Edit
                    ga.printList();
                    option = ca.collectOption();
                    ca.changeContact(option);
                    break;

                case 4: // Look for
                    ca.lookForContact();
                    break;
                
                case 5: // Print list
                    ga.printList();
                    break;

                default:
                    System.out.println("Unknown option. Please, enter your option again.\n");
                    continue;
            }
        }

        System.out.println("Thanks for use!\n");
    }
}