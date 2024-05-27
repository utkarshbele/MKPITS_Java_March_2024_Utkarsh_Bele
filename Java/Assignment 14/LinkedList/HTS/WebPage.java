package Assinment14.LinkedList.HTS;

public class WebPage {
    int pageId;
    String url, title, visitDate;

    public WebPage(int pageId, String title, String url, String visitDate) {
        this.pageId = pageId;
        this.url = url;
        this.visitDate = visitDate;
        this.title = title;
    }
//Getters
    public int getPageId() {
        return pageId;
    }

    public String getUrl() {
        return url;
    }

    public String getTitle() {
        return title;
    }

    public String getVisitDate() {
        return visitDate;
    }

    @Override
    public String toString() {
        return "pageId=" + pageId +
                ", url='" + url + '\'' +
                ", title='" + title + '\'' +
                ", visitDate='" + visitDate;
    }
}