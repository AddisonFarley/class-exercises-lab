//Addison Farley
//SDEV 219
//Class Exercises

package Q7;

import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your full name: ");
        String name = input.nextLine();
        System.out.println();

        System.out.print("Please enter your address number: ");
        int addrNum = input.nextInt();
        input.nextLine();
        System.out.println();

        System.out.print("Please enter your street address: ");
        String street = input.nextLine();
        System.out.println();

        System.out.print("Please enter your city: ");
        String city = input.nextLine();
        System.out.println();

        System.out.print("Please enter your state: ");
        String state = input.nextLine();
        System.out.println();

        System.out.print("Please enter your zip code: ");
        int zip = input.nextInt();
        System.out.println();

        Contact contact = new Contact(name, addrNum, street, city, state, zip);
        System.out.println(contact);
    }
}
