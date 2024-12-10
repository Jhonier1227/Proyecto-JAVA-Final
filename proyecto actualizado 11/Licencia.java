import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Licencia extends JFrame implements ActionListener, ChangeListener{

private JLabel label1, label2;
private JCheckBox check1;
private JButton boton1, boton2;
private JScrollPane scrollpane1;
private JTextArea textarea1;

public Licencia(){
	setLayout(null);
	setTitle("Licencia de uso");
	setIconImage(new ImageIcon(getClass().getResource("images/web.png")).getImage());

label1 = new JLabel("TERMINOS Y CONDICIONES");
label1.setBounds(215,5,200,30);
label1.setFont(new Font("Andale mono", 1, 14));
label1.setForeground(new Color(0,0,0));
add(label1);

textarea1 = new JTextArea();
textarea1.setEditable(false);
textarea1.setFont(new Font("Andale mono", 0,9));
textarea1.setText("\n\n          TÉRMINOS Y CONDICIONES" +
                    "\n\n            A.  PROHIBIDA SU VENTA O DISTRIBUCIÓN SIN AUTORIZACIÓN DE LA APLICACION WEB DE SABORES." +
                    "\n            B.  PROHIBIDA LA ALTERACIÓN DEL CÓDIGO FUENTE O DISEÑO DE LAS INTERFACES GRÁFICAS." +
                    "\n            C.  WEB DE SABORES NO SE HACE RESPONSABLE DEL MAL USO DE ESTE SOFTWARE." +
                    "\n\n          LOS ACUERDOS LEGALES EXPUESTOS ACONTINUACIÓN RIGEN EL USO QUE USTED HAGA DE ESTE SOFTWARE" +
                    "\n          (WEB DE SABORES DE JHONIER), NO SE RESPONSABILIZAN DEL USO QUE USTED" + 
                    "\n          HAGA CON ESTE SOFTWARE Y SUS SERVICIOS. PARA ACEPTAR ESTOS TERMINOS HAGA CLIC EN (ACEPTO)" +
                    "\n          SI USTED NO ACEPTA ESTOS TERMINOS, HAGA CLIC EN (NO ACEPTO) Y NO UTILICE ESTE SOFTWARE." + 
                    "\n\n          PARA MAYOR INFORMACIÓN SOBRE NUESTROS PRODUCTOS O SERVICIO" + 
                    "\n        ");

scrollpane1 = new JScrollPane(textarea1);
scrollpane1.setBounds(10,40,575,200);
add(scrollpane1);

check1 = new JCheckBox("Yo Acepto");
check1.setBounds(10,250,300,20);
check1.addChangeListener(this);
add(check1);

boton1 = new JButton("Aceptar");
boton1.setBounds(10,290,100,30);
boton1.addActionListener(this);
boton1.setEnabled(false); 
add(boton1);

boton2 = new JButton("No Aceptar");
boton2.setBounds(120,290,100,30);
boton2.addActionListener(this);
boton2.setEnabled(true); 
add(boton2);

ImageIcon imagen = new ImageIcon("images/mex.png");
label2 = new JLabel(imagen);
label2.setBounds(315,135,300,300);
add(label2);
}

//cambio de eventos

public void stateChanged(ChangeEvent e){
	if(e.getSource() == check1){
		boton1.setEnabled(check1.isSelected());
		
	}
}

public void actionPerformed(ActionEvent e){
    
if ( e.getSource() == boton1){
  	

    
    PrincipalOficial Ventana = new PrincipalOficial();
    Ventana.setBounds(135,445,1300,720);
    Ventana.setVisible(true);
    Ventana.setResizable(true);
    Ventana.setLocationRelativeTo(null);
    dispose();
     
  
        }

}

public static void main (String args[]){

	Licencia ventanalicencia = new Licencia();
	ventanalicencia.setBounds(250,250,600,360);
	ventanalicencia.setVisible(true);
	ventanalicencia.setResizable(false);
	ventanalicencia.setLocationRelativeTo(null);
	}
}