import java.util.LinkedList;
import java.util.Queue;

public class Test {

    public static void main(String[] args) {
        Queue<String> queueString = new LinkedList<String>();

        GroupChat chat = new GroupChat();
        User sam = new User("Be4st", true);
        Message test1 = new Message("Test 1", sam);
        sam.send(chat, test1);
        sam.receive(chat);

        User bob = new User("Bobby", false);
        Message test2 = new Message("Test 2", bob);
        bob.send(chat, test2);
        bob.receive(chat);

        sam.dump(chat);
        bob.dump(chat);

        sam.send(chat, test1);
        sam.send(chat, test1);
        sam.send(chat, test1);
        sam.send(chat, test1);
        sam.send(chat, test1);
        bob.send(chat, test2);
        sam.send(chat, test1);
    }
}
