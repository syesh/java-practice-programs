/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication292;
import java.util.Scanner;

/**
 *
 * @author SMV
 */
public class DectoBin {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn=new Scanner(System.in);
        int n;
        System.out.println("enter a number:");
        n=scn.nextInt();
        int rem;
        String binary="";
        int num=n;
        
        while(num>0){
            rem=num%2;
            binary=rem+binary;
            num=num/2;
            
        }
        if(n==0){
            binary="0";
            
        }
        System.out.println("binary representayion:"+binary);
    }
    
}
