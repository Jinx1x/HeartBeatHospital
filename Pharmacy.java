/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hearthospital;

import java.util.Scanner;

/**
 *
 * @author Jinx
 */
public class Pharmacy {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    boolean check = true;
        while (check == true){
            System.out.println("----Item List----");
            System.out.println("1_Panadol extra");
            System.out.println("2_cough drops");
            System.out.println("3_Brush");
            System.out.println("4_ToothPaste");
            System.out.println("5_skin care creams");
        
            int chosenNum = scanner.nextInt();
            switch (chosenNum){
                case 1:
                    System.out.println("Panadol Extra costs 10 Riyals..");
                    System.out.println("1_buy it");
                    System.out.println("2_cancel");
                    
                    int num1 = scanner.nextInt();
                    
                    if (num1 == 1){
                        System.out.println("You succesfully bought the Panadol!");
                        Departments.main(args);
                    } else {
                        System.out.println("you canceled the payment");
                        break;
                    }
                case 2:
                    System.out.println("cough drops costs 20 Riyals..");
                    System.out.println("1_buy it");
                    System.out.println("2_cancel");
                    
                    int num2 = scanner.nextInt();
                    
                    if (num2 == 1){
                        System.out.println("You succesfully bought the cough drops!");
                        Departments.main(args);
                    } else {
                        System.out.println("you canceled the payment");
                        break;
                    }
                case 3:
                    System.out.println("brush costs 37 Riyals..");
                    System.out.println("1_buy it");
                    System.out.println("2_cancel");
                    
                    int num3 = scanner.nextInt();
                    
                    if (num3 == 1){
                        System.out.println("You succesfully bought the brush!");
                        Departments.main(args);
                    } else {
                        System.out.println("you canceled the payment");
                        break;
                    }
                case 4:
                    System.out.println("tooth paste costs 29.99 Riyals..");
                    System.out.println("1_buy it");
                    System.out.println("2_cancel");
                    
                    int num4 = scanner.nextInt();
                    
                    if (num4 == 1){
                        System.out.println("You succesfully bought the tooth paste!");
                        Departments.main(args);
                    } else {
                        System.out.println("you canceled the payment");
                        break;
                    }
                case 5:
                    System.out.println("skin care creams costs 150 Riyals..");
                    System.out.println("1_buy it");
                    System.out.println("2_cancel");
                    
                    int num5 = scanner.nextInt();
                    
                    if (num5 == 1){
                        System.out.println("You succesfully bought the skin care creams!");
                        Departments.main(args);
                    } else {
                        System.out.println("you canceled the payment");
                        break;
                    }
            }
        }
    }
}
