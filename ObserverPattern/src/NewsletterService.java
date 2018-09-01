import java.util.ArrayList;
import java.util.Observable ;

/**
 * Provide a newsletter service.
 * All you have to do when you want to send news is to setup it by
 * using the setLastTitles() function.
 */
public class NewsletterService extends Observable {
    private String lastTitles[];

    public NewsletterService() {
        lastTitles = new String[1];
    }

    public void newsIncoming () {
        setChanged();
        notifyObservers();
    }

    public void setLastTitles (String title[]) {
        lastTitles = title ;
        newsIncoming();
    }

    public String[] getLastTitles () {
        return lastTitles;
    }
}
