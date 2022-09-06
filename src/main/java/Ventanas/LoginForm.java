package Ventanas;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.xml.crypto.URIDereferencer;

import Clases.LogArgs;
import Clases.LoginFun;

public class LoginForm extends JFrame {

    public String User = "";
    private String _pass = "";
    private int _width = 400;
    private int _height = 550;

    public LoginForm() {
        super();
        ImageIcon img = new ImageIcon("src/main/java/Images/icon.png");
        setIconImage(img.getImage());
        setTitle("Login");
        setSize(_width, _height);
        try {
            setContentPane(
                    new JLabel(new ImageIcon(ImageIO.read(new File("src/main/java/Images/wallpaperPrincipal.jpg")))));
        } catch (IOException e) {
            e.printStackTrace();
        }
        setLocationRelativeTo(null);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Inicializar();
        setVisible(true);
    }

    private void Inicializar() {
        // Fuente
        Font fuente = new Font("Arial", Font.BOLD, 18);
        // Color
        Color color = new Color(153, 153, 255);
        // logo
        JLabel lbl_Logo = new JLabel();
        lbl_Logo.setLocation(120, 20);
        lbl_Logo.setSize(150, 150);
        lbl_Logo.setIcon(new ImageIcon(new ImageIcon("src/main/java/Images/ds.png").getImage()
                .getScaledInstance(lbl_Logo.getWidth(), lbl_Logo.getHeight(), Image.SCALE_DEFAULT)));
        // TextFiel de Usuario

        JTextField txt_User = new JTextField();
        txt_User.setLocation(50, 200);
        txt_User.setFont(fuente);
        txt_User.setSize(300, 25);
        txt_User.setBackground(color);
        txt_User.setBorder(null);
        txt_User.setForeground(Color.WHITE);

        // TextFiel de Passwors

        JPasswordField txt_Pass = new JPasswordField();
        txt_Pass.setLocation(50, 250);
        txt_Pass.setFont(fuente);
        txt_Pass.setSize(300, 25);
        txt_Pass.setBackground(color);
        txt_Pass.setBorder(null);
        txt_Pass.setForeground(Color.WHITE);

        // boton de acceso

        JButton Btn_Acceso = new JButton("Acceso");
        Btn_Acceso.setLocation(50, 300);
        Btn_Acceso.setSize(300, 25);
        Btn_Acceso.setBackground(color);
        Btn_Acceso.setBorder(null);
        Btn_Acceso.setForeground(Color.WHITE);
        Btn_Acceso.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                User = txt_User.getText().trim();
                _pass = txt_Pass.getText().trim();
                if (!LoginFun.Validos(User, _pass)) {
                    JOptionPane.showMessageDialog(null, "Debes llenar todos los campos");
                    return;
                }
                try {
                    LogArgs args = LoginFun.LogInEvent(User, _pass);
                    if (!args.get_estatus().equalsIgnoreCase("Activo"))
                        return;
                    switch (args.get_tipo_nivel()) {

                        default:
                            System.out.println("Exelente");
                            break;
                    }
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            }

        });

        // Gregado de elementos
        add(lbl_Logo);
        add(txt_User);
        add(txt_Pass);
        add(Btn_Acceso);

    }

}
