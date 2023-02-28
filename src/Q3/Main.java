//Addison Farley
//SDEV 219
//Class Exercises

package Q3;

public class Main
{
    public static void main(String[] args)
    {
        IPAddressV4 address = new IPAddressV4(192,160,0,0);
        System.out.println(address);

        IPAddressV4 invalid = new IPAddressV4(-1,-1,-1,-1);
        System.out.println(invalid);

        IPAddressV4 defaultAddress = new IPAddressV4();
        System.out.println(defaultAddress);

        System.out.println(address.isLocalHost());
        System.out.println(defaultAddress.isLocalHost());
    }

}
