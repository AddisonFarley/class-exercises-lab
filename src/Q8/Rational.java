//Addison Farley
//SDEV 219
//Class Exercises

package Q8;

public class Rational
{
    private double numerator;
    private double denominator;

    public Rational(double numerator, double denominator)
    {
        this.numerator = numerator;
        this.denominator = denominator;

        if(denominator == 0)
        {
            System.out.println("Error: Cannot divide by zero - " + numerator + "/" + denominator + ".");
            this.denominator = numerator;
        }
    }

    public Rational()
    {
        this(1,1);
    }

    public void setNumerator(double numerator)
    {
        this.numerator = numerator;
    }

    public void setDenominator(double denominator)
    {
        this.denominator = denominator;
    }

    public double getNumerator()
    {
        return numerator;
    }

    public double getDenominator()
    {
        return denominator;
    }

    @Override
    public String toString()
    {
        String rationalNum = String.valueOf(Math.round(numerator))+"/"+String.valueOf(Math.round(denominator));

        return rationalNum;
    }
}
