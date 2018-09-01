import java.util.Observable;
import java.util.Observer;

/**
 * An example observer class.
 * The customization on this class is only in update, therefore in the function
 * called by the subject (Observable) when some news are viable.
 */
public class NewsReader implements Observer {
    private Observable observable ;
    private String[] lotOfNews ;

    // Without observable this class is a bit useless :P
    public NewsReader (Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    // Automatically called by Observable
    public void update (Observable subject, Object obj) {
        if (subject instanceof NewsletterService){
            lotOfNews = ((NewsletterService) subject).getLastTitles();
            display();
        }
    }

    private void display() {
        System.out.println("[Breaking news]");
        for (String news : lotOfNews) {
            System.out.println(news);
        }
        System.out.println();
    }
}
