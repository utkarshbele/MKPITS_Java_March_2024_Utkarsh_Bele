package Assinment14.LinkedList.ESS;
import java.util.Collections;
import java.util.LinkedList;

public class EventSchedulingSystem {
    public static LinkedList<Event> eventsLinkedList = new LinkedList<Event>();
    public static void addEvent(int eventId, String eventName, String location, String date, String time)
    {
        eventsLinkedList.add(new Event(eventId, eventName, location, date, time));
        System.out.println("Event added successfully.");
    }
    //Search for an event by `eventName` and display its details
    public static void searchEvent(String eventName)
    {
        for (Event event : eventsLinkedList)
        {
            if (event.getEventName().equals(eventName))
            {
                System.out.print(event);
                break;
            }
        }
            System.out.println("Event not found");
    }
    //remove an event based on event id
    public static void removeEvent(int eventId) {
        boolean found = false;
        for (Event event : eventsLinkedList) {
            if (event.getEventId() == eventId)
            {
                System.out.println("Event removed Successfully:");
                eventsLinkedList.remove(eventId);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Event not found.");
        }
    }

    public static void displayEvent() {
        if (eventsLinkedList.isEmpty()) {
            System.out.println("No Event to display.");
        } else {
            //Sort events by location
            Collections.sort(eventsLinkedList);
            for (Event event : eventsLinkedList)
            {
                System.out.println(event);
            }
        }
    }
}
