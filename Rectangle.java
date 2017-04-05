/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangle;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Alumno
 */
public class Rectangle extends JFrame{
 public Rectangle(){
    this.setTitle("Rectangle");
    this.setSize(400, 300);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null);
    
    this.setLayout(new GridLayout(10, 1));
    
    JButton button1 = new JButton("Calculate");
    JLabel label1 = new JLabel("Width");
    JLabel label2 = new JLabel("Height");
    JLabel label3 = new JLabel("Rectangle Program");
    JTextField textField1 = new JTextField();
    JTextField textField2 = new JTextField();
    JTextField textField3 = new JTextField();
    JLabel perimeter = new JLabel("Perimeter:");
    JLabel area = new JLabel("Area:");
    
    button1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            //System.out.println("RASENGAN PRROS");
            double p = Double.parseDouble(textField1.getText());
            double s = Double.parseDouble(textField2.getText());
            double g = p*s;
            area.setText(g);
        }
    });
    
    this.add(label3);
    this.add(label1);
    this.add(textField1);
    this.add(label2);
    this.add(textField2);
    this.add(button1);
    this.add(perimeter);
    this.add(area);
    this.setVisible(true);
    
 }
    public static void main(String[] args) {
      Rectangle frame = new Rectangle();//Barra de titulo
    }
    
}
