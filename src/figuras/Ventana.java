package figuras;


import java.awt.event.*;
import javax.swing.*;
public class Ventana extends JFrame  implements ActionListener{
JButton bCuadrado, bRectangulo, bTriangulo, bCirculo, bElipse;

    public Ventana() {
        setTitle("Figuras Geometricas");
        setBounds(0, 0, 550, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
        setLayout(null);
        bCuadrado = new JButton("Cuadrado");
        bCuadrado.setBounds(50, 50, 100, 30);
        add(bCuadrado);
        bCuadrado.addActionListener(this);

        bRectangulo = new JButton("Rectangulo");
        bRectangulo.setBounds(50, 90, 100, 30);
        add(bRectangulo);
        bRectangulo.addActionListener(this);

        bTriangulo = new JButton("Triangulo");
        bTriangulo.setBounds(50, 130, 100, 30);
        add(bTriangulo);
        bTriangulo.addActionListener(this);

        bCirculo = new JButton("Circulo");
        bCirculo.setBounds(50, 170, 100, 30);
        add(bCirculo);
        bCirculo.addActionListener(this);
                
        bElipse = new JButton("Elipse");
        bElipse.setBounds(50, 210, 100, 30);
        add(bElipse);
        bElipse.addActionListener(this);   
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         Lienzo lienzo1 = new Lienzo();
       if (e.getSource() == bCuadrado) {
            lienzo1.paintComponent(getGraphics(), 1);
        }
        if (e.getSource() == bRectangulo) {
            lienzo1.paintComponent(getGraphics(), 2);
        }
        if (e.getSource() == bTriangulo) {
            lienzo1.paintComponent(getGraphics(), 3);
        }
        if(e.getSource() == bCirculo){
            lienzo1.paintComponent(getGraphics(), 4);
        }
        
        if(e.getSource() == bElipse){
            lienzo1.paintComponent(getGraphics(), 5);
        }
    }
    
    

}
