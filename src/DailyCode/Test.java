package DailyCode;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test extends JFrame implements ActionListener {
    Button btn;
    Label lbl;
    int value=0;
    public Test(){
        btn=new Button("123");
        setLayout(new FlowLayout());
        add(btn);
        lbl=new Label("0");
        add(lbl);
        btn.addActionListener(this);
        setVisible(true);
        setSize(1920,1080);
    }

    public static void main(String[] args) {
        new Test();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
      value++;
      lbl.setText(""+value);
    }
}



