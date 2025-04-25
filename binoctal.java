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
public class BintoOctal {

    /**
     * @param args the command line arguments
     */
    static int getdec(int n){
        int dec=0;
        int count=1;
        while(n>0){
            dec=(n%10)*count+dec;
            count*=2;
            n=n/10;
        }
            
            return dec;
        }
    static int getoct(int n){
        n=getdec(n);
        int oct=0;
        int count=1;
        while(n>0){
            oct=(n%8)*count+oct;
            n/=8;
            count*=10;
        }
        return oct;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn=new Scanner(System.in);
        System.out.println("enter binary number:");
        int num;
        num=scn.nextInt();
        int binary=getoct(num);
        System.out.println("octal number:"+binary);
        scn.close();
    }
    
}
