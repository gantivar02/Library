public class Book {
   private String title = "";
   private String author = "";
   private int publicationYear = 0;
   private int numberOfPages = 0;
   private int id = 0;

public Book(int newId, String newTitle, String newAuthor, int newPublicationYear, int newNumberOfPages){
    id = newId;
    title = newTitle;
    author = newAuthor;
    publicationYear = newPublicationYear;
    numberOfPages = newNumberOfPages;
}
// set y get title
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

// set y get authors
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

// set y get publiationYear
    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

// set y get numberOfPages
    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

// set y  get ID
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}