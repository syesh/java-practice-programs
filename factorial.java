/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SMV
 */
import java.util.Scanner;
public class Factorial {

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
        int n;
        System.out.println("enter a number:");
        n=scn.nextInt();
        System.out.println("factorial of "+ n +" is "+ (fact(n)));
    }
    
}
