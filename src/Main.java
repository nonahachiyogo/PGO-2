public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("The Little Prince", "Antoine de Saint-Exupéry", 96, true );
        Book book2 =  new Book("Pride and Prejudice", "Jane Austen", 407, false );
        Book book3 = new Book("Hannibal", "Thomas Harris", 564, true);

        book1.printInfo();
        book2.printInfo();
        book3.printInfo();

        book1.borrow();
        book2.borrow();

        book1.returnBook();

        Reader reader1 = new Reader("Zendaya", "Coleman" ,  1 );
        Reader reader2 = new Reader("Max" ,"Verstappen", 3 );
        reader1.printData();
        reader2.increaseBorrowedCount();
        reader2.printData();

        Library lib = new Library(10);

        lib.addBook(book1);
        lib.addBook(book2);
        lib.addBook(book3);

        lib.printAvailableBooks();

        lib.borrowBook("1984", reader1);

        System.out.println("After borrowing:");
        lib.printAvailableBooks();

        lib.returnBook("1984", reader1);

        System.out.println("After return:");
        lib.printAvailableBooks();


    }
}
