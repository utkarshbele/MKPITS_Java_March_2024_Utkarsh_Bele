package Assinment14.LinkedList.ESS;

public class Event implements Comparable<Event>{
    int eventId;
    String eventName,location, date, time;

    public Event(int eventId, String eventName, String location, String date, String time) {
        this.eventId = eventId;
        this.time = time;
        this.eventName = eventName;
        this.location = location;
        this.date = date;
    }
//Getters
    public int getEventId() {
        return eventId;
    }

    public String getDate() {
        return date;
    }

    public String getEventName() {
        return eventName;
    }

    public String getTime() {
        return time;
    }

    public String getLocation() {
        return location;
    }
    //Setters

    public void setTime(String time) {
        this.time = time;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "eventId=" + eventId +
                ", eventName='" + eventName + '\'' +
                ", location='" + location + '\'' +
                ", date='" + date+
                ", time=" + time;
    }

    @Override
    public int compareTo(Event event) {
        return time.compareTo(((Event)event).time);
    }
}