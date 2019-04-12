import javax.swing.*;
import java.awt.*;

public class Man extends JFrame {
    public Man(){
        setTitle("《射雕英雄传》");
        Container c = getContentPane();
        setLayout(new BorderLayout());
        JButton centerBtn = new JButton("中神通"),
                northBtn = new JButton("北丐"),
                southBtn = new JButton("南帝"),
                westBtn = new JButton("西毒"),
                eastBtn = new JButton("东邪") ;
        c.add(centerBtn,BorderLayout.CENTER);
        c.add(northBtn,BorderLayout.NORTH);
        c.add(southBtn,BorderLayout.SOUTH);
        c.add(westBtn,BorderLayout.WEST);
        c.add(eastBtn,BorderLayout.EAST);
        setSize(300,200);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Man();
    }
}
