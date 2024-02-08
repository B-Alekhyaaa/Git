
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author S571697 Bokka Alekhya
 */
public class Student {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // scanner function 
        
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter the  name: ");
        String  m = sn.nextLine();
        System.out.print("Enter the Student Id: ");
        String n = sn.nextLine();
        System.out.print("Enter the Major: ");
        String o = sn.nextLine();
        System.out.println("************* Student Details ***********");
        System.out.println(" Name of the Student: " + m);
        System.out.println("Student Id: " + n);
        System.out.println("Major: " + o);      
    }
    }
    

