//Addison Farley
//SDEV 219
//Class Exercises

package Q6;

public class Main
{
    public static void main(String[] args)
    {
        String[] people = {"William", "Sue", "Rose", "Timothy"};
        CheckoutLine line = new CheckoutLine(people);

        System.out.println(line);

        CheckoutLine anotherLine = new CheckoutLine(new String[]{"Fred", "George"});
        System.out.println(anotherLine);

        System.out.println(line.isFirst());
        System.out.println(line.isLast());

        line.enterLine("Isabelle");
        System.out.println(line.isFirst());
        System.out.println(line.isLast());

        anotherLine.enterLine("Brett");
        System.out.println(anotherLine.isFirst());
        System.out.println(anotherLine.isLast());
    }
}
