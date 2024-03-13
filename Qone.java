
import java.util.ArrayList;

class Book{
    int bookId;
    String bookName;
    String authorName;
    Book(int bookId, String bookName, String authorName){
        this.bookId=bookId;
        this.bookName=bookName;
        this.authorName=authorName;
    }

    @Override
    public String toString(){
        return "Book Id : "+bookId + " BookName : "+bookName+ " AuthorName : "+authorName;
    }
}

public class Qone {
    public static void main(String[] args) {
        ArrayList<Book> Arr = new ArrayList<>();
        Arr.add(new Book(100,"Let Us C", "Vishal"));
        Arr.add(new Book(101,"C Programming","Ma'am"));
        for(Book s : Arr){
            System.out.println(s);
        }
    }
}
