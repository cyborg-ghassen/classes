package ticket;

import event.Event;
import user.User;

public class Ticket {
    private long id;
    private Event event;
    private String type;
    private boolean isUsed;
    private User user;
    private double price;
    private String key;

    public Ticket() {
    }

    public Ticket(Event event, String type, boolean isUsed, User user, double price, String key) {
        this.event = event;
        this.type = type;
        this.isUsed = isUsed;
        this.user = user;
        this.price = price;
        this.key = key;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isUsed() {
        return isUsed;
    }

    public void setUsed(boolean used) {
        isUsed = used;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "event=" + event +
                ", type='" + type + '\'' +
                ", isUsed=" + isUsed +
                ", user=" + user +
                ", price=" + price +
                ", key='" + key + '\'' +
                '}';
    }
}
