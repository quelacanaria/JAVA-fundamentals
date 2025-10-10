package quelacanaria;

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
