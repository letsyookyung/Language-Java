import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;


public class User {
    private String name;
    private LocalDate birthDay;
    private ArrayList<Book> books = new ArrayList<Book>();

    User(String name, String birthDay) {
        this.name = name;
        this.birthDay = LocalDate.parse(birthDay);
    }

    public int age() {
        Period age = Period.between(this.birthDay, LocalDate.now()); //this는 현재의 객체를 가르킴

        return age.getYears();
    }

    public String getName() {
        return this.name;
    }

    public LocalDate getBirthDay() {
        return this.birthDay;
    }

    public void borrow(Book book) { //void -> nothing return
        this.books.add(book);

    }

    public String borrowedBooks() {
        return this.books.toString();
    }
}
