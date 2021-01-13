import model.BorrowedBook;

public class Mian {
    public static void main(String[] args) {
        BorrowedBook borrowedBook1=new BorrowedBook();
        BorrowedBook borrowedBook2=new BorrowedBook();
        System.out.println(borrowedBook1);
        borrowedBook1.borrowBook();
        System.out.println(borrowedBook1);
        borrowedBook1.returnBook();
        System.out.println(borrowedBook1);
        borrowedBook2.borrowBook();
        System.out.println(borrowedBook2);
        borrowedBook2.returnBook();
        System.out.println(borrowedBook2);
    }
}
