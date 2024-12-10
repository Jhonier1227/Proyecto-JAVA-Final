/*
  @(#)PrincipalOficial.java
  author Jhonier Stiven Montano Castillo
   grupo TPS2 - 123 Sena - C.E.A.I
   version 1.00 2024/11/19
 */

import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.*;

public class PrincipalOficial extends JFrame implements ActionListener{
	
// VARIABLES O OBJETOS DEL ENTORNO QUE SE ESTAN UTILIZANDO

 private  JMenuBar Webmb; // Espacio del menu.
 private JMenuItem menuOpciones,MenuReservacion,menuPrincipal,ItemAcercaDeNosotros;
private JLabel labelBienvenido, // binevenida de la ventana
Nomlabel1,Nomlabel2,Nomlabel3,Nomlabel4,Nomlabel5,Nomlabel6,// nombre de los platos 
Prelabel1,Prelabel2,Prelabel3,Prelabel4,Prelabel5,Prelabel6,// precio de los platos
ImagLogo,ImaPlato1,ImaPlato2,ImaPlato3,ImaPlato4,ImaPlato5,ImaPlato6,labelPrueba; // imagen de los platos
private JButton Plaboton1,Plaboton2,Plaboton3,Plaboton4,Plaboton5,Plaboton6,Plabotonbus; // boton de compra del plato
private  JTextField textfield1; // Campo de texto de busqueda
private JComboBox <String> CanPlat1,CanPlat2, CanPlat3,CanPlat4,CanPlat5,CanPlat6;// desplegables de cada plato







