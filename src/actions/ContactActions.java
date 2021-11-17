package actions;

import java.util.ArrayList;
import java.util.Scanner;

import exceptions.InvalidDDDException;
import models.Person;
import models.Phone;

/** November 1st, 2021
* @author Leone Rodrigues Santos 
*/

public class ContactActions {

    Scanner sc = new Scanner(System.in);
    
    // Constructor

    public ContactActions(){
        
    }

    // Contacts data base
    public static ArrayList <Person> persons = new ArrayList<>();
    public static ArrayList <Phone> phones = new ArrayList<>();


    // To change a contact 

    public void changeContact(int position){

            System.out.print("\nEnter the option which you want edit: \n\n1)Name \n2)Nickname \n3)DDD \n4)Number \n5)All\n");
            int choose = collectOption();

            Person changePerson = persons.get(position);
            Phone changePhone = phones.get(position);

            String newName;
            String newNick;
            String newDDD = " ";
            String newNumber;

        switch (choose) {
            case 1:    // Name
                newName = changePerson.receiveName();
                changePerson.setName(newName);
                System.out.print("\nDone. Name has been changed.\n");
                break;
            
            case 2:
                newNick = changePerson.receiveNick();
                changePerson.setNick(newNick);
                System.out.print("\nDone. Nickname has been changed.\n");
                break;
            
            case 3:
            try {
                newDDD = changePhone.receiveDDD();
            } catch (InvalidDDDException e3) {
                
                System.out.print(e3.toString());
            }
                changePhone.setddd(newDDD);
                System.out.print("\nDone. DDD has been changed.\n");
                break;
            
            case 4:
                newNumber = changePhone.receiveNumber();
                changePhone.setNumber(newNumber);
                System.out.print("\nDone. Number has been changed.\n");
                break;

            case 5:
                newName = changePerson.receiveName();
                newNick = changePerson.receiveNick();
            try {
                newDDD = changePhone.receiveDDD();
            } catch (InvalidDDDException e5) {
                
                System.out.print(e5.toString());
            }
                newNumber = changePhone.receiveNumber();

                changePerson.setName(newName);
                changePerson.setNick(newNick);

                changePhone.setddd(newDDD);
                changePhone.setNumber(newNumber);
                
                System.out.print("\nDone. All characteristics has been edited.\n");
                break;

            default:
                System.out.println("Unknown option\n");
                break;
        }
           
    }

    // To pick up the option

    public int collectOption(){

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
