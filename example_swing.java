import javax.javax.swing.*;
import javax.swing.JButton;
import javax.swing.JFrame;
public class example_swing{

    public static void main(String[] args) {

        JFrame f=new JFrame();

        JButton btn1=new JButton("click");
        btn1.setBounds(130, 100, 100, 10);//x,y,width,height
        f.add(btn1);
        f.setSize(400,500);
        f.setLayout(null);
        f.setVisible(true);
        
    }
}