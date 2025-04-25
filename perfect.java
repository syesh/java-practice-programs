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
public class Perfect {

    /**
     * @param args the command line arguments
     */
    static boolean perfect(int n){
        int sum=0;
        int i;
        for(i=1;i<n;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        if(sum==n){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn=new Scanner(System.in);
        int n;
        System.out.println("enter a number:");
        n=scn.nextInt();
        if(perfect(n)){
            System.out.println(n+" is a perfect number ");
        }
        else{
        System.out.println(n+" is not perfect number ");
        }
    }
    
}
