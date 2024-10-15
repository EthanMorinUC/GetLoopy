import java.util.Random;
import java.util.Scanner;

public class Task8_DieRoller
{
    public static void main(String[] args)
    {
        Scanner yesOrNo = new Scanner(System.in);
        Boolean keepPlaying = true;
        int int1, int2, int3, rollNum = 0, sum;
        System.out.println("Roll\t\tDie1\t\tDie2\t\tDie3\t\tSum");
        System.out.println("----------------------------------------------------");
        while (keepPlaying == true)
        {
            do {
                int1 = (int) ((Math.random() * 6) + 1);
                int2 = (int) ((Math.random() * 6) + 1);
                int3 = (int) ((Math.random() * 6) + 1);
                rollNum++;
                sum = int1 + int2 + int3;
                System.out.println(rollNum + "\t\t   " + int1 + "\t\t   " + int2 + "\t\t   " + int3 + "\t\t   " + sum);
            } while ((int1 != int2) || (int1 != int3));
            System.out.println("You got three of the same dice rolls in a row! How Lucky!");
            System.out.println("Would you like to play again (Y/N)?");
            if (yesOrNo.next().toUpperCase().equals("Y"))
                keepPlaying = true;
            else if (yesOrNo.next().toUpperCase().equals("N"))
                keepPlaying = false;
        }
    }
}
