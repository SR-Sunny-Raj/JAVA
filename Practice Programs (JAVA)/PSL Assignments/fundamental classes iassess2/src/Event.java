import java.util.Date;

public class Event {
    private String eventName;
    private Date startDate;
    private Date endDate;

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventName() {
        return eventName;
    }

    public void setStartDate(Date starDate) {
        this.startDate = starDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getEnDate() {
        return endDate;
    }

    Event() {
    }

    Event(String eventName, Date starDate, Date endDate) {
        this.eventName = eventName;
        this.startDate = starDate;
        this.endDate = endDate;
    }
}