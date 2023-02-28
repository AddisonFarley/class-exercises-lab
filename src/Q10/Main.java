//Addison Farley
//SDEV 219
//Class Exercises

package Q10;

import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        Dice die = new Dice("Green", 10);
        System.out.println(die);

        Dice otherDie = new Dice();
        System.out.println(otherDie);

        System.out.println(die.roll());
        System.out.println(die.roll());

        int[] results = die.rollSeveral(3);
        System.out.println(Arrays.toString(results));

        results = otherDie.rollSeveral(5);
        System.out.println(Arrays.toString(results));

        System.out.println();
        Dice badDie = new Dice("Yellow", 12);
        System.out.println(badDie.getSides());
    }
}
