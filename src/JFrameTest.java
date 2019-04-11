import javax.swing.*;
import java.awt.*;

public class JFrameTest extends JFrame {     //定义一个类继承JFrame类
    public void CreateJFrame(String title){  //定义一个CreateJFrame()方法
        JFrame jf = new JFrame(title);      //创建一个JFrame对象
        Container container = jf.getContentPane();//获取一个容器
        JLabel jl = new JLabel("这是一个JFrame窗体");//创建一个JLabel标签
        jl.setHorizontalAlignment(SwingConstants.CENTER);//使标签上的文字居中
        container.add(jl);                               //添加标签到容器中
        container.setBackground(Color.white);            //设置窗体背景颜色
        jf.setVisible(true);                             //设置窗体可见
        jf.setSize(200,150);              //设置窗体大小
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//设置窗体关闭方式
    }
    public static void main(String[] args) {
        new JFrameTest().CreateJFrame("创建一个JFramer窗体"); //在主方法中调用CreateJFrame()方法
    }
}
