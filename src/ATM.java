import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ZhangSan extends JDialog{
    public ZhangSan(ATM frame){
        super(frame,"警告",true);
        Container container = getContentPane();
        container.add(new JLabel("请将银行卡放入自动取款机中......"));
        setBounds(120,120,255,100);
    }
}
public class ATM extends JFrame {
    private JPanel contentPane;

    public static void main(String[] args) {
        new ATM().setVisible(true);
    }
    public ATM(){
        setTitle("xx银行自动取款机");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,100,260,120);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5,5,5,5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        JButton button = new JButton("取款");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ZhangSan jDialog = new ZhangSan(ATM.this);
                jDialog.setVisible(true);
            }
        });
        button.setBounds(90,27,60,30);
        contentPane.add(button);
    }
}
