package actions;

import java.util.Scanner;

import models.Person;

/** November 13th, 2021
* @author Leone Rodrigues Santos 
*/

public class LookForAContact{

    Scanner sc = new Scanner(System.in);
    
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

        for (Person p : ContactActions.persons) {
            
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
}
