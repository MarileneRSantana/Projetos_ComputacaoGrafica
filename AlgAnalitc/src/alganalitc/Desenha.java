/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alganalitc;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;


public class Desenha extends JFrame {
    
    public Desenha(){
        
        
        this.setTitle("Linha Reta- Analitico");
        this.setSize(400, 400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);    
    }
    
    @Override
    public void paint(Graphics g){
        g.setColor(Color.pink);
        algAnalitic(g,10,50,60,100); 
        algAnalitic(g,10,50,60,50); 
        
    }
    
    public void algAnalitic(Graphics g, int xi, int yi, int xf, int yf){
        float m, b,dy,dx;
        dy = yf - yi;
        dx = xf - xi;
        
        m = (float) dy/dx;
        b = (float) (yi - m * xi);
        
        for(int x=xi;x<=xf;x++){
            int y=(int)(m*x+b);
            putPixel(g,x,y);
        }
        
    }
    
    public void putPixel(Graphics g, int x, int y){
        g.drawLine(x, y, x, y);
    
    }
    
}
