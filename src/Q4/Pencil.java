//Addison Farley
//SDEV 219
//Class Exercises

package Q4;

public class Pencil
{
    private String brand;
    private boolean mechanical;
    private boolean eraser;

    public Pencil(String brand, boolean mechanical, boolean eraser)
    {
        this.brand = brand;
        this.mechanical = mechanical;
        this.eraser = eraser;
    }

    public Pencil(String brand)
    {
        this(brand,true, true);
    }

    public Pencil(boolean mechanical, boolean eraser)
    {
        this("Bic", mechanical, eraser);
    }

    public void setBrand(String brand)
    {
        this.brand = brand;
    }

    public void setMechanical(boolean mechanical)
    {
        this.mechanical = mechanical;
    }

    public void setEraser(boolean eraser)
    {
        this.eraser = eraser;
    }

    public String getBrand()
    {
        return brand;
    }

    public boolean isMechanical()
    {
        return mechanical;
    }

    public boolean isEraser()
    {
        return eraser;
    }

    @Override
    public String toString()
    {
        if(mechanical)
        {
            if(eraser)
            {
                return "Mechanical " + brand + " pencil with eraser";
            }
            return "Mechanical " + brand + " pencil without eraser";
        }
        else
        {
            if(eraser)
            {
                return brand + " pencil with eraser";
            }
            return brand + " pencil without eraser";
        }
    }
}
