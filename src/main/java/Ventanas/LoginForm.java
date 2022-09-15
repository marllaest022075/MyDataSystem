package Ventanas;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
// import java.sql.SQLDataException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import Clases.LogArgs;
import Clases.LoginFun;
import Clases.Validations;

public class LoginForm extends JFrame {

    public static String User = "";
    private String _pass = "";
    private int _width = 400;
    private int _height = 550;
    private JTextField txt_User;
    private JPasswordField txt_Pass;

    public LoginForm() {
        super();
        ImageIcon img = new ImageIcon("src/main/java/Images/icon.png");
        setIconImage(img.getImage());
        setTitle("Login");
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
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
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

        txt_User = new JTextField();
        txt_User.setLocation(50, 200);
        txt_User.setFont(fuente);
        txt_User.setSize(300, 25);
        txt_User.setBackground(color);
        txt_User.setBorder(null);
        txt_User.setForeground(Color.WHITE);
        txt_User.getDocument().addDocumentListener(Validations.DocListener(txt_User));

        // TextFiel de Passwors

        txt_Pass = new JPasswordField();
        txt_Pass.setLocation(50, 250);
        txt_Pass.setFont(fuente);
        txt_Pass.setSize(300, 25);
        txt_Pass.setBackground(color);
        txt_Pass.setBorder(null);
        txt_Pass.setForeground(Color.WHITE);
        txt_Pass.getDocument().addDocumentListener(Validations.DocListener(txt_Pass));

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
                AccederEvent(txt_User, txt_Pass);
            }

        });

        // Gregado de elementos
        add(lbl_Logo);
        add(txt_User);
        add(txt_Pass);
        add(Btn_Acceso);

    }

    private void AccederEvent(JTextField txt_User, JPasswordField txt_Pass) {
        User = txt_User.getText().trim();
        _pass = new String(txt_Pass.getPassword());
        if (!CheckForEmpties()) {
            JOptionPane.showMessageDialog(null, "Debes llenar todos los campos");
            return;
        }
        LogArgs args = LoginFun.LogInEvent(User, _pass);
        if (args == null) {
            JOptionPane.showMessageDialog(null, "Usuario y/o password Incorrecto/s");
            txt_User.setText("");
            txt_Pass.setText("");
            txt_User.requestFocusInWindow();
            User = "";
            _pass = "";
            return;
        }

        if (!args.get_estatus().equalsIgnoreCase("Activo"))
            return;
        switch (args.get_tipo_nivel()) {
            case "Administrador":
                new AdministradorForm();
                break;
            case "Capturista":
                new CapturistaForm();
                break;
            case "Tecnico":
                new TecnicoForm();
                break;
        }
        dispose();
    }

    private boolean CheckForEmpties() {
        boolean pa = Validations.CheckForEmpty(txt_Pass);
        boolean us = Validations.CheckForEmpty(txt_User);
        return us && pa;
    }

}
