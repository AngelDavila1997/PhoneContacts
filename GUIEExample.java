/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guie.example;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author Alumno
 */
public class GUIEExample extends JFrame{

 public GUIEExample(){
    this.setTitle("prros");
    this.setSize(500, 200);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null);
    
    this.setLayout(new BorderLayout());
    
    JButton button6 = new JButton("CHINGAO");
    JLabel label1 = new JLabel("YAAAA");
    JTextField textField = new JTextField();
    JPasswordField password = new JPasswordField();
    JPanel panel1 = new JPanel();
    panel1.setLayout(new GridLayout(2,3));
    JRadioButton redRadioButton = new JRadioButton("RED");
    JRadioButton greenRadioButton = new JRadioButton("GREEN");
    JRadioButton blueRadioButton = new JRadioButton("BLUE");
    
    label1.setForeground(Color.RED);
    redRadioButton.setSelected(true);
    
    ButtonGroup colourGroup = new ButtonGroup();
    
    redRadioButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
             label1.setForeground(Color.RED);; //To change body of generated methods, choose Tools | Templates.
        }
        });
    blueRadioButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
             label1.setForeground(Color.BLUE);; //To change body of generated methods, choose Tools | Templates.
        }
        });
    greenRadioButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
             label1.setForeground(Color.GREEN);; //To change body of generated methods, choose Tools | Templates.
        }
        });
    colourGroup.add(redRadioButton);
    colourGroup.add(greenRadioButton);
    colourGroup.add(blueRadioButton);
    
    JCheckBox boldCheckBox = new JCheckBox("Bold");
    JCheckBox italicCheckBox = new JCheckBox("Italic");
    
    panel1.add(redRadioButton);
    panel1.add(greenRadioButton);
    panel1.add(blueRadioButton);
    panel1.add(boldCheckBox);
    panel1.add(italicCheckBox);
    
    this.add(textField, BorderLayout.NORTH);
    this.add(password, BorderLayout.SOUTH);
    this.add(label1, BorderLayout.WEST);
    this.add(button6, BorderLayout.EAST);
    this.add(panel1, BorderLayout.CENTER);

    
    this.setVisible(true);
 }
 public void GUIEExample_backup(){
    this.setTitle("KONOHA");
    this.setSize(1000, 500);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null);
    
    
    //this.setLayout(new FlowLayout(FlowLayout.CENTER, 40, 50));
    this.setLayout(new GridLayout(5, 2)); //Renglones y columnas
    JButton button1 = new JButton("Boruto");
    JButton button2 = new JButton("Sakura");
    JButton button3 = new JButton("Naruto");
    JButton button4 = new JButton("Kakashi");
    JButton button5 = new JButton("Sasuke");
    JButton button6 = new JButton("Sai");
    JLabel label1 = new JLabel("This is naruto");
    JTextField textField = new JTextField();
    JPasswordField password = new JPasswordField();
    
    button1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            //System.out.println("RASENGAN PRROS");
            char[] p =password.getPassword();
            String s = String.copyValueOf(p);
            System.out.println(s);
        }
    });  //ACA SE CIERRA EL PARENTESIS
    this.add(button1);
    this.add(button2);
    this.add(button3);
    this.add(button4);
    this.add(button5);
    this.add(button6);
    this.add(label1);
    this.add(textField);
    this.add(password);
    
    this.setVisible(true);
 }
    public static void main(String[] args) {
        GUIEExample frame = new GUIEExample();
    }
    
}
