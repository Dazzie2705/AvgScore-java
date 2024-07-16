/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tbm;
import java.util.Scanner;

/**
 *
 * @author Dazte
 */
public class TBM {
    

    public static void main(String[] args) {
        System.out.println("Hello World!!!");
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Your name ?");
        String name = sc.nextLine();
        
        System.out.println("1st subject score ?");
        float score1 = Float.parseFloat(sc.nextLine());
        
        System.out.println("2nd subject score ?");
        float score2 = Float.parseFloat(sc.nextLine());
        
        
        System.out.println("3rd subject score ?");
        float score3 = Float.parseFloat(sc.nextLine());
        float avgscore = (float)Math.round(((score1 + score2 + score3)/3)*100)/100;
        
        System.out.println("Hello " + name + ", Your average score is: " + avgscore );
    }
}