    public PrincipalOficial() {
        	
      String url = "jdbc:mysql://localhost:3306/websabores";
        String usuario = "root";
        String contraseña = "";
        Connection conexion = null;



        try {
            conexion = DriverManager.getConnection(url,usuario,contraseña);
            System.out.println("conexion exitosa");
        } catch (SQLException e) {
            System.err.println("error al conectar : " + e.getMessage());

        } 

    	 setLayout (null);
    setTitle("Reservacion"); // titulo en la parte superior de la ventana
    getContentPane().setBackground(new Color(217, 255, 255)); // se encarga del color de fondo
    setIconImage(new ImageIcon(getClass().getResource("/images/web.png")).getImage()); //imagen de la ventana superior
        
    
    Webmb = new JMenuBar(); // Barra de opciones.
    Webmb.setLayout(new BoxLayout(Webmb,BoxLayout.X_AXIS));
    //(Glue): createHorizontalGlue() crea un objeto de tipo Glue, que es un componente invisible que ocupa espacio horizontal. 
    Webmb.add(Box.createHorizontalGlue());
    Webmb.setBackground(new Color(0,87,34)); // color de barra de opciones.
    setJMenuBar(Webmb); 
    
     // Primer Menu
      menuPrincipal = new JMenuItem("Principal");
   	menuPrincipal.setBackground(new Color(0,87,34));
	menuPrincipal.setFont(new Font("Andale Mono",1,20));
	menuPrincipal.setForeground(new Color(255,255,255));
	menuPrincipal.setBounds(300,290,599,220);
	Webmb.add(menuPrincipal);
	
	
	// segundo Menu
	 MenuReservacion = new JMenuItem("Reservacion");
   	MenuReservacion.setBackground(new Color(0,87,34));
	MenuReservacion.setFont(new Font("Andale Mono",1,20));
	MenuReservacion.setForeground(new Color(255,255,255));
	Webmb.add(MenuReservacion);
	
	// tercer Menu
	  menuOpciones = new JMenuItem("menu opciones");
   	menuOpciones.setBackground(new Color(0,87,34));
	menuOpciones.setFont(new Font("Andale Mono",1,20));
	menuOpciones.setForeground(new Color(255,255,255));
	Webmb.add(menuOpciones);

    ItemAcercaDeNosotros =new JMenuItem("Acerca De Nosotros");
    ItemAcercaDeNosotros.setFont(new Font("Andale Mono",1,20));
    ItemAcercaDeNosotros.setBackground(new Color(0,87,34));
    ItemAcercaDeNosotros.setForeground(new Color(255,255,255));

    menuOpciones.add(ItemAcercaDeNosotros);

    ItemAcercaDeNosotros.addActionListener(new ActionListener()
    {
     public void actionPerformed(ActionEvent e){
        AcercaDeNosotros acercaDeNosotros = new AcercaDeNosotros();
        acercaDeNosotros.setVisible(true);
        
          
     }
    });
	
	Webmb.add(Box.createHorizontalGlue());
	
	
	
     // Bienvenida de la aplicacion web.
       labelBienvenido = new JLabel(" Bienvenido" );// Lo que muestra el label.
    labelBienvenido.setBounds(540,25,250,50); // ubicacion y tamano del label.
    labelBienvenido.setFont(new Font("andale mono",1,30)); // tamano y tipo de letra. 
    labelBienvenido.setForeground(new Color(0,0,0));//color del Texto.
    add(labelBienvenido);
   
   
     labelPrueba = new JLabel("" );// Lo que muestra el label.
     labelPrueba.setBounds(100,400,1200,600); // ubicacion y tamano del label.
    labelPrueba.setFont(new Font("andale mono",1,20)); // tamano y tipo de letra. 
    labelPrueba.setForeground(new Color(0,0,0));//color del Texto.
    labelPrueba.setBounds(300,25,250,50);
    Webmb.add(labelPrueba);
 
   
    
    
       // IMAGENES DE CADA PLATO
       
        ImageIcon ImgLogopri = new ImageIcon("images/logo.png");
       ImagLogo = new JLabel(ImgLogopri);
       ImagLogo.setBounds(-40,-60,300,200);
       add(ImagLogo);
   
    
    
      // imagen del plato 1
      ImageIcon ImgPlato1label1 = new ImageIcon("images/plato1.png");
       ImaPlato1 = new JLabel(ImgPlato1label1);
       ImaPlato1.setBounds(40,100,220,220);
       add(ImaPlato1);
       
       // imagen del plato 2
         ImageIcon ImgPlato1label2 = new ImageIcon("images/plato2.png");
       ImaPlato2 = new JLabel(ImgPlato1label2);
       ImaPlato2.setBounds(40,290,220,220);
       add(ImaPlato2);
       
        // imagen del plato 3
       ImageIcon ImgPlato1label3 = new ImageIcon("images/plato3.png");
       ImaPlato3 = new JLabel(ImgPlato1label3);
       ImaPlato3.setBounds(40,460,220,220);
       add(ImaPlato3);
       
         // imagen del plato 4
      ImageIcon ImgPlato1label4 = new ImageIcon("images/plato4.png");
       ImaPlato4 = new JLabel(ImgPlato1label4);
       ImaPlato4.setBounds(650,100,220,220);
       add(ImaPlato4);
       
        // imagen del plato 5
         ImageIcon ImgPlato1label5 = new ImageIcon("images/plato5.png");
       ImaPlato5 = new JLabel(ImgPlato1label5);
       ImaPlato5.setBounds(650,290,220,220);
       add(ImaPlato5);
       
        // imagen del plato 6
       ImageIcon ImgPlato1label6 = new ImageIcon("images/plato6.png");
       ImaPlato6 = new JLabel(ImgPlato1label6);
       ImaPlato6.setBounds(650,465,220,220);
       add(ImaPlato6);
       
       // NOMBRE DE CADA PLATO
       
       // Nombre del plato 1 (pozole).
      Nomlabel1 = new JLabel(" Pozole ");
      Nomlabel1.setBounds(300,120,300,30);
      Nomlabel1.setFont(new Font("Andale mono",3,18));
      Nomlabel1.setForeground(new Color(0,0,0));
      add(Nomlabel1);
      
       // Nombre del plato 2 (Enchiladas verdes).
       Nomlabel2 = new JLabel(" Enchiladas verdes ");
      Nomlabel2.setBounds(270,300,300,30);
      Nomlabel2.setFont(new Font("Andale mono",3,18));
      Nomlabel2.setForeground(new Color(0,0,0));
      add(Nomlabel2);
      
       // Nombre del plato 3 (Tacos al pastor).
       Nomlabel3 = new JLabel(" Tacos al pastor ");
      Nomlabel3.setBounds(275,500,300,30);
      Nomlabel3.setFont(new Font("Andale mono",3,18));
      Nomlabel3.setForeground(new Color(0,0,0));
      add(Nomlabel3);
      
       // Nombre del plato 4 (Nachos).
        Nomlabel4 = new JLabel(" Nachos ");
      Nomlabel4.setBounds(920,120,300,30);
      Nomlabel4.setFont(new Font("Andale mono",3,18));
      Nomlabel4.setForeground(new Color(0,0,0));
      add(Nomlabel4);
      
       // Nombre del plato 5 (Enchiladas suizas).
       Nomlabel5 = new JLabel(" Enchiladas suizas ");
      Nomlabel5.setBounds(900,300,300,30);
      Nomlabel5.setFont(new Font("Andale mono",3,18));
      Nomlabel5.setForeground(new Color(0,0,0));
      add(Nomlabel5);
      
       // Nombre del plato 6 (Fajitas).
       Nomlabel6 = new JLabel(" Fajitas ");
      Nomlabel6.setBounds(920,490,300,30);
      Nomlabel6.setFont(new Font("Andale mono",3,18));
      Nomlabel6.setForeground(new Color(0,0,0));
      add(Nomlabel6);
      
   // PRECIO DE LOS PLATOS.
   
      	 // precio del plato 1( pozole).
       Prelabel1 = new JLabel(" 15.000 ");
      Prelabel1.setBounds(300,145,300,30);
      Prelabel1.setFont(new Font("Andale mono",3,18));
      Prelabel1.setForeground(new Color(0,0,0));
      add(Prelabel1);
      
       // precio del plato 2(Enchiladas verdes).
       Prelabel2 = new JLabel(" 30.000 ");
      Prelabel2.setBounds(300,325,300,30);
      Prelabel2.setFont(new Font("Andale mono",3,18));
      Nomlabel2.setForeground(new Color(0,0,0));
      add(Prelabel2);
      
       // precio del plato 3 (Tacos al pastor).
       Prelabel3 = new JLabel(" 20.000 ");
      Prelabel3.setBounds(300,525,300,30);
      Prelabel3.setFont(new Font("Andale mono",3,18));
      Nomlabel3.setForeground(new Color(0,0,0));
      add(Prelabel3);
      
       // precio del plato 4 (Nachos).
        Prelabel4 = new JLabel(" 20.000 ");
      Prelabel4.setBounds(920,145,300,30);
      Prelabel4.setFont(new Font("Andale mono",3,18));
      Prelabel4.setForeground(new Color(0,0,0));
      add(Prelabel4);
      
       // precio del plato 5 (Enchiladas suizas).
       Prelabel5 = new JLabel(" 13.000 ");
      Prelabel5.setBounds(925,325,300,30);
      Prelabel5.setFont(new Font("Andale mono",3,18));
      Prelabel5.setForeground(new Color(0,0,0));
      add(Prelabel5);
      
       // precio del plato 6 (Fajitas).
       Prelabel6 = new JLabel(" 14.000 ");
      Prelabel6.setBounds(920,520,300,30);
      Prelabel6.setFont(new Font("Andale mono",3,18));
      Prelabel6.setForeground(new Color(0,0,0));
      add(Prelabel6);
      
      /*
       *BOTONES DE COMPRA 
       *DE CADA PLATO
       */
       
      // plato 1
      Plaboton1 = new JButton("Comprar");
   	Plaboton1.setBounds(280,220,130,30);
   	Plaboton1.setForeground(new Color(0,0,0));
	Plaboton1.setFont(new Font("Andale mono",1,14));
	Plaboton1.setForeground(new Color(0,0,0));
	Plaboton1.addActionListener(this);
	add(Plaboton1);
      
      // plato 2
        Plaboton2 = new JButton("Comprar");
   	Plaboton2.setBounds(280,400,130,30);
   	Plaboton2.setForeground(new Color(0,0,0));
	Plaboton2.setFont(new Font("Andale mono",1,14));
	Plaboton2.setForeground(new Color(0,0,0));
	Plaboton2.addActionListener(this);
	add(Plaboton2);
	
	// plato 3
	  Plaboton3 = new JButton("Comprar");
   	Plaboton3.setBounds(280,600,130,30);
   	Plaboton3.setForeground(new Color(0,0,0));
	Plaboton3.setFont(new Font("Andale mono",1,14));
	Plaboton3.setForeground(new Color(0,0,0));
	Plaboton3.addActionListener(this);
	add(Plaboton3);
	
	// plato 4
	 Plaboton4 = new JButton("Comprar");
   	Plaboton4.setBounds(900,220,130,30);
   	Plaboton4.setForeground(new Color(0,0,0));
	Plaboton4.setFont(new Font("Andale mono",1,14));
	Plaboton4.setForeground(new Color(0,0,0));
	Plaboton4.addActionListener(this);
	add(Plaboton4);
	
	// plato 5
	Plaboton5 = new JButton("Comprar");
   	Plaboton5.setBounds(900,400,130,30);
   	Plaboton5.setForeground(new Color(0,0,0));
	Plaboton5.setFont(new Font("Andale mono",1,14));
	Plaboton5.setForeground(new Color(0,0,0));
	Plaboton5.addActionListener(this);
	add(Plaboton5);
	
	// plato 6
	Plaboton6 = new JButton("Comprar");
   	Plaboton6.setBounds(900,600,130,30);
   	Plaboton6.setForeground(new Color(0,0,0));
	Plaboton6.setFont(new Font("Andale mono",1,14));
	Plaboton6.setForeground(new Color(0,0,0));
	Plaboton6.addActionListener(this);
	add(Plaboton6);
	


   // CAMPO DE TEXTO
   // DE BUSQUEDA
        
     textfield1 = new JTextField();
 textfield1.setBounds(1100,60,150,25);
 textfield1.setBackground(new Color(255, 255, 255));
 textfield1.setFont(new Font("nombre",1,14));
 textfield1.setForeground(new Color(0,0,0));
 add(textfield1);
       
       // Boton de Buscar
         Plabotonbus = new JButton("buscar");
    Plabotonbus.setBounds(1110,90,120,30);
    Plabotonbus.setForeground(new Color(0,0,0));
    Plabotonbus.setFont(new Font("Andale mono",1,14));
    Plabotonbus.setForeground(new Color(0,0,0));
    Plabotonbus.addActionListener(this);
    add(Plabotonbus);
    
    CanPlat1 = new JComboBox<>();
CanPlat1.setBounds(280,180,130,25);
CanPlat1.setBackground(new java.awt.Color(224,224,224));
CanPlat1.setFont(new java.awt.Font("Andale Mono",1,12));
CanPlat1.setForeground(new java.awt.Color(0,0,0));
add(CanPlat1);

     CanPlat1.addItem("cantidad");
	CanPlat1.addItem("1");
	CanPlat1.addItem("2");
	CanPlat1.addItem("3");
	CanPlat1.addItem("4");
	
	 CanPlat2 = new JComboBox<>();
CanPlat2.setBounds(280,360,130,25);
CanPlat2.setBackground(new java.awt.Color(224,224,224));
CanPlat2.setFont(new java.awt.Font("Andale Mono",1,12));
CanPlat2.setForeground(new java.awt.Color(0,0,0));
add(CanPlat2);

     CanPlat2.addItem("cantidad");
	CanPlat2.addItem("1");
	CanPlat2.addItem("2");
	CanPlat2.addItem("3");
	CanPlat2.addItem("4");
	
	CanPlat3 = new JComboBox<>();
CanPlat3.setBounds(280,560,130,25);
CanPlat3.setBackground(new java.awt.Color(224,224,224));
CanPlat3.setFont(new java.awt.Font("Andale Mono",1,12));
CanPlat3.setForeground(new java.awt.Color(0,0,0));
add(CanPlat3);

     CanPlat3.addItem("cantidad");
	CanPlat3.addItem("1");
	CanPlat3.addItem("2");
	CanPlat3.addItem("3");
	CanPlat3.addItem("4");
	
		CanPlat4 = new JComboBox<>();
CanPlat4.setBounds(900,180,130,25);
CanPlat4.setBackground(new java.awt.Color(224,224,224));
CanPlat4.setFont(new java.awt.Font("Andale Mono",1,12));
CanPlat4.setForeground(new java.awt.Color(0,0,0));
add(CanPlat4);

     CanPlat4.addItem("cantidad");
	CanPlat4.addItem("1");
	CanPlat4.addItem("2");
	CanPlat4.addItem("3");
	CanPlat4.addItem("4");
	
	
		CanPlat5 = new JComboBox<>();
CanPlat5.setBounds(900,360,130,25);
CanPlat5.setBackground(new java.awt.Color(224,224,224));
CanPlat5.setFont(new java.awt.Font("Andale Mono",1,12));
CanPlat5.setForeground(new java.awt.Color(0,0,0));
add(CanPlat5);

     CanPlat5.addItem("cantidad");
	CanPlat5.addItem("1");
	CanPlat5.addItem("2");
	CanPlat5.addItem("3");
	CanPlat5.addItem("4");
	
		CanPlat6 = new JComboBox<>();
CanPlat6.setBounds(900,560,130,25);
CanPlat6.setBackground(new java.awt.Color(224,224,224));
CanPlat6.setFont(new java.awt.Font("Andale Mono",1,12));
CanPlat6.setForeground(new java.awt.Color(0,0,0));
add(CanPlat6);

     CanPlat6.addItem("cantidad");
	CanPlat6.addItem("1");
	CanPlat6.addItem("2");
	CanPlat6.addItem("3");
	CanPlat6.addItem("4");
       
       
    
    
    	
    }
    
