package Platty;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Cody on 3/13/2016.
 */
public class Panel extends JPanel implements Runnable{

    public Panel(){
        new Thread(this).start();
    }

    public void runningLoop(){

    }

    public void paintComponent(Graphics g){
        g.setColor(Color.RED);
        g.fillRect(200,200,50,50);
    }
    public void run(){
        runningLoop();
        repaint();

        try{
            Thread.sleep(16);
            run();
        }catch(Exception e){

        }
    }

}
