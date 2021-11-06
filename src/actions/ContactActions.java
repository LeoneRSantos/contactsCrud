package actions;

import java.util.ArrayList;
import java.util.Scanner;

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
        String newDDD;
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
                newDDD = changePhone.receiveDDD();
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
                newDDD = changePhone.receiveDDD();
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

    // To look for a contact

    public void lookForContact() {
        
        System.out.print("\n\nEnter the contact name: ");
        String lfName = sc.nextLine();

        System.out.print("\nEnter the contact nickname: ");
        String lfNickname = sc.nextLine();

        System.out.print("\nEnter the contact DDD: ");
        String lfDDD = sc.nextLine();

        System.out.print("\nEnter the contact number: ");
        String lfNumber = sc.nextLine();

        int aux = 0;

        for (Person p : persons) {
            
            String n = p.getName(), ni = p.getNick(); 

            String d = ContactActions.phones.get(aux).getddd();

            String num = ContactActions.phones.get(aux).getNumber();

            if (n.toLowerCase().equals(lfName) || n.toUpperCase().equals(lfName)) {
                System.out.print("\nContact found by name.\n");
                
                System.out.println("------------------------------");
                System.out.print("\nName: "+n+"\nNickname: "+ni+"\n");
                System.out.print("Phone number: "+ "("+d+") "+ num+"\n\n");
                System.out.println("------------------------------\n");
            }

            else if (ni.toLowerCase().equals(lfNickname) || ni.toUpperCase().equals(lfNickname)){
                System.out.print("\nContact found by nickname.\n");

                System.out.println("------------------------------");
                System.out.print("\nName: "+n+"\nNickname: "+ni+"\n");
                System.out.print("Phone number: "+ "("+d+") "+ num+"\n\n");
                System.out.println("------------------------------\n");
            }

            else if(d.equals(lfDDD)){
                System.out.print("\nContact found by DDD.\n");

                System.out.println("------------------------------");
                System.out.print("\nName: "+n+"\nNickname: "+ni+"\n");
                System.out.print("Phone number: "+ "("+d+") "+ num+"\n\n");
                System.out.println("------------------------------\n");
            }

            else if (num.equals(lfNumber)) {
                
                System.out.print("\nContact found by number.\n");

                System.out.println("------------------------------");
                System.out.print("\nName: "+n+"\nNickname: "+ni+"\n");
                System.out.print("Phone number: "+ "("+d+") "+ num+"\n\n");
                System.out.println("------------------------------\n");
            }

            else{
                System.out.print("\nNo contacts found.\n");
            }

            aux++;
        }
    }

    // To pick up the option

    public int collectOption(){

        System.out.print("\nEnter your option: ");
        int option = Integer.parseInt(sc.nextLine());

        return option;
    }
    
}
