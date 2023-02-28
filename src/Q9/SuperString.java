//Addison Farley
//SDEV 219
//Class Exercises

package Q9;

public class SuperString
{
    private String data;

    public SuperString(String data)
    {
        this.data = data;
    }

    public SuperString()
    {
        this("");
    }

    public void setData(String data)
    {
        this.data = data;
    }

    public String getData()
    {
        return data;
    }

    public void emphasize()
    {
        this.data = "*** "+data+" ***";
    }

    public void shrink()
    {
        this.data = data.toLowerCase();
    }

    public void grow()
    {
        this.data = data.toUpperCase();
    }

    public void enhance(String prepend, String append)
    {
        this.data = prepend+data+append;
    }

    @Override
    public String toString()
    {
        return data;
    }
}
