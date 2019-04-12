import javax.swing.*;
import java.awt.*;

public class JPanelTest extends JFrame {
    public JPanelTest(){
        Container c = getContentPane();//创建容器
        c.setLayout(new GridLayout(2,1,10,10));//将容器设置为2行1列的网格布局，组件水平间隔10像素，垂直间隔10像素
        JPanel p1 = new JPanel(new GridLayout(1,4,10,10));//初始化一个面板，此面板使用1行4列的网格布局，组件水平间隔10像素，垂直间隔10像素
        JPanel p2 = new JPanel(new BorderLayout());//使用边界布局
        JPanel p3 = new JPanel(new GridLayout(1,2,10,10));
        JPanel p4 = new JPanel(new GridLayout(2,1,10,10));
        p1.setBorder(BorderFactory.createTitledBorder("面板1"));//给每个面板都添加边框和标题，使用BorderFactory工厂类生成带标题的边框对象
        p2.setBorder(BorderFactory.createTitledBorder("面板2"));
        p3.setBorder(BorderFactory.createTitledBorder("面板3"));
        p4.setBorder(BorderFactory.createTitledBorder("面板4"));
        p1.add(new JButton("b1"));//在面板中添加按钮
        p1.add(new JButton("b1"));
        p1.add(new JButton("b1"));
        p1.add(new JButton("b1"));
        p2.add(new JButton("b2"),BorderLayout.EAST);
        p2.add(new JButton("b2"),BorderLayout.WEST);
        p2.add(new JButton("b2"),BorderLayout.NORTH);
        p2.add(new JButton("b2"),BorderLayout.SOUTH);
        p2.add(new JButton("b2"),BorderLayout.CENTER);
        p3.add(new JButton("b3"));
        p3.add(new JButton("b3"));
        p4.add(new JButton("b4"));
        p4.add(new JButton("b4"));
        c.add(p1);
        c.add(p2);
        c.add(p3);
        c.add(p4);
        setTitle("这个窗体中使用了面板");
        setVisible(true);
        setSize(500,300);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JPanelTest();
    }
}
