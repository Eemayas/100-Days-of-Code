import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

/**
 * GamePanel class represents the game panel where the snake game is played.
 */
public class GamePanel extends JPanel implements ActionListener {

    // Constants
    static final int SCREEN_WIDTH = 600;
    static final int SCREEN_HEIGHT = 600;
    static final int UNIT_SIZE = 25;
    static final int GAME_UNITS = (SCREEN_WIDTH * SCREEN_HEIGHT) / (UNIT_SIZE);
    static final int DELAY = 75;

    // Arrays to hold the x and y coordinates of the snake's body and head
    final int x[] = new int[GAME_UNITS]; // GAME_UNITS is because the snake is not going to be bigger than the game
                                         // itself
    final int y[] = new int[GAME_UNITS];

    int bodyParts = 6;
    int applesEaten = 0;

    int appleX; // x coordinate of the apple which will generate randomly
    int appleY; // y coordinate of apple

    char direction = 'R';// Initially, the snake is moving to the right (R).

    boolean running = false;

    Timer timer;

    Random random;

    /**
     * Constructor for GamePanel class. Sets up the game panel with preferred size,
     * background color, focusability, and key listener. Also starts the game.
     */
    GamePanel() {
        random = new Random();
        this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
        this.setBackground(Color.black);
        this.setFocusable(true);
        this.addKeyListener(new MyKeyAdapter());
        startGame();
    }

    /**
     * Starts the game by generating a new apple, setting the running flag to true,
     * and starting the timer.
     */
    public void startGame() {
        newApple();
        running = true;
        timer = new Timer(DELAY, this);
        timer.start();
    }

    /**
     * Draws the game objects on the game panel. Called by the paintComponent
     * method.
     * 
     * @param g Graphics object used to draw the game objects
     */
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }

    /**
     * Draws the game objects on the game panel. Called by the paintComponent
     * method.
     * 
     * @param g Graphics object used to draw the game objects
     */
    public void draw(Graphics g) {
        if (running) {
            // Draws the apple and snake body
            g.setColor(Color.red);
            g.fillOval(appleX, appleY, UNIT_SIZE, UNIT_SIZE);
            for (int i = 0; i < bodyParts; i++) {
                if (i == 0) {
                    g.setColor(Color.green);
                    g.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE); // Draws the head of the snake
                } else {
                    g.setColor(new Color(45, 180, 0));
                    g.setColor(new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)));
                    g.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE); // Draws the body of the snake
                }
            }
            // Draws the score
            g.setColor(Color.red);
            g.setFont(new Font("Ink Free", Font.BOLD, 40));
            FontMetrics metrics = getFontMetrics(g.getFont());
            g.drawString("Score:\t" + applesEaten, (SCREEN_WIDTH - metrics.stringWidth("Score:\t" + applesEaten)) / 2,
                    g.getFont().getSize());
        } else {
            gameOver(g);
        }
    }

    /**
     * Generates a new apple at a random position on the game panel.
     */
    public void newApple() {
        appleX = random.nextInt((int) (SCREEN_WIDTH / UNIT_SIZE)) * UNIT_SIZE;
        appleY = random.nextInt((int) (SCREEN_HEIGHT / UNIT_SIZE)) * UNIT_SIZE;
    }

    /**
     * Moves the snake by updating the coordinates of its body and head. Called by
     * the actionPerformed method.
     */
    public void move() {
        for (int i = bodyParts; i > 0; i--) {
            x[i] = x[i - 1];
            y[i] = y[i - 1];
        }
        switch (direction) {
            case 'U':
                y[0] = y[0] - UNIT_SIZE;
                break;
            case 'D':
                y[0] = y[0] + UNIT_SIZE;
                break;
            case 'L':
                x[0] = x[0] - UNIT_SIZE;
                break;
            case 'R':
                x[0] = x[0] + UNIT_SIZE;
                break;
            default:
                break;
        }
    }

    /**
     * Checks if the snake has eaten the apple. If yes, increases the score and
     * generates a new apple. Called by the actionPerformed method.
     */
    public void checkApple() {
        if ((x[0] == appleX) && (y[0] == appleY)) {
            bodyParts++;
            applesEaten++;
            newApple();
        }
    }

    /**
     * Checks if the snake has collided with the edges of the screen or with itself.
     * If yes, stops the game.
     */
    public void checkCollision() {
        // Check if head collides with body
        for (int i = bodyParts; i > 0; i--) {
            if ((x[0] == x[i]) && (y[0] == y[i])) {
                running = false;
            }
        }
        // Checks collision with the edges of the screen
        if (x[0] < 0 || y[0] < 0 || x[0] > SCREEN_WIDTH || y[0] > SCREEN_HEIGHT) {
            running = false;
        }
        if (!running) {
            timer.stop();
        }
    }

    /**
     * Draws the game over message on the game panel.
     * 
     * @param g Graphics object used to draw the message
     */
    public void gameOver(Graphics g) {
        // Display score
        g.setColor(Color.red);
        g.setFont(new Font("Ink Free", Font.BOLD, 40));
        FontMetrics metrics_score = getFontMetrics(g.getFont());
        g.drawString("Score:\t" + applesEaten, (SCREEN_WIDTH - metrics_score.stringWidth("Score:\t" + applesEaten)) / 2,
                g.getFont().getSize());
        // Game over Text
        g.setColor(Color.red);
        g.setFont(new Font("Ink Free", Font.BOLD, 75));
        FontMetrics metrics = getFontMetrics(g.getFont());
        g.drawString("Game Over", (SCREEN_WIDTH - metrics.stringWidth("Game Over")) / 2, SCREEN_HEIGHT / 2);
    }

    /**
     * Handles the actionPerformed event triggered by the timer. Moves the snake,
     * checks for apple and collision, and repaints the game panel.
     */
    public void actionPerformed(ActionEvent e) {
        if (running) {
            move();
            checkApple();
            checkCollision();
        }
        repaint(); // calls paintComponent method which in turn calls draw method
    }

    /**
     * Inner class for handling key events.
     */
    public class MyKeyAdapter extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            switch (e.getKeyCode()) {
                case KeyEvent.VK_LEFT:
                    if (direction != 'R') {
                        direction = 'L';
                    }
                    break;
                case KeyEvent.VK_RIGHT:
                    if (direction != 'L') {
                        direction = 'R';
                    }
                    break;
                case KeyEvent.VK_UP:
                    if (direction != 'D') {
                        direction = 'U';
                    }
                    break;
                case KeyEvent.VK_DOWN:
                    if (direction != 'U') {
                        direction = 'D';
                    }
                    break;
                default:
                    break;
            }
        }
    }
}
