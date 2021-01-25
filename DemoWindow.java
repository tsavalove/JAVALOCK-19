import javax.swing.*;
import javax.swing.JFrame ;
import javax.swing.JButton;

public class DemoWindow {
     public static void main(String[] args) {
         JFrame jf = new JFrame("Covid Tracing");
         JButton jb = new JButton("Hello from Javalock-19");
         jf.setBounds(0, 0, 800, 600);
         jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         jf.getContentPane().add(jb);
         
         jf.setVisible(true);
        
    }


}