package quelacanaria;
//Aggregation represent a "has a" relationship between objects. One object
//contains another object as part of its, structure, but the contained objects can
//exist independently
public class f048_Main {

    public static void main(String[] args) {

        f048_Book book1 = new f048_Book("The felloship of the ring", 423);
        f048_Book book2 = new f048_Book("The two towers", 352);
        f048_Book book3 = new f048_Book("The return of the King", 416);

        f048_Book[] books = {book1, book2, book3};

        f048_Library library = new f048_Library("NYC Public Library", 1987, books);

        System.out.println(book2.displayInfo());

    }
}
