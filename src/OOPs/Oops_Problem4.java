package OOPs;

//ONLINE LIBRARY
// You have to implement a library using Java Class "Library"
// Methods: addBook, issueBook, returnBook, showAvailableBooks
// Properties: Array to store the available books,
// Array to store the issued books

class Library{
    String[] books;
    int no_of_books;

    Library(){
        this.books = new String[100];
        this.no_of_books = 0;
    }

    void addBook(String book){
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book+ " has been added!");
    }

    void showAvailableBooks(){
        System.out.println("Available Books are:");
        for (String i : this.books) {
            if (i == null){
                continue;
            }
            System.out.println("* " + i);
        }
    }

    void issueBook(String book){
        for (int i=0;i<this.books.length;i++){
            if (this.books[i].equals(book)){
                System.out.println("The book has been issued!");
                this.books[i] = null;
                return;
            }
        }
        System.out.println("This book does not exist");
    }

    void returnBook(String book){
        addBook(book);
    }

}

public class Oops_Problem4 {
    public static void main(String[] args) {
        Library centralLibrary = new Library();
        centralLibrary.addBook("Think and grow Rich");
        centralLibrary.addBook("Algorithms");
        centralLibrary.addBook("C++");
        centralLibrary.showAvailableBooks();

        centralLibrary.issueBook("C++");
        centralLibrary.showAvailableBooks();
        centralLibrary.returnBook("C++");
        centralLibrary.showAvailableBooks();
    }
}
