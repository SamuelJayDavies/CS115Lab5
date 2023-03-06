public class User {

    private String userName;
    private boolean isPremium;

    public User(String userName, boolean isPremium) {
        this.userName = userName;
        this.isPremium = isPremium;
    }

    public void send(GroupChat gc, Message message) {
        gc.send(message);
    }

    public void receive(GroupChat gc) {
        gc.receive();
    }

    public void dump(GroupChat gc) {
        gc.dump();
    }

    public String getUserName() {
        return userName;
    }

    public boolean isPremium() {
        return isPremium;
    }
}
