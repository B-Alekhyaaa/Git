
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author s571697 Bokka Alekhya
 */
public class Survey {
    
    public static void main(String[] args)
    {
        Scanner sr = new Scanner (System.in);
        System.out.print("Enter the first name: ");
        String fsn = sr.nextLine();
        System.out.print("Enter the last name: ");
        String lsn = sr.nextLine();
        System.out.println("********************Survey details********************");
        String upcase = fsn.toUpperCase() + " " + lsn.toLowerCase();
        System.out.println("The full name is " +upcase);
        int le = upcase.length();
        System.out.println("The length of the full name is " +le);
        char ind = upcase.charAt(5);
        
        //output
        System.out.println("The character at index 5 of full name is " +ind);
        
        
    }
    
}
