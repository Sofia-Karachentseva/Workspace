package Projects.Lessons.src.main.java.Lesson6;

public class AboutPage extends Page implements PageInterface{
    String disclaimer;

    public String getDisclaimer() {
        return disclaimer;
    }

    public void setDisclaimer(String disclaimer) {
        this.disclaimer = disclaimer;
    }
    public void getDeveloperName(){
        System.out.println("Mary Cooper");
    }



}
