public class User {

    private String userName;
    private boolean isPremium;

    public User(String userName, boolean isPremium) {
        this.userName = userName;
        this.isPremium = isPremium;
    }

    public void send(GroupChat gc, Message message) {
        if(isPremium) {
            gc.send(message);
        } else {
            if(!(gc.isFull())) {
                gc.send(message);
            } else {
                System.out.println("Error: Chat is currently full\n");
            }
        }
    }

    public void receive(GroupChat gc) {
        gc.receive();
    }

    public void dump(GroupChat gc) {
        if(isPremium){
            gc.dump();
        } else {
            System.out.println("Error: Only Premium users are allowed to use the dump feature\n");
        }
    }

    public String getUserName() {
        return userName;
    }

    public boolean isPremium() {
        return isPremium;
    }
}
