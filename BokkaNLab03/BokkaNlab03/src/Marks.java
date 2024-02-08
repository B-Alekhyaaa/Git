
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author s571697 Bokka Alekhya
 */
public class Marks {
    
    public static void main(String[] args)
    {
        //Scanner function
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter the marks in Mathematics: ");
        double mt = sn.nextDouble();
        System.out.print("Enter the marks in Physics: ");
        double ps = sn.nextDouble();
        System.out.print("Enter the marks in Chemistry: ");
        double cm = sn.nextDouble();
        //calculating average
        double mxMarks = Math.max(mt, Math.max(ps,cm));
        double mnMarks = Math.min(mt, Math.min(ps,cm));
        double ag = (mt + ps +cm)/3;
        //output
        System.out.println("The maximum marks of the three subjects is " + mxMarks);
        System.out.println("The minimum marks of the three subjects is " + mnMarks);
        System.out.println("The average marks of the three subjects is " + ag);
        
    }
}
