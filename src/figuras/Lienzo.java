package figuras;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Lienzo extends JPanel  {

    public Lienzo() {
    }
    public void paintComponent(Graphics g, int x) {
        
        super.paintComponent(g);  
        g.clearRect(190, 0, 550, 350);
        g.setColor(Color.red);
        if (x == 1) {      
            g.fillRect(250, 50, 250, 250);        
        }
        if(x == 2){
           g.fillRect(250, 50, 200, 265);
        }
        if(x == 3){
            int vectorX2[] = {350, 500, 200};
            int vectorY2[] = {50, 280, 280};
            g.fillPolygon(vectorX2, vectorY2, 3);
        }
        if(x == 4){
            g.fillOval(200, 40, 290, 290);
        }
        if(x == 5){
            g.fillOval(200, 70, 300, 200);
        }
    }

    
}
