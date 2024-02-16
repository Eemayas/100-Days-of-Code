import java.awt.*; // Importing necessary classes for using AWT features
import java.awt.event.*; // Importing necessary classes for AWT event features
import java.util.*; // Importing classes for using utility features
import javax.swing.*; // Importing necessary classes for using Swing features

public class TicTacToe implements ActionListener { // Defining a public class TicTacToe that implements ActionListener

    Random random = new Random(); // Creating a new Random object for generating random numbers

    JFrame frame = new JFrame(); // Creating a new JFrame object for the game window
    JPanel title_panel = new JPanel(); // Creating a new JPanel object for the title panel
    JPanel button_panel = new JPanel(); // Creating a new JPanel object for the button panel
    JLabel textfield = new JLabel(); // Creating a new JLabel object for displaying the current player's turn
    JButton[] buttons = new JButton[9]; // Creating a new JButton array for the game buttons
    boolean player1_turns; // Creating a boolean variable to keep track of the current player's turn

    TicTacToe() { // Constructor for the TicTacToe class
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Setting the default close operation for the JFrame
        frame.setSize(800, 800); // Setting the size of the JFrame
        frame.getContentPane().setBackground(new Color(50, 50, 50)); // Setting the background color of the JFrame
        frame.setLayout(new BorderLayout()); // Setting the layout of the JFrame
        frame.setVisible(true); // Making the JFrame visible

        textfield.setBackground(new Color(25, 25, 25)); // Setting the background color of the JLabel
        textfield.setForeground(new Color(25, 255, 0)); // Setting the foreground color of the JLabel
        textfield.setFont(new Font("Ink Free", Font.BOLD, 75)); // Setting the font of the JLabel
        textfield.setHorizontalAlignment(JLabel.CENTER); // Centering the text in the JLabel
        textfield.setText("Tic Tac Toe"); // Setting the text of the JLabel
        textfield.setOpaque(true); // Making the JLabel opaque

        title_panel.setLayout(new BorderLayout()); // Setting the layout of the title panel
        title_panel.setBounds(0, 0, 800, 100); // Setting the bounds of the title panel

        button_panel.setLayout(new GridLayout(3, 3)); // Setting the layout of the button panel to a 3x3 grid
        button_panel.setBackground(new Color(150, 150, 150)); // Setting the background color of the button panel

        for (int i = 0; i < 9; i++) { // Loop to create the game buttons
            buttons[i] = new JButton(); // Creating a new JButton object
            button_panel.add(buttons[i]); // Adding the JButton object to the button panel
            buttons[i].setFont(new Font("MV Boli", Font.BOLD, 120)); // Setting the font of the JButton
            buttons[i].setFocusable(false); // Making the JButton not focusable
            buttons[i].addActionListener(this); // Adding an ActionListener to the JButton
        }

        title_panel.add(textfield); // Adding the JLabel to the title panel
        frame.add(title_panel, BorderLayout.NORTH); // Adding the title panel to the JFrame
        frame.add(button_panel); // Adding the button panel to the JFrame

        firstTurn(); // Calling the firstTurn method
    }

    public void firstTurn() { // Method to determine the first player randomly
        try {
            Thread.sleep(2000); // Pausing the thread for 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace(); // Printing the stack trace if interrupted
        }
        if (random.nextInt(2) == 0) { // Generating a random number between 0 and 1
            player1_turns = true; // Setting the current player to player 1
            textfield.setText("X Turn"); // Setting the text of the JLabel to "X Turn"
        } else {
            player1_turns = false; // Setting the current player to player 2
            textfield.setText("O Turn"); // Setting the text of the JLabel to "O Turn"
        }
    }

