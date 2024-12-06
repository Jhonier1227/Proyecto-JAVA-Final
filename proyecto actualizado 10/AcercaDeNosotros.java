import javax.swing.*;
import java.awt.*;

public class AcercaDeNosotros extends JFrame {

    public AcercaDeNosotros() {
        // Configuración de la ventana
        setTitle("Acerca de Nosotros");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null); // Diseño absoluto
        setLocationRelativeTo(null); // Centrar la ventana

        // Etiqueta para el título
        JLabel lblTitulo = new JLabel("Acerca de Nosotros");
        lblTitulo.setBounds(100, 10, 200, 30);
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 16));
        lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        add(lblTitulo);

        // Área de texto para la descripción
        JTextArea txtDescripcion = new JTextArea();
        txtDescripcion.setBounds(50, 50, 300, 180);
        txtDescripcion.setText("""
                Somos una empresa dedicada a brindar los mejores servicios
                y productos para nuestros clientes. Nuestro objetivo es
                garantizar la satisfacción y calidad en cada experiencia.
                """);
        txtDescripcion.setLineWrap(true);
        txtDescripcion.setWrapStyleWord(true);
        txtDescripcion.setEditable(false);
        txtDescripcion.setFont(new Font("Arial", Font.PLAIN, 14));
        txtDescripcion.setBackground(getBackground());
        add(txtDescripcion);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            AcercaDeNosotros acercaDeNosotros = new AcercaDeNosotros();
            acercaDeNosotros.setVisible(true);
        });
    }
}
