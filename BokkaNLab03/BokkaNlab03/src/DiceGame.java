
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author s571697 Bokka Alekhya
 */
public class DiceGame {
    
    public static void main(String[] args)
    {
        Random rom = new Random();
        int fplayer = rom.nextInt(6)+1;
        int splayer = rom.nextInt(6)+1;
        int mx = Math.max(fplayer,splayer);
        //output
        System.out.println("The number secured by first player on the dice is " + fplayer);
        System.out.println("The number secured by second player on the dice is " + splayer);
        System.out.println("The highest number of both the players is " + mx);
    }
    
}
