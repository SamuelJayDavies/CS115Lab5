import java.util.LinkedList;
import java.util.Queue;

public class GroupChat {

    private Queue<Message> messages;
    private static final int MAX = 5;

    public GroupChat() {
        messages = new LinkedList<>();
    }

    public void send(Message message) {
        if(isFull()) {
            messages.remove();
        }
        messages.add(message);
        System.out.println(message);
    }

    public void receive() {
        System.out.println(messages.peek());
    }

    public void dump() {
        while(messages.peek() != null) {
            System.out.println(messages.poll());
        }
    }

    public boolean isFull() {
        return messages.size() >= MAX;
    }
}
