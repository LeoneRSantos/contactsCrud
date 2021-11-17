package models;

import java.util.Scanner;

import exceptions.InvalidDDDException;

/** November 1st, 2021
* @author Leone Rodrigues Santos 
*/

public class Phone {
    
    Scanner scan = new Scanner(System.in);

    private String number;
    private String ddd;


    // Constructor

    public Phone(){

    }

    public Phone(String ddd, String number){

        setNumber(number);
        setddd(ddd);
    }
    
    // Setters

    public void setNumber(String number) {
        this.number = number;
    }

    public void setddd(String ddd) {
        this.ddd = ddd;
    }


    //Getters 

    public String getNumber() {
        
        return number;
    }

    public String getddd() {
        
        return ddd;
    }

    // To collect DDD

    public String receiveDDD() throws InvalidDDDException{

        System.out.print("\nEnter the DDD number: ");
        String currentDDD = scan.nextLine();

        if (currentDDD.length() > 3) {
            throw new InvalidDDDException();
            
        }

        return currentDDD;
    }

    // To collect number

    public String receiveNumber(){

        System.out.print("\nEnter the phone number: ");
        String currentNumber = scan.nextLine();

        if (currentNumber.length() > 9) {
            System.out.print("\nNumber invalid, enter only nine algarisms.\n");
            currentNumber = " ";
        }

        return currentNumber;
    }

    // To create a phone number

    public Phone createPhone(){
        String cDDD = " ";
        try {
            cDDD = receiveDDD();
        } catch (InvalidDDDException iDDD) {
            
            System.out.print(iDDD.toString());
        }
        String cNumber = receiveNumber();

        return new Phone(cDDD, cNumber);
    }
}
