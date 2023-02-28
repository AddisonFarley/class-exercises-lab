//Addison Farley
//SDEV 219
//Class Exercises

package Q4;

public class Main
{
    public static void main(String[] args)
    {
        Pencil bicPencil = new Pencil(true, true);
        System.out.println(bicPencil);

        Pencil pilotPencil = new Pencil("Pilot", false, false);
        System.out.println(pilotPencil);

        Pencil dixonPencil = new Pencil("Dixon");
        System.out.println(dixonPencil);
    }
}
