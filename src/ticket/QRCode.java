package ticket;

public class QRCode {
    private long id;
    private Ticket ticket;
    private String image;

    public QRCode() {
    }

    public QRCode(Ticket ticket, String image) {
        this.ticket = ticket;
        this.image = image;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "QRCode{" +
                "ticket=" + ticket +
                ", image='" + image + '\'' +
                '}';
    }
}
