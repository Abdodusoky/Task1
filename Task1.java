/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.task1;

import java.util.Scanner;
public class Task1 {
static Scanner input =  new Scanner(System.in);
    public static void main(String[] args) {
             //Task1//
       System.out.println("Enter the number of student :");
        int s = input.nextInt();
        double degrees[]= new double[s];
        //to calc average //
        double sum = 0;
        for (int i = 0; i < s; i++) {
            System.out.printf("Enter degree of student %d :",(i+1));
            degrees[i]= input.nextInt();
            sum+=degrees[i];
        }
        double average = sum/s ;
        System.out.println("average = "+average );
        /////////////////////////                   
        // calc the highest //
        int count = 0 ;
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < s; j++) {
                if(degrees[i]>=degrees[j]){
                        count++ ;
                }
            }
                if(count==s){
                System.out.println("the highest degree = "+degrees[i]);
              } 
                else{
                         count=0 ;
                }        
         }
        
        // calac the last degree //
        
         for (int i = 0; i < s; i++) {
            for (int j = 0; j < s; j++) {
                if(degrees[i]<=degrees[j]){
                        count++ ;
                }
            }
                if(count==s){
                System.out.println("the last degree = "+degrees[i]);
              } 
                else{
                         count=0 ;
                }        
         }
    }
}
