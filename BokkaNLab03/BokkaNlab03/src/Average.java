
import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author s571697 Bokka Alekhya
 */
public class Average {
    
    public static void main(String[] args)
    {
        //calculate average score of three quizzes
        Scanner sn = new Scanner (System.in);
        System.out.print("Enter the first quiz score: ");
        double fq = sn.nextDouble();
        System.out.print("Enter the second quiz score: ");
        double sq = sn.nextDouble();
        System.out.print("Enter the third quiz score:");
        double tq = sn.nextDouble();
        double agscore = (fq + sq + tq)/3;
        DecimalFormat df = new DecimalFormat("##.##");
        String ag = df.format(agscore);
        System.out.println("The average score of the three quizzes is " + ag);
        
    }
    
}
