package Day13;

public class Test {

    public static void main(String[] args) {

        User user1 = new User("user1");
        User user2 = new User("user2");
        User user3 = new User("user3");

        user1.sendMessage(user2, "Привет");
        user1.sendMessage(user2, "Как дела?");

        user2.sendMessage(user1, "Привет");
        user2.sendMessage(user1, "Хорошо");
        user2.sendMessage(user1, "Как ты?");

        MessageDatabase.showDialog(user1,user2);
    }
}
