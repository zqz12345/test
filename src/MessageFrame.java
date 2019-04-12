import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class MessageDialog extends JDialog {			 // 创建自定义对话框类，并继承JDialog类
    public MessageDialog(MessageFrame frame) {
        // 实例化一个JDialog类对象，指定对话框的父窗体、窗体标题和类型
        super(frame, "《Java编程词典》", true);
        Container container = getContentPane();	 // 创建一个容器
        container.add(new JLabel("<html>《Java编程词典》珍藏版软件是由明日科技公司组织近百位Java资深技术专家历经多年的积累为广大程序设计人员开发的高效编程学习软件。</html>")); // 在容器中添加标签
        setBounds(120, 120, 300, 100);			 // 设置对话框窗体在桌面显示的坐标和大小
    }
}

public class MessageFrame extends JFrame {

    private JPanel contentPane;

    public static void main(String[] args) {
        new MessageFrame().setVisible(true);
    }

    public MessageFrame() {
        setTitle("信息提示对话框");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 360, 220);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JButton button = new JButton("《Java编程词典》");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MessageDialog jDialog = new MessageDialog(MessageFrame.this);
                jDialog.setVisible(true);
            }
        });
        button.setBounds(50, 27, 150, 30);
        contentPane.add(button);
    }
}
