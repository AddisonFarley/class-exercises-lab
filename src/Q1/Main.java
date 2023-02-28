//Addison Farley
//SDEV 219
//Class Exercises

package Q1;

public class Main
{
    public static void main(String[] args)
    {
        Point atOrigin = new Point();
        System.out.println(atOrigin);

        Point point = new Point(1,5);
        System.out.println(point);

        System.out.println(atOrigin.isLocatedAtOrigin());
        System.out.println(point.isLocatedAtOrigin());

        System.out.println(point.distance(-2,1));
        System.out.println(atOrigin.distance(0,0));
    }
}
