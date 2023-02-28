//Addison Farley
//SDEV 219
//Class Exercises

package Q2;

public class Main
{
    public static void main(String[] args)
    {
        Book hungerGames = new Book("The Hunger Games", "Suzanne Collins", 411, true);
        System.out.println(hungerGames);

        Book[] books = new Book[3];
        books[0] = new Book("Where the Red Fern Grows", "Wilson Rawls", 304, false);
        books[1] = new Book("The FellowShip of the Ring", "JRR Tolkien", 550, true);
        books[2] = new Book("The Hunt for Red October", "Tom Clancy", 300, false);

        Library library = new Library(books, hungerGames);
        System.out.println(library);
    }
}
