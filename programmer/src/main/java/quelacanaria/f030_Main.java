package quelacanaria;

public class f030_Main {

    public static void main(String[] args) {

        f029_User user1 = new f029_User("Sasuke");
        f029_User user2 = new f029_User("Gaara", "sandmaster@gmail.com");
        f029_User user3 = new f029_User("Sakura", "sakuratrash@gmail.com", 19);
        f029_User user4 = new f029_User();

        System.out.println(user1.username);
        System.out.println(user1.email);
        System.out.println(user1.age);

        System.out.println(user2.username);
        System.out.println(user2.email);
        System.out.println(user2.age);

        System.out.println(user3.username);
        System.out.println(user3.email);
        System.out.println(user3.age);

        System.out.println(user4.username);
        System.out.println(user4.email);
        System.out.println(user4.age);

    }

}
