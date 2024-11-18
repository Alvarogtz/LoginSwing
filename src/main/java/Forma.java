import com.formdev.flatlaf.FlatDarculaLaf;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Forma extends JFrame{
    private JPanel panePrincipal;
    private JLabel replicadorLabel;
    private JTextField campoTexto;

    public Forma(){
        inicializarForma();
        campoTexto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                replicarTexto();
            }
        });
    }

    private void replicarTexto() {
        this.replicadorLabel.setText(this.campoTexto.getText());
    }

    private void inicializarForma() {
        setContentPane(panePrincipal);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,400);
        setLocationRelativeTo(null); // Centramos la ventana
    }

    public static void main(String[] args) {
        FlatDarculaLaf.setup();
        Forma forma = new Forma();
        forma.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
