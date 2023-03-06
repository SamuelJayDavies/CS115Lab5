import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Message {

    private User person;
    private String dateTime;

    private String message;

    public Message(String message, User person) {
        this.person = person;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("YYYY/MM/DD hh:mm:ss");
        LocalDateTime current = LocalDateTime.now();
        dateTime = dtf.format(current);
        this.message = message;
    }

    @Override
    public String toString(){
        String chatUsername = person.getUserName();
        if(person.isPremium()) {
            chatUsername = "$ " + chatUsername + " $";
        }
        return "Sent by: " + chatUsername + "\nSent at: " + dateTime + "\nMessage: " + message;
    }

}
