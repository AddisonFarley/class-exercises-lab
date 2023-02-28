//Addison Farley
//SDEV 219
//Class Exercises

package Q10;

import java.util.*;

public class Dice
{
    private String color;
    private int sides;

    public Dice(String color, int sides)
    {
        this.color = color;
        this.sides = sides;

        int[] supportedDice = {4,6,8,10,20};
        boolean supported = false;

        for (int i = 0; i < supportedDice.length; i++) {
            if(sides == supportedDice[i])
            {
                supported = true;
                break;
            }
        }

        if(!supported)
        {
            System.out.println("A " + sides + " dice is not supported. Defaulting to 6 sides.");
            this.sides = 6;
        }
    }

    public Dice()
    {
        this("Red", 6);
    }

    public String getColor()
    {
        return color;
    }

    public int getSides()
    {
        return sides;
    }

    public int roll()
    {
        Random num = new Random();
        int randNum = num.nextInt(1, sides);

        return randNum;
    }

    public int[] rollSeveral(int numberOfTimes)
    {
        int[] rolls = new int[numberOfTimes];

        for (int i = 0; i < numberOfTimes; i++) {
            rolls[i] = roll();
        }

        return rolls;
    }

    @Override
    public String toString()
    {
        return color + " " + sides + "-sided die";
    }
}
