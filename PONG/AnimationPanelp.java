import java.awt.*;
import javax.swing.*;

public class AnimationPanelp extends JPanel{
  //prop 
  int inty = 250-(75/2);
  int inty2 = 250-(75/2);
  int intxb=395;
  int intyb=245;
  int intxdelta=5;
  int intydelta=1;
  int intspeed=(int)(Math.random()*10+1);
  
  int intp1=0;
  int intp2=0;
  //meth
  public void paintComponent(Graphics g){
    g.setColor(Color.BLACK);
    g.fillRect(0,0,900,600);
    
    g.setColor(Color.MAGENTA);
    g.fillRect(10,inty,10,75);
    
    g.setColor(Color.GREEN);
    g.fillRect(780,inty2,10,75);
    
    g.setColor(Color.WHITE);
    g.fillRect(intxb,intyb,10,10);
    
    g.fillRect(400,0,5,600);
    
    intxb = intxb+intxdelta;
    intyb = intyb+intydelta;
    if(intxb<0){
      intxdelta = -1*intxdelta;
      intp2=intp2+1;
      intxdelta=intxdelta*-1;
      intxb=395;
    }
    if(intxb>800){
      intxdelta = -1*intxdelta;
      intp1=intp1+1;
      intxdelta=intxdelta*-1;
      intxb=395;
    }
    if(intyb<0){
      intydelta = -1*intydelta;
    }
    if(intyb>500){
      intydelta = -1*intydelta;
    }
    if(intxb<=20&&intyb>=inty&&intyb<=inty+75){
      intxdelta = -1*intxdelta;
      //intydelta = -1*intydelta;
      if(intxdelta<7){
      intxdelta = intxdelta-1;
      }
      if(intydelta<0&&intydelta>-7){
        intydelta = intydelta-1;
      }else if(intydelta>0&&intydelta<7){
        intydelta = intydelta+1;
      }
    }
    if(intxb>=770&&intyb>=inty2&&intyb<=inty2+75){
      intxdelta = -1*intxdelta;
      //intydelta = -1*intydelta;
      if(intxdelta<7){
      intxdelta = intxdelta-1;
      }
      if(intydelta<0&&intydelta>-7){
        intydelta = intydelta-1;
      }else if(intydelta>0&&intydelta<7){
        intydelta = intydelta+1;
      }
    }
  }
  //con
  public AnimationPanelp(){
    super();
  }
  //main 
  
}