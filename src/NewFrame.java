import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class NewJDialog extends JDialog{
    public NewJDialog(NewFrame frame){
        super(frame,"《Java编程词典》",true);
        Container container = getContentPane();
        container.add(new JLabel("<html>《Java编程词典》珍藏版软件是由明日科技公司组织近百位Java资深技术专家历经多年的积累为广大程序设计人员开发的高效编程学习软件。</html>"));
        setBounds(120,120,300,100);
    }
}

public class NewFrame extends JFrame{
    public NewFrame(){
        Container container = getContentPane();
        container.setLayout(null);
        JButton bl = new JButton("《Java编程词典》");
        bl.setBounds(50,27,150,30);
        bl.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NewJDialog dialog = new NewJDialog(NewFrame.this);
                dialog.setVisible(true);
            }
        });
        container.add(bl);
        container.setBackground(Color.WHITE);
        setSize(300,250);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new NewFrame();
    }
}
