//Addison Farley
//SDEV 219
//Class Exercises

package Q6;

import java.util.Arrays;

public class CheckoutLine
{
    private String[] peopleInLine;

    public CheckoutLine(String[] peopleInLine)
    {
        this.peopleInLine = peopleInLine;
    }

    public String[] getPeopleInLine()
    {
        return peopleInLine;
    }

    public String isFirst()
    {
        return peopleInLine[peopleInLine.length-1];
    }

    public String isLast()
    {
        return peopleInLine[0];
    }

    public void enterLine(String name) {
        int length = peopleInLine.length;

        //move each person up one index, get rid of the person in the front of the line
        for (int i = length-1; i > 0; i--) {
            peopleInLine[i] = peopleInLine[i-1];
        }
        peopleInLine[0] = name;
    }

    @Override
    public String toString()
    {
        return "end --> " + Arrays.toString(peopleInLine) + " --> front";
    }
}
