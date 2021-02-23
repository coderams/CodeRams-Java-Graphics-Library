import java.util.*;
import javax.swing.*;

public class Main 
{
  public static void main(String[] args) 
    {
        
        JFrame frame = new JFrame("Untitled Project");
        Game game = new Game();
        
        Mouse mouse = new Mouse();
        frame.addMouseListener(mouse);
        Keyboard keyboard = new Keyboard();
        frame.addKeyListener(keyboard);
        MoveMouse mm = new MoveMouse();
        frame.addMouseMotionListener(mm);
        //You can add more mouse types (e.g. mouse scrolling) here
        
        Display screen = new Display(game, mouse, keyboard, mm, frame);
        frame.add(screen);
        
        frame.setBounds(0,0,1080,720); //The size of the project window
        
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        new Thread(game).start();
        new Thread(new frameRateUpdater(30, screen)).start();
  }
}