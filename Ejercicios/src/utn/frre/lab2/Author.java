package utn.frre.lab2;
import java.util.List;

public class Author {
    private String name;
    private String mail;
    private Gender gender;
    private List<Book> books;

    @Override
    public String toString() {
        return name;
    }
}

enum Gender {
    MALE,
    FEMALE
}
