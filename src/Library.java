import java.util.List;
// import java.lang.reflect.Array;
import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = null;

    public Library(){
        books = new ArrayList<>();
    }

    public void addBook(Book newBook){
        books.add(newBook);
    
    }

    public void removeBook(Book newBook) {
        boolean removed = books.remove(newBook);
        if (removed) {
            System.out.println("Libro eliminado con éxito: " + newBook.getTitle());
        } else {
            System.out.println("El libro no está en la biblioteca. ");
        }
    }

    public void borrowBook(Book newBook){
        if (books.contains(newBook)){
            books.remove(newBook);
            System.out.println("Libro prestado con éxito: " + newBook.getTitle());
        } else {
            System.out.println("El libro no está disponible en la biblioteca. ");
        }
    }

    public void returnBook(Book newBook){
        if (!books.contains(newBook)){
            books.add(newBook);
            System.out.println("Libro devuelto con éxito: " + newBook.getTitle());
        } else {
            System.out.println("El libro ya está disponible en la biblioteca. ");
        }
    }
    public void displayAvailableBooks(){
        if (books.isEmpty()){
            System.out.println("No hay libros disponibles en la biblioteca. ");
        } else {
            System.out.println("Libros disponibles en la biblioteca: ");
            for(Book newBook : books){
                System.out.println("- " + newBook.getTitle() + " autor " + newBook.getAuthor());
            }
        }
    }

    public List<Book> getAllBooks(){
        return books;
    }

}

