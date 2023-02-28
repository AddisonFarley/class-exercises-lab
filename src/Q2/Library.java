//Addison Farley
//SDEV 219
//Class Exercises

package Q2;

public class Library
{
   Book allBooks[];
   Book bookOfTheMonth;

   public Library(Book allBooks[], Book bookOfTheMonth)
   {
       this.allBooks = allBooks;
       this.bookOfTheMonth = bookOfTheMonth;
   }

    @Override
    public String toString()
    {
        return "Book of the month - \"" + bookOfTheMonth.getTitle() + "\", # of books - " + allBooks.length;
    }
}
