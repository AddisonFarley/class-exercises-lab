//Addison Farley
//SDEV 219
//Class Exercises

package Q8;

public class Main
{
    public static void main(String[] args)
    {
        Rational num = new Rational();

        for (int i = 1; i < 10; i++) {
            num.setNumerator(i);
            for (int j = 1; j < 10; j++) {
                num.setDenominator(j);
                System.out.println(num);
            }
        }
    }
}
