package shiti03_3202015010334;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyGui extends JFrame  {

    JTextField username,id;
    JButton register;
    JLabel label;

    public MyGui(){
        super("简易个人信息录用系统");
        Container cont=getContentPane();
        cont.setLayout(new FlowLayout());
        cont.add(new JLabel("姓名"));
        username=new JTextField(10);
        cont.add(username);
        cont.add(new JLabel("学号"));
        id=new JTextField(10);
        cont.add(id);
        register=new JButton("录入");
        cont.add(register);
        register.addActionListener(new Process() );
        label=new JLabel();
        cont.add(label);
        setSize(700,100);
        setVisible(true);


    }
    class Process implements  ActionListener{
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            label.setText("个人信息为："+register.getText()+id.getText());
        }
    }
    public static void main(String[] args) {
        new MyGui();
    }


}
