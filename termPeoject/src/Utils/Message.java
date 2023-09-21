package Utils;

public class Message {
    private Person from;
    private Person to;
    private String context;

    public Message(Person from, Person to, String context) {
        this.from = from;
        this.to = to;
        this.context = context;
    }

    public Person getFrom() {
        return from;
    }

    public void setFrom(Person from) {
        this.from = from;
    }

    public Person getTo() {
        return to;
    }

    public void setTo(Person to) {
        this.to = to;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }
}
