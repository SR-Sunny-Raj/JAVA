import java.util.ArrayList;

public class Event {
    private String eventName;
    private String organiserName;
    private Double eventCost;

    Event() {
    }

    Event(String eventName, String organiserName, Double eventCost) {
        this.eventName = eventName;
        this.organiserName = organiserName;
        this.eventCost = eventCost;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventName() {
        return eventName;
    }

    public void setOrganiserName(String organiserName) {
        this.organiserName = organiserName;
    }

    public String getOrganiserName() {
        return organiserName;
    }

    public void setEventCost(Double eventCost) {
        this.eventCost = eventCost;
    }

    public Double getEventCost() {
        return eventCost;
    }

    public void display(ArrayList<Event> eventList) {
        eventList.forEach((e) -> {
            System.out.println(e.eventName + "|" + e.organiserName + "|" + e.eventCost);
        });
    }
}
