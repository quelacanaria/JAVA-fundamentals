package quelacanaria;
//Aggregation represent a "has a" relationship between objects. One object
//contains another object as part of its, structure, but the contained objects can
//exist independently
public class f048_Library {
    String name;
    int year;
    f048_Book[] books;

    f048_Library(String name, int year, f048_Book[] books){
        this.name = name;
        this.year = year;
        this.books = books;
    }

    void displayInfo(){

        System.out.println("The " + this.name + " " + this.year);
        System.out.println("The books available");
        for(f048_Book book : books){

            System.out.println(book.displayInfo());

        }

    }

}