    public void check() { // Method to check if a player has won
        // Checking rows
        for (int i = 0; i < 3; i++) {
            if (buttons[i * 3].getText().equals(buttons[i * 3 + 1].getText())
                    && buttons[i * 3 + 1].getText().equals(buttons[i * 3 + 2].getText())
                    && !buttons[i * 3].getText().equals("")) {
                if (buttons[i * 3].getText().equals("X")) {
                    xWins(i * 3, i * 3 + 1, i * 3 + 2); // Calling the xWins method if player 1 has won
                    return;
                } else {
                    oWins(i * 3, i * 3 + 1, i * 3 + 2); // Calling the oWins method if player 2 has won
                    return;
                }
            }
        }

        // Checking columns
        for (int i = 0; i < 3; i++) {
            if (buttons[i].getText().equals(buttons[i + 3].getText())
                    && buttons[i + 3].getText().equals(buttons[i + 6].getText())
                    && !buttons[i].getText().equals("")) {
                if (buttons[i].getText().equals("X")) {
                    xWins(i, i + 3, i + 6); // Calling the xWins method if player 1 has won
                    return;
                } else {
                    oWins(i, i + 3, i + 6); // Calling the oWins method if player 2 has won
                    return;
                }
            }
        }

        // Checking diagonals
        if (buttons[0].getText().equals(buttons[4].getText())
                && buttons[4].getText().equals(buttons[8].getText())
                && !buttons[0].getText().equals("")) {
            if (buttons[0].getText().equals("X")) {
                xWins(0, 4, 8); // Calling the xWins method if player 1 has won
                return;
            } else {
                oWins(0, 4, 8); // Calling the oWins method if player 2 has won
                return;
            }
        }

        if (buttons[2].getText().equals(buttons[4].getText())
                && buttons[4].getText().equals(buttons[6].getText())
                && !buttons[2].getText().equals("")) {
            if (buttons[2].getText().equals("X")) {
                xWins(2, 4, 6); // Calling the xWins method if player 1 has won
                return;
            } else {
                oWins(2, 4, 6); // Calling the oWins method if player 2 has won
                return;
            }
        }

        // Checking for a draw
        boolean draw = true;
        for (int i = 0; i < 9; i++) {
            if (buttons[i].getText().equals("")) {
                draw = false; // Setting the draw variable to false if any button is not clicked
                break;
            }
        }
        if (draw) {
            textfield.setText("Game Over: It's a draw!"); // Setting the text of the JLabel to "Game Over: It's a draw!" if the game is a draw
        }
    }

    public void xWins(int a, int b, int c) { // Method to handle player 1 winning
        buttons[a].setBackground(Color.GREEN); // Changing the background color of the winning buttons to green
        buttons[b].setBackground(Color.GREEN);
        buttons[c].setBackground(Color.GREEN);

        for (int i = 0; i < 9; i++) { // Disabling all buttons after a player has won
            buttons[i].setEnabled(false);
        }
        textfield.setText("X Wins"); // Setting the text of the JLabel to "X Wins"
    }

    public void oWins(int a, int b, int c) { // Method to handle player 2 winning
        buttons[a].setBackground(Color.GREEN); // Changing the background color of the winning buttons to green
        buttons[b].setBackground(Color.GREEN);
        buttons[c].setBackground(Color.GREEN);

        for (int i = 0; i < 9; i++) { // Disabling all buttons after a player has won
            buttons[i].setEnabled(false);
        }
        textfield.setText("O Wins"); // Setting the text of the JLabel to "O Wins"
    }

    @Override
    public void actionPerformed(ActionEvent e) { // Overriding the actionPerformed method from the ActionListener interface
        for (int i = 0; i < 9; i++) { // Loop to handle button clicks
            if (e.getSource() == buttons[i]) { // Checking if the clicked button is one of the game buttons
                if (player1_turns) { // Checking if it's player 1's turn
                    if (buttons[i].getText().equals("")) { // Checking if the button is not clicked
                        buttons[i].setForeground(new Color(255, 0, 0)); // Changing the text color of the button to red
                        buttons[i].setText("X"); // Setting the text of the button to "X"
                        player1_turns = false; // Setting the current player to player 2
                        textfield.setText("O's turn"); // Setting the text of the JLabel to "O's turn"
                        check(); // Calling the check method to see if a player has won
                    }
                } else { // If it's not player 1's turn
                    if (buttons[i].getText().equals("")) { // Checking if the button is not clicked
                        buttons[i].setForeground(new Color(0, 0, 255)); // Changing the text color of the button to blue
                        buttons[i].setText("O"); // Setting the text of the button to "O"
                        player1_turns = true; // Setting the current player to player 1
                        textfield.setText("X's turn"); // Setting the text of the JLabel to "X's turn"
                        check(); // Calling the check method to see if a player has won
                    }
                }
            }
        }
    }
}
