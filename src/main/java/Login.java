import com.formdev.flatlaf.FlatDarculaLaf;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;

public class Login extends JFrame{
    private JPanel panelPrincipal;
    private JLabel labelLogin;
    private JLabel labelUsuario;
    private JTextField textUsuario;
    private JLabel labelPassword;
    private JPasswordField textPassword;
    private JButton buttonEnviar;

    private final String usuario = "Alvaro";
    private final String password = "Zabala";

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

    public Login(){
        inicializarLogin();

        buttonEnviar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                validateLogin();
            }
        });
    }

    private void validateLogin() {
        if(this.textUsuario.getText().equals(usuario))
            if(new String(this.textPassword.getPassword()).equals(password))
                mostrarMensaje("Usuario y password correctos!! Bienvenido");
            else
                mostrarMensaje("Contraseña incorrecta.");
        else
            mostrarMensaje("Usuario incorrecto");
    }

    private void mostrarMensaje(String s) {
        JOptionPane.showMessageDialog(this,s);
    }

    private void inicializarLogin() {
        setContentPane(panelPrincipal);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,400);
        setLocationRelativeTo(null); // Centramos la ventana
    }

    public static void main(String[] args) {
        FlatDarculaLaf.setup();
        Login login = new Login();
        login.setVisible(true);
    }
}