 @Override
public void actionPerformed(ActionEvent e) {
    Object source = e.getSource();


    // Evento para comprar plato 1
    if (source == Plaboton1) {
        procesarCompra("Pozole", CanPlat1.getSelectedItem().toString(), 15000);
    } 
    // Evento para comprar plato 2
    else if (source == Plaboton2) {
        procesarCompra("Enchiladas verdes", CanPlat2.getSelectedItem().toString(), 30000);
    } 
    // Evento para comprar plato 3
    else if (source == Plaboton3) {
        procesarCompra("Tacos al pastor", CanPlat3.getSelectedItem().toString(), 20000);
    } 
    // Evento para comprar plato 4
    else if (source == Plaboton4) {
        procesarCompra("Nachos", CanPlat4.getSelectedItem().toString(), 20000);
    } 
    // Evento para comprar plato 5
    else if (source == Plaboton5) {
        procesarCompra("Enchiladas suizas", CanPlat5.getSelectedItem().toString(), 13000);
    } 
    // Evento para comprar plato 6
    else if (source == Plaboton6) {
        procesarCompra("Fajitas", CanPlat6.getSelectedItem().toString(), 14000);
    }
    
}

// Método para procesar la compra
private void procesarCompra(String nombrePlato, String cantidadStr, int precioUnitario) {
    try {
        int cantidad = Integer.parseInt(cantidadStr);
        int total = cantidad * precioUnitario;

        // Mensaje de confirmación
        JOptionPane.showMessageDialog(
            this,
            "Has comprado " + cantidad + " unidad(es) de " + nombrePlato + 
            ".\nTotal: $" + total,
            "Compra realizada",
            JOptionPane.INFORMATION_MESSAGE
        );

        // Aquí puedes agregar lógica para registrar la compra en la base de datos
        registrarCompra(nombrePlato, cantidad, total);
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(
            this,
            "Por favor selecciona una cantidad válida.",
            "Error",
            JOptionPane.ERROR_MESSAGE
        );
    }
}

// Método para registrar la compra en la base de datos
private void registrarCompra(String nombrePlato, int cantidad, int total) {
    String url = "jdbc:mysql://localhost:3306/websabores";
    String usuario = "root";
    String contraseña = "";

    String consulta = "INSERT INTO ventas (nombre_plato, cantidad, total) VALUES (?, ?, ?)";

    try (Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
         PreparedStatement stmt = conexion.prepareStatement(consulta)) {
        stmt.setString(1, nombrePlato);
        stmt.setInt(2, cantidad);
        stmt.setInt(3, total);

        stmt.executeUpdate();
        System.out.println("Compra registrada con éxito.");
    } catch (SQLException e) {
        System.err.println("Error al registrar la compra: " + e.getMessage());
    }
}

    public static void main(String arg[]){
	 PrincipalOficial Ventana = new PrincipalOficial();
    Ventana.setBounds(135,445,1300,730);
    Ventana.setVisible(true);
    Ventana.setResizable(false);
    Ventana.setLocationRelativeTo(null);
    
    
}

}



// termine de hacer mis cambios
// termine de hacer mis cambios parte 2.