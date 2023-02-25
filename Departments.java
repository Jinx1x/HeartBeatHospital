/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hearthospital;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Jinx
 */
public class Departments {
   public static void main(String[] args) {
    ArrayList<String> Department = new ArrayList<String>();
    Department.add("Nursing Dep");
    Department.add("Rehab Dep");
    Department.add("Surgical Dep");
    Department.add("Pharmacy");
    System.out.println(Department);
    
    System.out.println("Choose the Department");
    
    Scanner scanner = new Scanner(System.in);
    
     boolean check = true;
        while (check == true){
             int chosenNum = scanner.nextInt();
            switch (chosenNum){
                
                case 1:
                    Scanner scanChoice = new Scanner(System.in);
                    ArrayList<String> PeopleInNurse = new ArrayList<String>();
        String choice = "";
        boolean contain = false; // declare the boolean variable for store the status of name matching
        
         do {
        System.out.println("Enter your first and last name: ");
        String name = scanChoice.nextLine();
        PeopleInNurse people = new PeopleInNurse(); // initialize a new people object
        people.setName(name); // set the name to above people
        PeopleInNurse.add(people); // add people object into ArrayList of People

        System.out.println("Would you like to enter another name? (Yes/No)");
        choice = scanChoice.nextLine();
         } while (choice.equalsIgnoreCase("Yes"));
         
         System.out.println("Please enter the name for search");
    String name = scanChoice.nextLine();
    
     for (int i = 0; i < PeopleInNurse.size(); i++) {
        if(PeopleInNurse.get(i).equals(name)) {
            System.out.println(name+" is already in the list..");
            contain = true; // set contain variable to true when match the given name with people in ArrayList
            break; // if match the name, break the loop
        }
    }
     if(!contain){ // if not contain the people with given name in ArrayList, execute following message
        System.out.println("this name is not in the list");
    }
     
                case 2:
                    Scanner scanChoice2 = new Scanner(System.in);
                    ArrayList<String> PeopleInRehab = new ArrayList<String>();
        String choice2 = "";
        boolean contain2 = false; // same as before it declares the boolean variable to store the status of name matching
        do { 
            System.out.println("Enter your first and last name: ");
            String nameRehab = scanChoice2.nextLine(); //to store a name for Rehab arraylist
            PeopleInRehab peopleRehab = new PeopleInRehab(); // initialize a new people object
            peopleRehab.add(nameRehab); // set the name in the list
            
            System.out.println("Would you like to enter another name? (Yes/No)");
        choice2 = scanChoice2.nextLine();
        }while(choice2.equalsIgnoreCase("Yes"));
               
        System.out.println("Please enter the name for search");
        String nameRehab = scanChoice2.nextLine();
        
        for (int i = 0; i <PeopleInRehab.size(); i++)
        if(PeopleInRehab.get(i).equals(nameRehab)){
            System.out.println(nameRehab+" is already in the list..");
            contain2 = true; // set contain variable to true when match the given name with people in ArrayList
            break; // if match the name, break the loop
        }
        
        if(!contain2){ // if not contain the people with given name in ArrayList, execute following message
        System.out.println("this name is not in the list");
        }
            
                case 3:
                    Scanner scanChoice3 = new Scanner(System.in);
                    ArrayList<String> PeopleInSurgical = new ArrayList<String>();
                    String choice3 = "";
                    boolean contain3 = false; // same as before it declares the boolean variable to store the status of name matching
                    do{
                        System.out.println("Enter your first and last name: ");
                        String nameSurgical = scanChoice3.nextLine();
                        PeopleInSurgical peopleSurgical = new PeopleInSurgical();
                        PeopleInSurgical.add(peopleSurgical);
                        
                        System.out.println("Would you like to enter another name? (Yes/No)");
                        choice3 = scanChoice3.nextLine();
                    }while(choice3.equalsIgnoreCase("Yes"));
                    
                    System.out.println("Pleaes enter the name for search");
                    String nameSurgic = scanChoice3.nextLine();
                    
                     for (int i = 0; i < PeopleInSurgical.size(); i++) {
                     if(PeopleInSurgical.get(i).equals(nameSurgic)){
                    System.out.println(nameSurgic+" is already in the list..");
                    contain3 = true; // set contain variable to true when match the given name with people in ArrayList
                    break; // if match the name, break the loop
                     }
                     if(!contain3){ // if not contain the people with given name in ArrayList, execute following message
                    System.out.println("this name is not in the list");
            }
        }
                case 4:
                    Pharmacy.main(args);
                case 5:
                    check = false;
  }
}