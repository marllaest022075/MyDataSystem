package Ventanas;

import java.io.File;
import java.io.IOException;
import java.awt.event.*;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GestionarUsuariosForm extends JFrame {
    private int _width = 520;
    private int _height = 420;
    private String _user = "";
    private JFrame _main;

    public GestionarUsuariosForm(JFrame main) {
        super();
        _main = main;
        ImageIcon img = new ImageIcon("src/main/java/Images/icon.png");
        setIconImage(img.getImage());
        _user = LoginForm.User;
        setTitle("Gestion de usuarios - Secion de " + _user);
        setSize(_width, _height);
        setResizable(false);

        try {
            setContentPane(
                    new JLabel(new ImageIcon(ImageIO.read(new File("src/main/java/Images/wallpaperPrincipal.jpg")))));
        } catch (IOException e) {
            e.printStackTrace();
        }
        setLocationRelativeTo(null);
        setLayout(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent windowEvent) {
                dispose();
                _main.setVisible(true);
            }

            @Override
            public void windowIconified(WindowEvent arg0) {
                setState(JFrame.NORMAL);
            }
        });
        Inicializar();
        setVisible(true);
    }

    private void Inicializar() {
    }
}
