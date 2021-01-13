package model;

public class BookSingleton {
    private String name;
    private static BookSingleton bookSingleton;
    private static boolean isLoanOut=false;
    private BookSingleton(String name){
        this.name=name;
    }
    public static BookSingleton borrowBook(){
        if (!isLoanOut){
            if (bookSingleton==null){
            bookSingleton =new BookSingleton("JAVA");
            }
            isLoanOut=true;
            return bookSingleton;
        }
        return null;
    }
    public static void returnedBook(BookSingleton borrowedBook){
        if (borrowedBook!=null) isLoanOut=false;
    }

    @Override
    public String toString() {
        return "BookSingleton{" +
                "name='" + name + '\'' +
                '}';
    }
}
