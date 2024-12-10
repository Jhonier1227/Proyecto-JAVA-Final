import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AcercaDeNosotros  extends JFrame {

  private JLabel label1; 

    public AcercaDeNosotros() {
        // Configuración de la ventana
        setTitle("Acerca de Nosotros");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null); // Diseño absoluto
        setLocationRelativeTo(null); // Centrar la ventana
        getContentPane().setBackground(new Color(220, 255, 255));
        setIconImage(new ImageIcon(getClass().getResource("/images/web.png")).getImage());

        // Etiqueta para el título
        JLabel lblTitulo = new JLabel("Acerca de Nosotros");
        lblTitulo.setBounds(100, 10, 200, 30);
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 16));
        lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        add(lblTitulo);
   
 ImageIcon imagen = new ImageIcon("images/mex.png");
       label1 = new JLabel(imagen);
       label1.setBounds(360,-30,300,350);
       add(label1);

        // Área de texto para la descripción
        JTextArea txtDescripcion = new JTextArea();
        txtDescripcion.setBounds(50, 50, 300, 300);
        txtDescripcion.setText("""
                En Web de Sabores, nuestra mision es ofrecer una experiencia culinaria unica con 
                platos variados que combinan tradicion y creatividad.

                Ahora puedes disfrutar de de nuestra aplicacion Web de sabores de manera digital. 
                te permite explorar nuestro Menu,Personaliza tus pedidos y hacer reserva desde cualquier lugar.

                Descubre una experiencia gastronomica innovadora, al alcance de tu mano,con tan solo un clic, s¡Lleva los sabores que amas contigo donde quiera que vayas!

                """);
        txtDescripcion.setLineWrap(true);
        txtDescripcion.setWrapStyleWord(true);
        txtDescripcion.setEditable(false);
        txtDescripcion.setFont(new Font("Arial", Font.PLAIN, 14));
        txtDescripcion.setBackground(new Color(220, 255, 255));
        add(txtDescripcion);


    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            AcercaDeNosotros acercaDeNosotros = new AcercaDeNosotros();
            acercaDeNosotros.setVisible(true);
            acercaDeNosotros.setResizable(false);
        });
    }
}
