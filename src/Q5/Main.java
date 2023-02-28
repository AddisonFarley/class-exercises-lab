//Addison Farley
//SDEV 219
//Class Exercises

package Q5;

import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {
        String[] firstNames = {"Jeremy", "Jose", "Julian", "Tyler", "Terry"};
        String[] lastNames = {"Nguyen", "Smith", "Williams", "Mann", "Todd"};
        String[] positions = {"Quarterback", "Running Back", "Tight End", "Wide Receiver", "Safety"};

        for (int i = 0; i < 10; i++) {
            Random num = new Random();
            int rand = num.nextInt(5);

            Athlete athlete = new Athlete("Football", positions[rand], firstNames[rand], lastNames[rand]);
            System.out.println(athlete);
        }
    }
}
