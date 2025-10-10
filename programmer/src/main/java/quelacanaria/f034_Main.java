package quelacanaria;

public class f034_Main {
        //static makes a variable or method belong to the class rather than to any
        //specific object. Commonly used for utiity methods or shared resources.
    public static void main(String[] args) {

        f033_Friend friend1 = new f033_Friend("Sasuke");
        f033_Friend friend2 = new f033_Friend("Naruto");
        f033_Friend friend3 = new f033_Friend("Sakura");
        f033_Friend friend4 = new f033_Friend("Kakashi");
        f033_Friend friend5 = new f033_Friend("Might Guy");

        System.out.println(f033_Friend.numOfFriends);

        f033_Friend.showFriends();

    }

}
