package Assinment14.LinkedList.HTS;
import java.util.LinkedList;

public class HistoryTrackingSystem {
    public static LinkedList<WebPage> webPageLinkedList = new LinkedList<WebPage>();
    public static void addWebpage(int pageId, String title, String url, String visitDate)
    {
        webPageLinkedList.add(new WebPage(pageId, title, url, visitDate));
        System.out.println("Event added successfully.");
    }
    //Search for a webpage by `url` and display its details
    public static void searchWebPage(String url)
    {
        for (WebPage webPage : webPageLinkedList)
        {
            if (webPage.getUrl().equals(url))
            {
                System.out.print(webPage);
                break;
            }
        }
        System.out.println("Webpage not found");
    }
    //remove a webpage based on page id
    public static void removeEvent(int pageId) {
        boolean found = false;
        for (WebPage webPage : webPageLinkedList) {
            if (webPage.getPageId() == pageId)
            {
                System.out.println("Webpage removed Successfully:");
                webPageLinkedList.remove(pageId);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Webpage not found.");
        }
    }

    public static void displayWebPage(String visitDate)
    {
        //display webpages on specific dates
        for (WebPage webPage : webPageLinkedList)
        {
            if(webPage.getVisitDate().equals(visitDate))
            {
                System.out.println(webPage);
            }
        }
        System.out.println("Webpage not found");
    }
}