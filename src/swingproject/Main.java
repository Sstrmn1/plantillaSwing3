package swingproject;

import javax.swing.UIManager;

public class Main {

    public static void main(String[] args) {
        // Configurar el aspecto de la interfaz Swing (LookAndFeel)
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        // Crear y configurar el JFrame
        mostrarMainFrame();
    }

    public static MainFrame frame;

    public static void mostrarMainFrame() {
        // Crear una instancia de NewJFrame
        frame = new MainFrame();

        // Centrar la ventana en la pantalla
        frame.setLocationRelativeTo(null);

        // Hacer la ventana visible
        frame.setVisible(true);
    }

}
