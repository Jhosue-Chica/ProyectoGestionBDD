
import javax.swing.SwingUtilities;

public class App {

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        // Crear una instancia de la interfaz de empleado
        SwingUtilities.invokeLater(InterfazEmpleado::new);
    }
}
