import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class pong implements ActionListener, KeyListener{
  //prop
  JFrame theframe;
  AnimationPanelp thepanel;
  Timer thetimer;
  JLabel p1;
  JLabel p2;
  
  boolean blnspressed = false;
  boolean blnwpressed = false;
  
  boolean blnkpressed = false;
  boolean blnipressed = false;
  
  //meth 
  public void actionPerformed(ActionEvent evt){
    if(evt.getSource() == thetimer){
      if(blnspressed == true&&thepanel.inty<425){
        thepanel.inty = thepanel.inty + 15;
      }
      if(blnwpressed == true&&thepanel.inty>0){
        thepanel.inty = thepanel.inty - 15;
      }
      if(blnkpressed == true&&thepanel.inty2<425){
        thepanel.inty2 = thepanel.inty2 + 15;
      }
      if(blnipressed == true&&thepanel.inty2>0){
        thepanel.inty2 = thepanel.inty2 - 15;
      }
      thepanel.repaint();
      p1.setText("player 1: "+thepanel.intp1);
      p2.setText("player 2: "+thepanel.intp2);
    }
  }
  public void keyReleased(KeyEvent evt){
    //only happens when a key is released
    if(evt.getKeyChar()=='s'){
      blnspressed = false;
    }else if(evt.getKeyChar()=='w'){
      blnwpressed = false;
    }else if(evt.getKeyChar()=='k'){
      blnkpressed = false;
    }else if(evt.getKeyChar()=='i'){
      blnipressed = false;
    }
  }
  public void keyPressed(KeyEvent evt){
    //only happens when a key is pressed
    if(evt.getKeyChar()=='s'){
      blnspressed = true;
    }else if(evt.getKeyChar()=='w'){
      blnwpressed = true;
    }if(evt.getKeyChar()=='k'){
      blnkpressed = true;
    }else if(evt.getKeyChar()=='i'){
      blnipressed = true;
    }
  }
  public void keyTyped(KeyEvent evt){
    if(evt.getKeyChar()=='p'){
      thetimer.start();
    }
  }
  //con
  public pong(){
    thepanel = new AnimationPanelp();
    thepanel.setPreferredSize(new Dimension(800,500));
    thepanel.setLayout(null);
    
    p1=new JLabel("player 1: "+thepanel.intp1);
    p1.setForeground(Color.WHITE);
    p1.setSize(100,30);
    p1.setLocation(300,10);
    thepanel.add(p1);
    
    p2=new JLabel("player 2: "+thepanel.intp2);
    p2.setForeground(Color.WHITE);
    p2.setSize(100,30);
    p2.setLocation(450,10);
    thepanel.add(p2);
    
    theframe = new JFrame("pong v 1.4");
    theframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    theframe.setResizable(false);
    theframe.setContentPane(thepanel);
    theframe.pack();
    theframe.setVisible(true);
    theframe.addKeyListener(this);
    
    thetimer = new Timer(1000/100, this);
    
  }
  //main
  public static void main(String[] args){
    pong pong = new pong();
  }
  
}