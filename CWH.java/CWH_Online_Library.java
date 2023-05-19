package sarvagyacode;

class Library{
    String[] books;
    int no_of_books ;

    Library(){
        this.books = new String[100];
        this.no_of_books = 0;
    }
    void addBook(String book){
        this.books[no_of_books] = book;
        no_of_books++;
        //System.out.println(book+" has been added!!");
    }
    void showAvailableBooks(){
        System.out.println("Available books are:");
        for(String book: this.books){
            if(book==null){
                continue;
            }
            System.out.println("* "+book);
        }
    }
    void issueBook(String book){
        for(int i=0;i<this.books.length;i++){
            if(this.books[i].equals(book)){
                System.out.println("Your book has been issued :)");
                this.books[i] = null;
                return;
            }
        }
        System.out.println("This book is not available :(");
    }
    void returnBook(String book){
        addBook(book);
    }
}

public class CWH_Online_Library {
    public static void main(String[] args) {
        Library lib = new Library();
        lib.addBook("Think and grow rich");
        lib.addBook("Rich dad & Poor dad");
        lib.addBook("The psychology of Money");
        lib.addBook("The Secret");
        lib.showAvailableBooks();
        lib.issueBook("Think and grow rich");
        lib.showAvailableBooks();

        lib.returnBook("C++");
        lib.showAvailableBooks();

        //
        System.out.println(lib.no_of_books);

    }
}
