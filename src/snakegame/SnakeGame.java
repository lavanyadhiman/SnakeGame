
package snakegame;
import javax.swing.*;
public class SnakeGame extends JFrame {
    SnakeGame()
    {
        super("Snake Game");
        add(new Board());
        pack();
        setLocationRelativeTo(null);
        setResizable(false);
        setSize(300,300);
    }
    public static void main(String[] args) 
    {
        new SnakeGame(). setVisible(true);
    }
    
}
  