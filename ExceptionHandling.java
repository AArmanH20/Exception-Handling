/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionhandling;

/**
 *
 * @author Lenovo
 */
import java.util.Scanner;
public class ExceptionHandling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try
        {
            int a,b,c ;
            Scanner KB = new Scanner(System.in);
            
            System.out.print("Enter First Number:");
            a=KB.nextInt();
            
             System.out.print("Enter Second Number:");
            b=KB.nextInt();
            
            c=a/b;
            System.out.println("Result:"+c);
        }
        catch(ArithmeticException e)
        {
            System.out.print("Error:"+e.getMessage());
            System.out.print("Error:"+e);
        }
        System.out.println("End of Program...");
            
    }
    
}
