package quelacanaria;

public class f033_Friend {

    String name;
    static int numOfFriends;

    f033_Friend(String name){

        this.name = name;
        numOfFriends++;

    }

    static void showFriends(){

        System.out.println("You have " + numOfFriends + " total of friends ");

    }

}
