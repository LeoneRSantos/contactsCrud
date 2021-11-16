package actions;

import java.util.Scanner;

import exceptions.EmptyListException;
import models.Person;


/** November 1st, 2021
* @author Leone Rodrigues Santos 
*/

public class GeneralActions {

    Scanner scan = new Scanner(System.in);
    ContactActions cg = new ContactActions();
    Person test = new Person();

    // To print the menu 

    public static void printMenu(){

        StringBuilder menu = new StringBuilder();

        menu.append("\n\n----- Contacts menu -----\n");
        menu.append("1) Add new contact\n");
        menu.append("2) Remove contact\n");
        menu.append("3) Edit contact\n");
        menu.append("4) Search contact\n");
        menu.append("5) Print all contacts\n");
        menu.append("0) Exit\n");

        System.out.println(menu.toString());
    }
    

    // To check if user want break the execution

    public boolean wantContinue(){

        System.out.print("\nDo you really want to quit (yes/ no)? ");
        String ans = scan.nextLine();
        return ans.toLowerCase().equals("yes") ? false : true;
    }

    // To print the list

    public void printList() throws EmptyListException{

        // if (ContactActions.persons.isEmpty()) {
        //    System.out.print("\nThere're no contacts.\n");
        // }

        // if (ContactActions.phones.isEmpty()) {
        //     System.out.print("There're no phone numbers.\n");
        // }
        if (ContactActions.persons.isEmpty() || ContactActions.phones.isEmpty()) {
            throw new EmptyListException();
        }

        else{
            
            int i = 0, l = 0;
            for (Person per : ContactActions.persons) {
                
                System.out.println("------------------------------");
                System.out.print("\n"+l+"\n\nName: "+per.getName()+"\nNickname: "+per.getNick());
                System.out.print("\nPhone number: "+"("+ContactActions.phones.get(i).getddd() +") ");
                System.out.print(ContactActions.phones.get(i).getNumber()+"\n\n");
                System.out.println("------------------------------\n");
                i++;
                l++;
            }
        }
    }
}
