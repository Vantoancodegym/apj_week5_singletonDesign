package model;

public class BorrowedBook {
    private BookSingleton borrowedBook;
    private boolean haveBook=false;
    public BorrowedBook(){};
    public void borrowBook(){
        borrowedBook=BookSingleton.borrowBook();
        if (borrowedBook!=null)haveBook=true;
    }
    public void returnBook(){
        haveBook=false;
        BookSingleton.returnedBook(borrowedBook);
    }

    @Override
    public String toString() {
        if (haveBook)return borrowedBook.toString();
        return "I dont have book";
    }
}
