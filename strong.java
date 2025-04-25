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
public class Strong {

    /**
     * @param args the command line arguments
     */
    static int fact(int n){
        if (n==0){
    return 1;
}
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn=new Scanner(System.in);
        int n,sum=0;
        System.out.println("enter a number:");
        n=scn.nextInt();
        int num=n;
        int digit=0;
        while(n>0){
            digit=n%10;
            sum+=fact(digit);
            n=n/10;
        }
        if(sum==num){
            System.out.println(num+" is a strong number ");
        }
        else{
        System.out.println(num+" is not strong number ");
        }
    }
    
}
