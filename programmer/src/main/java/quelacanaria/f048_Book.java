package quelacanaria;
//Aggregation represent a "has a" relationship between objects. One object
//contains another object as part of its, structure, but the contained objects can
//exist independently
public class f048_Book {

    String title;
    int pages;

    f048_Book(String title, int pages){
        this.title = title;
        this.pages = pages;
    }

    String displayInfo(){
        return this.title + " (" + this.pages + " pages)";
    }

}
