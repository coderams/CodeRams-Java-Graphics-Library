import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.lang.Math.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.*;
import java.lang.Math.*;
import java.applet.Applet;
import java.net.URL;
import javax.sound.sampled.*;
import java.applet.AudioClip;
import java.net.URL;

public class Display extends drawInterface {
    
    Game game;
    Mouse mouse;
    MoveMouse mm;
    Keyboard kb;
    Frame frame;
    
    int tx, ty = 0;
    
    public Display(Game g, Mouse m, Keyboard k, MoveMouse mmw, Frame frm) {
        super();
    }
    
    public void draw(){
        super.repaint();
    }
    
    public void resetMatrix() {
        tx = 0;
        ty = 0;
    }
    
    public void translate(int xx, int yy) {
        tx += xx;
        ty += yy;
    }
    
    public void paintComponent(Graphics g){
        
        super.paintComponent(g);
        
        //Your code goes here!
        
        fill(255, 0, 0, g);
        rect(500, 500, 100, 100, g, 0, 0);
        //This example draws a red rectangle on the screen.
        
    }
}