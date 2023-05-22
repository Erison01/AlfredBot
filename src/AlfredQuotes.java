import java.util.Date;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
public class AlfredQuotes {

    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }

    public String guestGreeting(String name) {
        // YOUR CODE HERE
        return String.format("%s", "Hello Beth Kane, Lovely to see you");
    }

    public String dateAnnouncement() {
        // YOUR CODE HERE
        Date date = new Date();
        return "It is currently " +date;
    }

    public String respondBeforeAlexis(String conversation) {
        // YOUR CODE HERE
        if (conversation.indexOf("Alexis")!=-1){
            return ("Right away, sir.");
        } else if (conversation.indexOf("Alfred")!=-1) {
            return " As you wish, naturally.";
            
        }else
            return "Right. And with that I shall retire.";
    }

    // NINJA BONUS
    // See the specs to overload the guestGreeting method

    public String guestGreeting(String name ,String dayPeriod ){
        if (dayPeriod=="morning"){
            return "Good morning," +name+ " Lovely to see you.";
        } else if (dayPeriod=="afternoon") {
            return "Good afternoon," +name+ " Lovely to see you.";
        }else
            return "Good evening," +name+ " Lovely to see you.";
    }
     // Sensei version

public String guestGreeting(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        LocalDateTime time = LocalDateTime.now();
        String formatedHour = time.format(formatter);
        String[] timeComp = formatedHour.split(":");
        int hour = Integer.parseInt(timeComp[0]);

        if (hour > 5 && hour <=11){
            return "morning";
        } else if (hour > 11 && hour <17) {
            return "afternoon";
        }else
            return "evening";
}
}

