/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package awesomejframe;
import javax.swing.JFrame;
/**
 *
 * @author Alumno
 */
public class AwesomeJFrame {
//Exiten componentes contenedores y ayudantes
    //El frame es un contenedor porque en el frame estan los componentes
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("Title");//Barra de titulo
        
        frame.setSize(500,200);//Ancho y despues alto
        frame.setLocationRelativeTo(null);//A que se relaciona ahorita ventana en el centro de la pantalla
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Exit on close es constante
        frame.setVisible(true);//Super importante para poder verla
    }
    
}
