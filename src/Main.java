//import java.util.Scanner;

import actions.ContactActions;
import actions.GeneralActions;
import actions.LookForAContact;
import actions.PickUPOption;
import exceptions.EmptyListException;
import models.Person;
import models.Phone;

/** November 1st, 2021
* @author Leone Rodrigues Santos 
*/

public class Main{

    public static void main(String[] args) {
        GeneralActions ga = new GeneralActions();
        ContactActions ca = new ContactActions();
        LookForAContact lf = new LookForAContact();
        Person ps = new Person();
        Phone phone = new Phone();

        boolean keep = true;

        while (keep) {
            
            GeneralActions.printMenu();
            int option = PickUPOption.collectOption();

            switch (option) {
                
                case 0:
                    keep = ga.wantContinue();
                    break;
                
                case 1: // Add
                    ContactActions.persons.add(ps.createPerson());
                    ContactActions.phones.add(phone.createPhone());
                    System.out.print("\nContact added.\n");
                    break;

                case 2: // Remove
                    try {
                        ga.printList();
                        option = PickUPOption.collectOption();

                        ContactActions.persons.remove(option);
                        ContactActions.phones.remove(option);
                        System.out.print("\nContact removed.\n");
                    } 
                    catch (EmptyListException e2) {
                        System.out.print(e2.toString());
                    }
                    catch (IndexOutOfBoundsException in) {
                        System.out.print("\nInvalid index. Please, check your option entered.\n");
                    }
                    
                    break;

                case 3: // Edit
                      
                    try {
                        ga.printList();
                        ca.changeContact(PickUPOption.collectOption());
                    } 
                    catch (EmptyListException e3) {
                        System.out.print(e3.toString());
                    }
                    catch (IndexOutOfBoundsException in3) {
                        System.out.print("\nInvalid index. Please, check your option entered.\n");
                    }
                    
                    break;

                case 4: // Look for
                    lf.lookForContact();
                    break;
                
                case 5: // Print list

                    try {
                        ga.printList();
                    } 
                    catch (EmptyListException e5) {
                        System.out.print(e5.toString());
                    }
                    break;

                default:
                    System.out.println("Unknown option. Please, enter your option again.\n");
                    continue;
            }
        }

        System.out.println("Thanks for use!\n");
    }
}