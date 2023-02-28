//Addison Farley
//SDEV 219
//Class Exercises

package Q7;

public class Contact
{
    private String fullName;
    private int addrNumber;
    private String addrStreet;
    private String addrCity;
    private String addrState;
    private int addrZip;

    public Contact(String fullName, int addrNumber, String addrStreet,
                   String addrCity, String addrState, int addrZip)
    {
        this.fullName = fullName;
        this.addrNumber = addrNumber;
        this.addrStreet = addrStreet;
        this.addrCity = addrCity;
        this.addrState = addrState;
        this.addrZip = addrZip;
    }

    public String getFullName()
    {
        return fullName;
    }

    public int getAddrNumber()
    {
        return addrNumber;
    }

    public String getAddrStreet()
    {
        return addrStreet;
    }

    public String getAddrCity()
    {
        return addrCity;
    }

    public String getAddrState()
    {
        return addrState;
    }

    public int getAddrZip()
    {
        return addrZip;
    }

    public void updateAddress(int number, String street, String city, String state, int zip)
    {
        this.addrNumber = number;
        this.addrStreet = street;
        this.addrCity = city;
        this.addrState = state;
        this.addrZip = zip;
    }

    @Override
    public String toString()
    {
        return "Contact - " + fullName + ", " + addrNumber + " " +
                addrStreet + " " + addrCity + ", " + addrState + " " + addrZip;
    }
}
