package com.bridgelabzs;
import java.util.Random;
public class OptionCheck {

    
    public static void main(String args[]){
        int Position = 0;
        Random rand = new Random();
        int diceValue = (int)Math.floor(Math.random()*(6-1+1)+1);
        System.out.println(diceValue);
        int Option=rand.nextInt(3);
        if(Option==0)
             System.out.println("No Play");
        else if (Option==1)
             System.out.println("Ladder");
             Position+=diceValue;
             System.out.println("Current Position is "+Position);
        else { 
            System.out.println("Snake");
            Position+=diceValue;
            System.out.println("Current position is "+Position);
        }           
    }
}
    


