//Addison Farley
//SDEV 219
//Class Exercises

package Q9;

public class Main
{
    public static void main(String[] args)
    {
        SuperString superString = new SuperString("Hello!");
        System.out.println(superString);

        SuperString empty = new SuperString();
        System.out.println(empty);

        superString.emphasize();
        System.out.println(superString);

        superString.grow();
        System.out.println(superString);

        superString.enhance("---> "," <---");
        System.out.println(superString);
    }
}
