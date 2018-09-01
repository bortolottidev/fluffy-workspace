import java.util.Observable;
import java.util.Observer;

/**
 * Only a class for testing the pattern
 */
public class TestClass {
    static final private String[] news = {"Child come back from hell", "Jesus said me to kill them all", "A man rape an alien"};
    static final private String[] news2 = {"Boring title", "A day in the life of Pro player", "Face to face with a wolf"};
    public static void main(String[] args) {
        Observable observable = new NewsletterService();
        Observer observer = new NewsReader(observable);
        ((NewsletterService) observable).setLastTitles(news);
        ((NewsletterService) observable).setLastTitles(news2);
    }
}
