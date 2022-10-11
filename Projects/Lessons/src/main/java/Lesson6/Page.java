package Projects.Lessons.src.main.java.Lesson6;

public class Page {

    private String pageName;
    private int pageId;
    private String URL;

    public Page(String pageName, int pageId, String URL){
        this.pageName = pageName;
        this.pageId = pageId;
        this.URL = URL;
    }

    public Page(){

    }

    public int getPageId() {
        return pageId;
    }
    public void setPageId(int pageId){
        this.pageId=pageId;
    }
    public String getPageName() {
        return pageName;
    }

    public void setPageName(String pageName) {
        this.pageName = pageName;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public void openPage(){
        System.out.println(String.format("Page %s was opened", pageName));
    }
    public void closePage(){
        System.out.println(String.format("Page %s was closed", pageName));
    }
    public void clickButton(String buttonName){
        System.out.println(String.format("Button %s was clicked", buttonName));
    }
    public void getDeveloperName(){

        System.out.println("The page was developed by: ");
    }
}
