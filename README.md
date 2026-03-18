# MiniLibrary
A simple Java application that simulates a library system. 
The project was created as part of the PGO course to practice object-oriented programming concepts.

## Features

- Create and manage books
- Store and show reader information
- Add books to a library
- Borrow and return books
- Display available books

## Project Structure

src/
- Main.java
- Book.java
- Reader.java
- Library.java

## Classes

### Book
Represents a book in the library.
Fields: title, author, pageCount, available  
Methods: printInfo(), borrow(), returnBook()

### Reader
Represents a library user.
Fields: firstName, lastName, cardNumber, borrowedCount  
Methods: printData(), increaseBorrowedCount(), decreaseBorrowedCount()

### Library
Manages a collection of books.
Fields: books[], bookCount  
Methods: addBook(), printAvailableBooks(), findBookByTitle(), countAvailableBooks(), borrowBook(), returnBook()

## How to run

1. Open the project in IntelliJ IDEA
2. Run Main.java
3. See the output in the console

## Author
Oleksandra Myronchuk s28385