public class Main {
    private static Library library = new  Library();

   public void showMenu(){
    String option = "";
    do{
        Console.writeLine("MENU PRINCIPAL");
        Console.writeLine();
        Console.writeLine("1. Agregar un libro");
        Console.writeLine("2. Eliminar un libro");
        Console.writeLine("3. Prestar un libro");
        Console.writeLine("4. Devolver un libro");
        Console.writeLine("5. Mostrar todos los libros");
        Console.writeLine("9. SALIR");
        Console.writeLine("Ingrese una opción y presione [Enter]");

        switch (option) {
            case "1":
                addBook();
                break;
            case "2":
                removeBook(); 
                break;
            case "3":
                borrowBook();
                break;
            case "4":
                returnBook();
                break;
            case "5":
                displayAvailableBooks();
                break;
            default:
                Console.writeLine("Opción inválida. Por favor, seleccione un número entre 1 y 6.");
        }
        option = Console.readLine();
    }while (!option.equals("9"));

   }

   private static void addBook() {
        Console.writeLine("\nAgregar un libro:");
        Console.write("Título: ");
        String newTitle = Console.readLine();
        Console.write("Autor: ");
        String newAuthor = Console.readLine();
        Console.write("Año de Publicación: ");
        int newPublicationYear = Integer.parseInt(Console.readLine());
        Console.write("Número de páginas: ");
        int newNumberOfPages = Integer.parseInt(Console.readLine());
        Console.write("ID unico del libro: ");
        int newId = Integer.parseInt(Console.readLine());
        library.addBook(new Book(newId, newTitle, newAuthor, newPublicationYear, newNumberOfPages));
        Console.writeLine("Libro agregado con éxito.");
   }

   private static void removeBook() {
    Console.writeLine("\nEliminar un libro:");
    Console.write("Ingrese el título del libro que desea eliminar: ");
    String title = Console.readLine();
    Console.write("Ingrese el autor del libro: ");
    String author = Console.readLine();
    Book bookToRemove = findBook(title, author);
    if (bookToRemove != null) {
        library.removeBook(bookToRemove); // Aqui llama al método removeBook de la clase Library
    } else {
        Console.writeLine("El libro no está en la biblioteca.");
    }
    }

    private static void borrowBook() {
        Console.writeLine("\nPrestar un libro:");
        Console.write("Ingrese el título del libro que desea prestar: ");
        String title = Console.readLine();
        Console.write("Ingrese el autor del libro: ");
        String author = Console.readLine();
        Book bookToBorrow = findBook(title, author);
        if (bookToBorrow != null) {
            library.borrowBook(bookToBorrow);
        } else {
            Console.writeLine("El libro no está disponible en la biblioteca.");
        }
    }

    private static void returnBook() {
        Console.writeLine("\nDevolver un libro:");
        Console.write("Ingrese el título del libro que desea devolver: ");
        String title = Console.readLine();
        Console.write("Ingrese el autor del libro: ");
        String author = Console.readLine();
        Book bookToReturn = findBook(title, author);
        if (bookToReturn != null) {
            library.returnBook(bookToReturn);
        } else {
            Console.writeLine("No se puede devolver un libro que no se ha prestado.");
        }
    }

    private static void displayAvailableBooks() {
        Console.writeLine("\nLibros disponibles en la biblioteca:");
        library.displayAvailableBooks();
    }


    private static Book findBook(String title, String author) {
        for (Book book : library.getAllBooks()) {
        if (book.getTitle().equalsIgnoreCase(title) && book.getAuthor().equalsIgnoreCase(author)) {
            return book;
            }
        }
        return null;
    }

   public static void main(String[] args) {
    new Main().showMenu();


   }
}
