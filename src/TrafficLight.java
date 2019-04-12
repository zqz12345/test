import javax.swing.*;
import java.awt.*;

public class TrafficLight extends JFrame {
    public TrafficLight(){
        Container a = getContentPane();
        setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
        setSize(80,145);
        JButton red = new JButton("红灯");
        a.add(red);
        JButton yellow = new JButton("黄灯");
        a.add(yellow);
        JButton green = new JButton("绿灯");
        a.add(green);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TrafficLight();
    }
}
