import javax.swing.*;

/**
 * An example of observer pattern. Find it :)
 */
public class SwingObserverExample {

    JFrame jFrame;

    public static void main(String[] args) {
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }

    public void go () {
        jFrame = new JFrame();

        JButton jButton = new JButton("Should i do it?!");
        jButton.addActionListener(event -> System.out.println("Obviouly you don't!"));
        jButton.addActionListener(event -> System.out.println("RISE AND SHINE WITH EVILLLLL"));

        jFrame.add(jButton);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
        jFrame.setSize(400,400);
    }

}
