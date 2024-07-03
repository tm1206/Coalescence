package com.vitproject;

import javax.swing.*;  
import java.awt.event.*;  
import java.net.*;  
public class IPFinder extends JFrame implements ActionListener{  
    JLabel l;  
    JTextField tf;  
    JButton b;  
IPFinder(){  
    super("IP Finder Tool");  
    l=new JLabel("Enter Website URL:");  
    l.setBounds(50,70,150,20);;  
    tf=new JTextField();  
    tf.setBounds(50,100,200,20);  
      
    b=new JButton("Find IP");  
    b.setBounds(200,200,80,30);  
    b.addActionListener(this);  
    add(l);  
    add(tf);  
    add(b);
    setBounds(600, 200, 350, 300);    
    setLayout(null);  
    setVisible(true);
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
}  
public void actionPerformed(ActionEvent e){  
    String url=tf.getText();  
    try {  
        InetAddress ia=InetAddress.getByName(url);  
        String ip=ia.getHostAddress();  
        JOptionPane.showMessageDialog(this,"IP of "+url+" is: "+ip);  
    } catch (UnknownHostException e1) {  
        JOptionPane.showMessageDialog(this,e1.toString());  
    }  
}  
public static void main(String[] args) {  
    new IPFinder();  
}  
}  