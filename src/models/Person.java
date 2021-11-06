package models;

import java.util.Scanner;

/** November 1st, 2021
* @author Leone Rodrigues Santos 
*/

public class Person {
    
    Scanner scan = new Scanner(System.in);

    private String name;
    private String nickname;

    // Constructor

    public Person(){
        
    }

    public Person(String name, String nickname){

        setName(name);
        setNick(nickname);
    }

    // Setters

    public void setName(String name) {
        this.name = name;
    }

    public void setNick(String nickname) {
        this.nickname = nickname;
    }


    // Getters 

    public String getName() {
        
        return name;
    }

    public String getNick() {
        
        return nickname;
    }

    // To collect the name

    public String receiveName(){

        System.out.print("\nEnter the contact name: ");
        String currentName = scan.nextLine();

        return currentName;
    }

    // To collect the nickname

    public String receiveNick(){

        System.out.print("\nEnter the contact nickname: ");
        String currentNick = scan.nextLine();

        return currentNick;
    }

    // To create a new person

    public Person createPerson(){
        String name = receiveName();
        String nick = receiveNick();

        return new Person(name, nick);
    }
}
