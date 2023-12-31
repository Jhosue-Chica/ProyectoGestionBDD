import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuInterfazGUI {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Menú e Interfaz");
            frame.setSize(800, 600);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            centerFrameOnScreen(frame);

            // Crear un panel para los botones
            JPanel buttonPanel = createButtonPanel();

            // Establecer una imagen de fondo
            ImageIcon backgroundImage = new ImageIcon("ruta/imagen.jpg");
            JLabel backgroundLabel = new JLabel(backgroundImage);
            backgroundLabel.setLayout(new BorderLayout());
            backgroundLabel.add(buttonPanel, BorderLayout.CENTER);

            frame.setContentPane(backgroundLabel);

            // Hacer visible el marco
            frame.setVisible(true);
        });
    }

    // Método para centrar la ventana en la pantalla
    private static void centerFrameOnScreen(JFrame frame) {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screenSize.width - frame.getWidth()) / 2;
        int y = (screenSize.height - frame.getHeight()) / 2;
        frame.setLocation(x, y);
    }

    // Método para crear y configurar el panel de botones
    private static JPanel createButtonPanel() {
        JPanel buttonPanel = new JPanel();
        buttonPanel.setOpaque(false);
        buttonPanel.setLayout(new GridBagLayout());

        // Configurar fuente y tamaño para los botones
        Font buttonFont = new Font("Arial", Font.BOLD, 16);

        // Crear y configurar los botones
        JButton button1 = createButton("Gestionar Trabajadores", buttonFont);
        JButton button2 = createButton("Gestionar GADs", buttonFont);
        JButton salirButton = createButton("Salir", buttonFont);

        // Crear un panel para el título
        JPanel titlePanel = new JPanel();
        titlePanel.setOpaque(false);
        titlePanel.setLayout(new GridBagLayout());
        JLabel titleLabel = new JLabel("Menu Principal");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        titlePanel.add(titleLabel);

        // Agregar el panel del título al panel de botones
        GridBagConstraints titleConstraints = new GridBagConstraints();
        titleConstraints.gridx = 0;
        titleConstraints.gridy = 0;
        buttonPanel.add(titlePanel, titleConstraints);

        // Agregar los botones al panel con restricciones y mayores márgenes
        GridBagConstraints buttonConstraints = new GridBagConstraints();
        buttonConstraints.gridx = 0;
        buttonConstraints.gridy = 1;
        buttonConstraints.anchor = GridBagConstraints.CENTER;
        buttonConstraints.insets = new Insets(10, 10, 10, 10); // Ajusta estos valores según tu preferencia

        buttonPanel.add(button1, buttonConstraints);

        buttonConstraints.gridy = 2;
        buttonPanel.add(button2, buttonConstraints);

        buttonConstraints.gridy = 3;
        buttonPanel.add(salirButton, buttonConstraints);

        return buttonPanel;
    }

    // Método para crear y configurar un botón
    private static JButton createButton(String text, Font font) {
        JButton button = new JButton(text);
        button.setPreferredSize(new Dimension(200, 40));
        button.setFont(font);

        // Establecer color de fondo y borde para los botones
        Color buttonColor = new Color(255, 255, 255, 200);
        button.setBackground(buttonColor);
        button.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));

        return button;
    }
}
