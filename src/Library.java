public class Library {
    private Book[] books;
    private int bookCount;
    public Library(int capacity) {
        books = new Book[capacity];
        bookCount = 0;
    }
    public void addBook(Book book) {
        if (bookCount < books.length){
            books[bookCount] = book;
            bookCount++;
        }
    }
    public void  printAvailableBooks(){
        for (int i = 0; i < bookCount; i++) {
            if (books[i] != null && books[i].isAvailable()) {
                books[i].printInfo();
            }
        }
    }
    public Book findBookByTitle(String title) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getTitle().equals(title)) {
                return books[i];
            }
        }
        return null;
    }
    public int countAvailableBooks() {
        int count = 0;
        for (int i = 0; i < bookCount; i++) {
            if (books[i].isAvailable()) {
                count++;
            }
        }
        return count;
    }
    public void borrowBook(String title, Reader reader){
        Book book = findBookByTitle(title);

        if (book != null && book.isAvailable()) {
            book.borrow();
            reader.increaseBorrowedCount();
        } else {
            System.out.println("Book not available.");
        }
    }
    public void returnBook(String title, Reader reader){
        Book book = findBookByTitle(title);

        if (book != null) {
            book.returnBook();
            reader.decreaseBorrowedCount();
        }
    }

}
