//Addison Farley
//SDEV 219
//Class Exercises

package Q3;

public class IPAddressV4
{
    private int firstOctet;
    private int secondOctet;
    private int thirdOctet;
    private int fourthOctet;

    public IPAddressV4(int firstOctet, int secondOctet, int thirdOctet, int fourthOctet)
    {
        this.firstOctet = firstOctet;
        this.secondOctet = secondOctet;
        this.thirdOctet = thirdOctet;
        this.fourthOctet = fourthOctet;

        int[] validAddress = {firstOctet, secondOctet, thirdOctet, fourthOctet};

        for (int i = 0; i < validAddress.length; i++) {
            if(validAddress[i] < 0 || validAddress[i] > 255)
            {
                this.firstOctet = 127;
                this.secondOctet = 0;
                this.thirdOctet = 0;
                this.fourthOctet = 1;
                break;
            }
        }
    }

    public IPAddressV4()
    {
        this(127, 0, 0, 1);
    }

    public void setFirstOctet(int firstOctet)
    {
        this.firstOctet = firstOctet;
    }

    public void setSecondOctet(int secondOctet)
    {
        this.secondOctet = secondOctet;
    }

    public void setThirdOctet(int thirdOctet)
    {
        this.thirdOctet = thirdOctet;
    }

    public void setFourthOctet(int fourthOctet)
    {
        this.fourthOctet = fourthOctet;
    }

    public int getFirstOctet()
    {
        return firstOctet;
    }

    public int getSecondOctet()
    {
        return secondOctet;
    }

    public int getThirdOctet()
    {
        return thirdOctet;
    }

    public int getFourthOctet()
    {
        return fourthOctet;
    }

    public boolean isLocalHost()
    {
        if(firstOctet == 127 && secondOctet == 0 && thirdOctet == 0 && fourthOctet ==1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    @Override
    public String toString()
    {
        return "IP Address: " + firstOctet + "." + secondOctet + "." + thirdOctet + "." + fourthOctet;
    }
}
