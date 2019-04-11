package pack1;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;




public class Feu_Jaune  extends JFrame implements Etat_circulation{

    public static void main(String[] args) {
     
        Feu_Jaune S= new Feu_Jaune();
        S.circuler();
        
    }
  
    
    @Override
    public void circuler() {
        // TODO Auto-generated method stub
        JFrame B= new JFrame();
        JPanel p= new JPanel();
        ImageIcon icon = new ImageIcon("F2.PNG");;
        JLabel image= new JLabel(icon);
        //BufferedImage myPicture = null;
       
        p.add(image);
        //p.repaint();
        B.setTitle("Ma premiere fenetre en java");
         B.setSize(500,550);
        B.setLocationRelativeTo(null);
       p.add(new JButton("Mon Bouton"));
        B.setContentPane(p);
        B.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        B.setVisible(true);
        
    }




    
}
