import java.util.Date;

public class AlfredQuotes {

    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }

    public String guestGreeting(String name) {
        String greeting = String.format("Hello, %s. Lovely to see you", name);// YOUR CODE HERE
        return greeting;
    }

    public String dateAnnouncement() {
        Date date = new Date();// YOUR CODE HERE
        return " It is currently" + " " + date;
    }

    public String respondBeforeAlexis(String conversation) {
        if (conversation.indexOf("Alexis") > -1) {
            return "Right away, sir. She certainly isn't sophisticated enough for that.";
        }
        if (conversation.indexOf("Alfred") > -1) {
            return "At your service. As you wish, naturally.";
        }
        if (conversation.indexOf("Superman") > -1) {
            return "Superman ofcourse!! Batman isn't even a real super hero.";
        }
        return "Right. And with that I shall retire.";
    }

    // NINJA BONUS
    // See the specs to overload the guessGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have
    // learned!
}
