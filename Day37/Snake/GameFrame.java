import javax.swing.JFrame;

/**
 * GameFrame class represents the main frame of the Snake game application.
 */
public class GameFrame extends JFrame {
    /**
     * Constructor for the GameFrame class. Initializes the frame by adding a
     * GamePanel,
     * setting the title, default close operation, resizable option, size,
     * visibility, and location.
     */
    GameFrame() {
        this.add(new GamePanel()); // Adds a new instance of GamePanel to the frame
        this.setTitle("Snake"); // Sets the title of the frame to "Snake"
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Sets the default close operation to exit on close
        this.setResizable(false); // Disables frame resizing
        this.pack(); // Sizes the frame to fit its contents
        this.setVisible(true); // Sets the frame to be visible
        this.setLocationRelativeTo(null); // Centers the frame on the screen
    }
}
