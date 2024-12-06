import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class principal extends JFrame implements ActionListener{

         private  JMenuBar mb;
         private  JMenu menuOpciones,MenuCalcular, MenuAcercaDe,MenucolorFondo;
         private JMenuItem miCalculo,miVerde,miRojo,miNegro,miElCreador,miSalir,miNumero,miNuevo;
         private JLabel labelLogo,labelBienvenido, labelTitle,labelNombre,labelAPaterno, labelAMaterno,
         labelDepartamento,labelAntiguedad,labelResultado,labelfooter;

private JTextField texNombreTrabajador,texApaterno,texAmaterno;
private JComboBox <String> comboDepartamento,comboAntiguedad;
private JScrollPane scrollPane1;
private JTextArea textArea1;
// este bloque se envarga del nombre del encabezado de la ventana.
public principal(){
    setLayout (null);
    setTitle("planilla principal"); // titulo en la parte superior de la ventana
    getContentPane().setBackground(new Color(0,0,0)); // se encarga del color de fondo
    setIconImage(new ImageIcon(getClass().getResource("/images/web.png")).getImage()); //imagen de la ventana superior
        
mb = new JMenuBar(); // Barra de opciones.
mb.setBackground(new Color(255,0,0)); // de barra de opciones.
setJMenuBar(mb); 


menuOpciones = new JMenu("opciones");
menuOpciones.setBackground(new Color(255,0,0));
menuOpciones.setFont(new Font("Andale Mono",1,14));
menuOpciones.setForeground(new Color(255,255,255));
mb.add(menuOpciones);

MenuCalcular = new JMenu("Calcular");
MenuCalcular.setBackground(new Color(255,0,0));
MenuCalcular.setFont(new Font("Andale Mono",1,14));
MenuCalcular.setForeground(new Color(255,255,255));
mb.add(MenuCalcular);

MenuAcercaDe = new JMenu("AcercaDe");
MenuAcercaDe.setBackground(new Color(255,0,0));
MenuAcercaDe.setFont(new Font("Andale Mono",1,14));
MenuAcercaDe.setForeground(new Color(255,255,255));
mb.add(MenuAcercaDe);

MenucolorFondo = new JMenu("color de fondo");
MenucolorFondo.setFont(new Font("Andale Mono",1,14));
MenucolorFondo.setForeground(new Color(0,0,0));
menuOpciones.add(MenucolorFondo);

miCalculo = new JMenuItem("Vacaciones");
miCalculo.setFont(new Font("Andale Mono",1,14));
miCalculo.setForeground(new Color(255,0,0));
miCalculo.add(MenuCalcular);
MenuCalcular.addActionListener(this);

miNegro= new JMenuItem("negro");
miNegro.setFont(new Font("Andale Mono",1,14));
miNegro.setForeground(new Color(255,0,0));
MenucolorFondo.add(miNegro);
MenucolorFondo.addActionListener(this);

miRojo =new JMenuItem("rojo");
miRojo.setFont(new Font("Andale Mono",1,14));
miRojo.setForeground(new Color(255,0,0));
MenucolorFondo.add(miRojo);
MenucolorFondo.addActionListener(this);

miVerde = new JMenuItem("verde");
miVerde.setFont(new Font("Andale Mono",1,14));
miVerde.setForeground(new Color(255,0,0));
MenucolorFondo.add(miVerde);
MenucolorFondo.addActionListener(this);

miNuevo = new JMenuItem("nuevo");
miNuevo.setFont(new Font("andale mono",1,14));
miNuevo.setForeground(new Color(255,0,0));
menuOpciones.add(miNuevo);
miNuevo.addActionListener(this);

miElCreador = new JMenuItem("nuevo");
miElCreador.setFont(new  Font("andale mono",1,14));
miElCreador.setForeground(new Color(255,0,0));
MenuAcercaDe.add(miElCreador);
miElCreador.addActionListener(this);

miSalir = new JMenuItem("nuevo");
miSalir.setFont(new Font("andale mono",1,14));
miSalir.setForeground(new Color(255,0,0));
MenuAcercaDe.add(miSalir);
miSalir.addActionListener(this);


labelBienvenido = new JLabel("Bienvenido");
labelBienvenido.setBounds(280,30,300,50);
labelBienvenido.setFont(new Font("Andale Mono",1,32));
labelBienvenido.setForeground(new Color(255,255,255));
add(labelBienvenido);

labelTitle = new JLabel ("Datos del Trabajador para el calculo de vacaciones");
labelTitle.setBounds(45,140,900,25);
labelTitle.setFont(new Font("Andale Mono",1,12));
labelTitle.setForeground(new Color(255,255,255));
add(labelTitle);

labelNombre = new JLabel("nombre completo");
labelNombre.setBounds(25,188,180,25);
labelNombre.setFont(new Font("Andale Mono",1,12));
labelNombre.setForeground (new Color(255,255,255));
add(labelNombre);


texNombreTrabajador = new JTextField();
texNombreTrabajador.setBounds(25,213,150,25);
texNombreTrabajador.setBackground(new java.awt.Color(255,255,255));
texNombreTrabajador.setFont (new java.awt.Font("Andale Mono",1,12));
add(texNombreTrabajador);

labelAPaterno = new JLabel("apellido paterno");
labelAPaterno.setBounds(25,237,180,25);
labelAPaterno.setFont(new Font("Andale Mono",1,12));
labelAPaterno.setForeground(new java.awt.Color(255,255,255));
add(labelAPaterno);

texApaterno = new JTextField();
texApaterno.setBounds(25,260,150,25);
texApaterno.setBackground(new java.awt.Color(255,0,0));
texApaterno.setFont (new java.awt.Font("Andale Mono",1,12));
add(texApaterno);

labelAMaterno = new JLabel("apellido materno");
labelAMaterno.setBounds(25,273,150,25);
labelAMaterno.setFont(new Font("Andale Mono",1,12));
labelAMaterno.setForeground(new Color(255,255,255));
add(labelAMaterno);

texAmaterno = new JTextField();
texAmaterno.setBounds(25,334,150,25);
texAmaterno.setBackground(new java.awt.Color(255,0,0));
texAmaterno.setFont (new java.awt.Font("Andale Mono",1,12));
texAmaterno.setForeground(new Color(255,255,255));
add(texAmaterno);

labelDepartamento = new JLabel("Selecciona tu departmento");
labelDepartamento.setBounds(220,213,220,25);
labelDepartamento.setBackground(new java.awt.Color(224,224,224));
labelDepartamento.setFont(new java.awt.Font("Andale Mono",1,12));
labelDepartamento.setForeground(new java.awt.Color(255,0,0));
add(labelDepartamento);

comboDepartamento = new JComboBox<>();
comboDepartamento.setBounds(220,240,220,25);
comboDepartamento.setBackground(new java.awt.Color(224,224,224));
comboDepartamento.setFont(new java.awt.Font("Andale Mono",1,12));
comboDepartamento.setForeground(new java.awt.Color(255,0,0));
add(comboDepartamento);


comboDepartamento.addItem("");
comboDepartamento.addItem("atencion al cliente");
comboDepartamento.addItem("Departamento de logistica");
comboDepartamento.addItem("Departamento de gerencia");

labelAntiguedad = new JLabel("Seleccione antiguedad");
labelAntiguedad.setBounds(220,260,180,25);
labelAntiguedad.setBackground(new java.awt.Color(224,224,224));
labelAntiguedad.setFont(new java.awt.Font("Andale Mono",1,12));
labelAntiguedad.setForeground(new java.awt.Color(255,0,0));
add(labelAntiguedad);

comboAntiguedad = new JComboBox<>();
comboAntiguedad.setBounds(220,300,220,25);
comboAntiguedad.setBackground(new java.awt.Color(224,224,224));
comboAntiguedad.setFont(new java.awt.Font("Andale Mono",1,12));
comboAntiguedad.setForeground(new java.awt.Color(255,0,0));
add(comboAntiguedad);

comboAntiguedad.addItem("");
comboAntiguedad.addItem("UN ANO");
comboAntiguedad.addItem("DOS ANOS");
comboAntiguedad.addItem("TRES ANOS O MAS");


labelResultado = new JLabel("resultado del calculo");
labelResultado.setBounds(220,307,180,25);
labelResultado.setFont(new Font("andale mono",1,12));
labelResultado.setForeground(new Color(255,255,255));
add(labelResultado);

textArea1 = new JTextArea();
textArea1.setEditable(false);
textArea1.setBackground(new Color(224,224,224));
textArea1.setFont(new Font("andale mono",1,11));
textArea1.setForeground(new Color(255,0,0));
textArea1.setText("\n aqui aparece el resultado del calculo");

scrollPane1 = new JScrollPane(textArea1);
scrollPane1.setBounds(220,450,385,90);
add(scrollPane1);

labelfooter = new JLabel("@2024 web de sabores mexico Sena"); // todos los derecho reservados
labelfooter.setBounds(135,600,500,30);
labelfooter.setFont(new java.awt.Font("Andale Mono",1,12));
labelfooter.setForeground(new java.awt.Color(255,225,225));
add(labelfooter);

}

public void actionPerformed(ActionEvent jhon){
	if(jhon.getSource()== miCalculo){
		
	}
if(jhon.getSource()== miRojo){
}
if(jhon.getSource()== miVerde){
}
if(jhon.getSource()== miNuevo){
}
if(jhon.getSource()== miSalir){
}

}

public static void main(String arg[]){
	principal ventanaPrincipal = new principal();
	 ventanaPrincipal.setBounds(135,445,1200,700);
	 ventanaPrincipal.setVisible(true);
	 ventanaPrincipal.setResizable(false);
	 ventanaPrincipal.setLocationRelativeTo(null);
}

}

