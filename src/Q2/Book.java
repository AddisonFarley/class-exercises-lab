//Addison Farley
//SDEV 219
//Class Exercises

package Q2;

public class Book
{
    private String title;
    private String author;
    private int pages;
    private boolean hardcover;

    public Book(String title, String author, int pages, boolean hardcover)
    {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.hardcover = hardcover;
    }

    public String getTitle()
    {
        return title;
    }

    public String getAuthor()
    {
        return author;
    }

    public int getPages()
    {
        return pages;
    }

    public boolean isHardcover()
    {
        return hardcover;
    }

    @Override
    public String toString()
    {
        return title + " by " + author + " (" + pages + " pages)";
    }
}
