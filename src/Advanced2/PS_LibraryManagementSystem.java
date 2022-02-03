package Advanced2;

/*
    Create a library management system which is capable of issuing books to the students.
    Book should have info like:
    1. Book name
    2. Book Author
    3. Issued to
    4. Issued on
    User should be able to add books, return issued books, issue books
    Assume that all the users are registered with their names in the central database
*/

import java.util.ArrayList;

/**
 * This class is to demonstrate what Library Management System is.
 * @author Shivay Sabharwal
 * @version 1.0
 * @since 2021
 */

class Book{
    public String name, author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}

class Library{
    public ArrayList<Book> book_list;
    public Library(ArrayList<Book> a){
        this.book_list = a;
    }
    public void addBook(Book b){
        this.book_list.add(b);
        System.out.println("This book has been added to the library successfully.\nThankYou.\n");
    }
    public void returnBook(Book c, String returned_by){
        System.out.println("The book named as: " + c + " has been returned successfully by " + returned_by + " .\nThankYou.\n");
        this.book_list.add(c);
    }
    public void issueBook(Book d, String issued_to){
        System.out.println("The book has successfully been issued from the library to " + issued_to + ".\nThankYou.\n");
        this.book_list.remove(d);
    }
}

public class PS_LibraryManagementSystem {
    public static void main(String[] args) {
        ArrayList<Book> bk = new ArrayList<>();

        Book b1 = new Book("Threat Intelligence", "Shivay Sabharwal");
        Book b2 = new Book("Incident Response", "Shivay Sabharwal");
        Book b3 = new Book("Digital Forensics", "Shivay Sabharwal");
        Book b4 = new Book("Artificial Intelligence", "Shivay Sabharwal");
        Book b5 = new Book("Cryptography", "Shivay Sabharwal");
        Book b6 = new Book("Network Security", "Shivay Sabharwal");
        bk.add(b1);
        bk.add(b2);
        bk.add(b3);
        bk.add(b4);
        bk.add(b5);
        bk.add(b6);

        Library obj = new Library(bk);

        obj.addBook(new Book("Software Engineering", "Shivay Sabharwal"));
        System.out.println(obj.book_list + "\n");

        obj.issueBook(b1, "Pranav Thaman");
        obj.issueBook(b2, "Satvik Thaman");
        System.out.println(obj.book_list + "\n");

        obj.returnBook(b2, "Hardik Chodha");
    }
}
