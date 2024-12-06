import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Bienvenida extends JFrame implements ActionListener{
private JTextField textfield1;
private JLabel label1,label2,label3,label4;
private JButton boton1;

public Bienvenida(){
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("WEB SABORES");
        getContentPane().setBackground(new Color(217, 255, 255));
        setIconImage(new ImageIcon(getClass().getResource("/images/web.png")).getImage());
        
        // imagen de entrada: logo del restaurante

       ImageIcon imagen = new ImageIcon("images/mex.png");
       label1 = new JLabel(imagen);
       label1.setBounds(350,-45,300,300);
       add(label1);
    
    // imagen de maracas de bienvenid lado: IZQUIERDO
       
        ImageIcon imagen1 = new ImageIcon("images/maracas.png");
       label1 = new JLabel(imagen1);
       label1.setBounds(140,100,300,300);
       add(label1);
       
         // imagen de maracas de bienvenid lado: DERECHO
       
        ImageIcon imagen2 = new ImageIcon("images/maracas.png");
       label1 = new JLabel(imagen2);
       label1.setBounds(500,100,300,300);
       add(label1);
       
   // FRASE DE BIENVENIDAD - MEXICO EN TU PLATO

      label2 = new JLabel(" !Mexico en tu plato! ");
      label2.setBounds(360,180,300,30);
      label2.setFont(new Font("buenas noches",3,18));
      label2.setForeground(new Color(0,0,0));
      add(label2);
      
      // CAMPO DE TEXTO DE ENTRADA

     label3 = new JLabel("ingrese su nombre");
     label3.setBounds(400,220,200,30);
     label3.setFont(new Font("buenas noches",3,12));
     label3.setForeground(new Color(215, 9, 29));
     add(label3);
     
     // Nombre de los autores de la aplicacion web

     label4 = new JLabel ("jhonier y andres Sena 2024");
     label4.setBounds(370,400,300,30);
     label4.setFont(new Font("buenas noches",3,12));
     label4.setForeground(new Color(0,0,0));
     add(label4);

 textfield1 = new JTextField();
 textfield1.setBounds(350,250,200,25);
 textfield1.setBackground(new Color(255, 255, 255));
 textfield1.setFont(new Font("nombre",1,14));
 textfield1.setForeground(new Color(0,0,0));
add(textfield1);

// boton de ingresar a la aplicacion web

boton1 = new JButton("ingresar");
boton1.setBounds(370,300,150,30);
boton1.setForeground(new Color(0,0,0));
boton1.setFont(new Font(" ",1,14));
boton1.setForeground(new Color(0,0,0));
boton1.addActionListener(this);
add(boton1);
// porrrrrrrrrrrrrrrrrrrrrrrrr
  }

public void actionPerformed(ActionEvent jhon){
  if ( jhon.getSource() == boton1){
  	
    PrincipalOficial Ventana = new PrincipalOficial();
    Ventana.setBounds(135,445,1300,720);
      Ventana.setVisible(true);
    Ventana.setResizable(true);
    Ventana.setLocationRelativeTo(null);
     dispose();
     
  
        }

  }
public static void main(String arg[]){

 Bienvenida Ventanabienvenida = new Bienvenida();
 
 Ventanabienvenida.setBounds(0,0,900,500);
 Ventanabienvenida.setVisible(true);
 Ventanabienvenida.setResizable(false);
 Ventanabienvenida.setLocationRelativeTo(null);





}


}




