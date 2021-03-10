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
    
    int x = 400;
    int y = 300;
    
    public Display(Game g, Mouse m, Keyboard k, MoveMouse mmw, Frame frm) {
        super();
        
        game = g;
        mouse = m;
        kb = k;
        mm = mmw;
        frame = frm;
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
        
        //
        
        /*if (y < 720) {
            y += 1;
        }
        
        if (x < 1080) {
            x += 1;
        }*/
        
        fill(255, 0, 0, g);
        
        if (mouse.clicked == true) {
            fill(0, 255, 0, g);
        }
        
        rect(x, y, 200, 100, g, 0, 0);
        
        //This example draws a red rectangle on the screen.
        
    }
}