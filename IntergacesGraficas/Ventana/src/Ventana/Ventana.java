// Como crear una ventana
// Heredar la clase JFrame
package Ventana;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import javax.swing.JFrame;
import javax.swing.*;

public class Ventana extends JFrame{
    JPanel panel;
    
    public Ventana(){
        setSize(500, 500); // Se establece el tamano de la ventana
        setTitle("Ejemplo Ventana"); // Establece el titulo superior de la ventana
        //setLocation(100, 200);// Establece la locacion donde aparacera la ventana
        //setBounds(100, 200, 500, 500); // Estable el tamano y establece la locacion a la vez
        setLocationRelativeTo(null); // Con el argumento null establece la locacion en el centro de la pantalla
        //setResizable(false); // Evita que el usuario pueda cambiar el tamaño de la ventana
        setMinimumSize(new Dimension(300, 300));
        // this.getContentPane().setBackground(Color.BLUE); // Establecer el color de la ventana     
        iniciarComponentes();
        setDefaultCloseOperation(EXIT_ON_CLOSE); // Finaliza el programa al cerrar la ventana
    }
    
    // Creamos un metodo para crear un Panel - esto para tener ordenado
    private void iniciarComponentes(){
        colocarPaneles();
        // colocarEtiquetas();
        colocarBotones();
    }
    
    private void colocarPaneles(){
        panel = new JPanel();
        //panel.setBackground(Color.DARK_GRAY); // Se establece el color del panel
        panel.setLayout(null);
        this.getContentPane().add(panel); // Se agrega el panel a la ventana
    }
    
    private void colocarEtiquetas(){
        // Con SwingConstans estableces la alineacion del texto: CENTER, RIGHT, LEFT,..
        // JLabel etiqueta = new JLabel("Hola que tal", SwingConstants.CENTER);
        JLabel etiqueta = new JLabel();
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER); // Esta es otra manera de estableces la alineación
        etiqueta.setText("Mundial 2022");
        etiqueta.setBounds(85, 10, 300, 80);
        etiqueta.setForeground(Color.black); // Cambiar el color del texto de la etiqueta
        // Para cambiar el color se debe desactivar los disenos por defecto del componente
        // etiqueta.setOpaque(true); // True permite pintar el fondor
        // etiqueta.setBackground(Color.red);
        etiqueta.setFont(new Font("copper black", 0, 30)); // Establece fuente del texto
        panel.add(etiqueta);
        
        // Etiqueta imagen - Primera forma
        ImageIcon imagen = new ImageIcon("mundial.jpg");
        JLabel etiqueta2 = new JLabel();
        etiqueta2.setBounds(20, 100, 400, 270);
        etiqueta2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(etiqueta2.getWidth(), etiqueta2.getHeight(), Image.SCALE_SMOOTH)));
        panel.add(etiqueta2);
    }
    
    private void colocarBotones(){
        JButton boton = new JButton();
        boton.setBounds(100, 100, 100, 50);
        boton.setText("Boton");
        boton.setEnabled(true); // Desabilita el boton
        boton.setMnemonic('a'); // Establecemos un atajo (alt + char)
        boton.setForeground(Color.blue);// Cambiar color de la letra
        boton.setFont(new Font("arial", 1, 16));// Cambiar fuente de la letra
        panel.add(boton);
    }
}
