/*
 * Copyright Brian Ricks, PhD, 2016. bricks at unomaha.edu
 */
package andrew;

import java.awt.HeadlessException;
import javax.swing.JFrame;

/**
 *
 * @author bricks
 */
public class Andrew extends JFrame{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        Andrew andrew = new Andrew();
    }

    public Andrew()  {
        
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Andrew");
        this.add(new AndrewPanel());
        this.pack();
        
    }
    
    
    
}
