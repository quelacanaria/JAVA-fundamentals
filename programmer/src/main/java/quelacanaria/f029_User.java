package quelacanaria;

public class f029_User {
        //Overloaded Constructors allow a class to have multiple constructors with
        //different parameter list. Enable objects to be initialized
        //in various ways.

    String username;
    String email;
    int age;

    f029_User(){

        this.username = "Mister Crabs";
        this.email = "Not provided";
        this.age = 0;

    }

    f029_User(String username){

        this.username = username;
        this.email = "Not provided";
        this.age = 0;

    }

    f029_User(String username, String email){

        this.username = username;
        this.email = email;
        this.age = 21;

    }

    f029_User(String username, String email, int age){

        this.username = username;
        this.email = email;
        this.age = age;

    }

}
