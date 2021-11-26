Who is winner in running competition? Players name in String array & Their running seconds in Integer array are given.

public class Task {
 
    public static void main(String[] args) 
    {
        Task obj = new Task();
 
        String players[] = { "Gowsy", "Mehra", "Gokii", "Manju", "Lakshmi", "Nandhini" };
        int seconds[] = { 50, 40, 25, 30, 90, 75 };
        int temp[] = { 50, 40, 25, 30, 90, 75 };
     
        String combine[] = obj.combineMethod(players, seconds);
        int sort[]       = obj.sortingMethod(seconds);
        obj.findWinner(combine, sort, temp);
    }
     
    public String[] combineMethod(String playersName[], int sec[]) 
    {
        String combine[] = new String[playersName.length];
        int i = 0;
         
        System.out.println("Players Name & their running seconds");
        for (i = 0; i < playersName.length; i++) 
        {
            combine[i] = playersName[i] + " - " + sec[i] + " seconds";
            System.out.println(combine[i]);
        }
 
        return combine;
    }
 
    public int[] sortingMethod(int[] sec) 
    {
        for (int round = 1; round < sec.length; round++) 
        {
            for (int i = 0; i < sec.length - 1; i++) 
            {
                if (sec[i] > sec[i + 1]) 
                {
                    int temp = sec[i];
                    sec[i] = sec[i + 1];
                    sec[i + 1] = temp;
                }
            }
        }
        return sec;
    }
 
    public void findWinner(String combine[], int[] sort, int[] tempSec ) 
    {       
        System.out.println();
        for (int i = 0; i < tempSec.length; i++) 
        {
            if (tempSec[i] == sort[0]) 
            {
                System.out.println("Winner:");
                System.out.println(combine[i]);
            }   
        }
         
        System.out.println();
        for (int i = 0; i < tempSec.length; i++) 
        {           
            if (tempSec[i] == sort[0+1]) 
            {
                System.out.println("First Runner Up:");
                System.out.println(combine[i]);
            }
        }
         
        System.out.println();
        for (int i = 0; i < tempSec.length; i++) 
        {
            if (tempSec[i] == sort[0+2]) 
            {
                System.out.println("Second Runner Up:");
                System.out.println(combine[i]);
            }   
        }
    }
}


//OUTPUT
Players Name & their running seconds
Gowsy – 50 seconds
Mehra – 40 seconds
Gokii – 25 seconds
Manju – 30 seconds
Lakshmi – 90 seconds
Nandhini – 75 seconds

Winner:
Gokii – 25 seconds

First Runner Up:
Manju – 30 seconds

Second Runner Up:
Mehra – 40 seconds