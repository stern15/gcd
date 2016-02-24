/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gcd;
import java.util.*;
/**
 *
 * @author semasuka
 */
public class Gcd {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in); // scan the input
        System.out.print("First number:");
        int a = sc.nextInt();
         System.out.print("Second number:");
        int b = sc.nextInt();
    System.out.println("HCF of the numbers is: "+divide(a, b));
    }
    
   public static int divide(int a, int b){
       
   int x;
   do{
        x = a % b ;
       if(x!=0)
       {
       a = b;
       b = x;
       }
        
    }while(x!=0);
    return b;
   }
}
