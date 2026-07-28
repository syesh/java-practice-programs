
package javaapplication292;
import java.util.Scanner;
import static javaapplication292.Strong.fact;

public class Armstrong {

    /**
     * @param args the command line arguments
     */
    static int cube(int n){
        return n*n*n;
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
            sum+=cube(digit);
            n=n/10;
        }
        if(sum==num){
            System.out.println(num+" is a armstrong number ");
        }
        else{
        System.out.println(num+" is not armstrong number ");
        }
    } 
    }
    

