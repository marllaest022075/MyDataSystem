package Ventanas;

import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import Clases.AdminFun;

public class AdministradorForm extends JFrame {
    private int _width = 520;
    private int _height = 420;
    private String _user = "";
    private String _userName = "";
    public static int Sesion_Usuario;

    public AdministradorForm() {
        super();
        _user = LoginForm.User;
        _userName = AdminFun.GetUserName(_user);
        ImageIcon img = new ImageIcon("src/main/java/Images/icon.png");
        setIconImage(img.getImage());
        setTitle("Administacion : Secion de " + _user);
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
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Inicializar();
        setVisible(true);
    }

    private void Inicializar() {
        // Etiqueta de Nombre
        JLabel lbl_UserName = new JLabel();
        lbl_UserName.setLocation(20, 10);
        lbl_UserName.setSize(480, 30);
        lbl_UserName.setForeground(Color.white);
        lbl_UserName.setFont(new Font("Arial", 1, 25));
        lbl_UserName.setText(_userName);

        // Etiqueta de Boton Registrar
        JLabel lbl_Registrar = new JLabel();
        lbl_Registrar.setLocation(20, 170);
        lbl_Registrar.setSize(140, 20);
        lbl_Registrar.setForeground(Color.white);
        lbl_Registrar.setHorizontalAlignment(SwingConstants.CENTER);
        lbl_Registrar.setFont(new Font("Arial", 1, 15));
        lbl_Registrar.setText("Registrar Usuario");

        // Etiqueta de Manage
        JLabel lbl_Manage = new JLabel();
        lbl_Manage.setLocation(180, 170);
        lbl_Manage.setSize(140, 20);
        lbl_Manage.setForeground(Color.white);
        lbl_Manage.setHorizontalAlignment(SwingConstants.CENTER);
        lbl_Manage.setFont(new Font("Arial", 1, 15));
        lbl_Manage.setText("Aministrar Usuarios");

        // Etiqueta de Creativity
        JLabel lbl_Creativity = new JLabel();
        lbl_Creativity.setLocation(340, 170);
        lbl_Creativity.setSize(140, 20);
        lbl_Creativity.setForeground(Color.white);
        lbl_Creativity.setHorizontalAlignment(SwingConstants.CENTER);
        lbl_Creativity.setFont(new Font("Arial", 1, 15));
        lbl_Creativity.setText("Creatividad");

        // Etiqueta de Capturista
        JLabel lbl_Capturista = new JLabel();
        lbl_Capturista.setLocation(20, 330);
        lbl_Capturista.setSize(140, 20);
        lbl_Capturista.setForeground(Color.white);
        lbl_Capturista.setHorizontalAlignment(SwingConstants.CENTER);
        lbl_Capturista.setFont(new Font("Arial", 1, 15));
        lbl_Capturista.setText("Capturista");

        // Etiqueta de Tecnico
        JLabel lbl_Tecnico = new JLabel();
        lbl_Tecnico.setLocation(180, 330);
        lbl_Tecnico.setSize(140, 20);
        lbl_Tecnico.setForeground(Color.white);
        lbl_Tecnico.setHorizontalAlignment(SwingConstants.CENTER);
        lbl_Tecnico.setFont(new Font("Arial", 1, 15));
        lbl_Tecnico.setText("Tecnico");

        // Etiqueta de lbl_About
        JLabel lbl_About = new JLabel();
        lbl_About.setLocation(340, 330);
        lbl_About.setSize(140, 20);
        lbl_About.setForeground(Color.white);
        lbl_About.setHorizontalAlignment(SwingConstants.CENTER);
        lbl_About.setFont(new Font("Arial", 1, 15));
        lbl_About.setText("Acerca de");

        // Boton para ingresar Usuarios
        JButton btn_RegisterUser = new JButton("", new ImageIcon("src/main/java/Images/addUser.png"));
        btn_RegisterUser.setLocation(20, 50);
        btn_RegisterUser.setSize(140, 120);
        btn_RegisterUser.setToolTipText("Registrar Usuario");

        // Boton para ingresar Usuarios
        JButton btn_ManageUser = new JButton("", new ImageIcon("src/main/java/Images/informationuser.png"));
        btn_ManageUser.setLocation(180, 50);
        btn_ManageUser.setSize(140, 120);

        // Boton para ingresar Usuarios
        JButton btn_Creativity = new JButton("", new ImageIcon("src/main/java/Images/creatividad.png"));
        btn_Creativity.setLocation(340, 50);
        btn_Creativity.setSize(140, 120);

        // Boton para ingresar Usuarios
        JButton btn_Capturista = new JButton("", new ImageIcon("src/main/java/Images/capturista.png"));
        btn_Capturista.setLocation(20, 210);
        btn_Capturista.setSize(140, 120);

        // Boton para ingresar Usuarios
        JButton btn_Tecnico = new JButton("", new ImageIcon("src/main/java/Images/tecnico.png"));
        btn_Tecnico.setLocation(180, 210);
        btn_Tecnico.setSize(140, 120);

        // Boton para ingresar Usuarios
        JButton btn_About = new JButton("", new ImageIcon("src/main/java/Images/geekipedia.png"));
        btn_About.setLocation(340, 210);
        btn_About.setSize(140, 120);
        // Agregar al container

        add(lbl_UserName);
        add(lbl_Registrar);
        add(lbl_Manage);
        add(lbl_Creativity);
        add(lbl_Capturista);
        add(lbl_Tecnico);
        add(lbl_About);
        add(btn_RegisterUser);
        add(btn_ManageUser);
        add(btn_Creativity);
        add(btn_Capturista);
        add(btn_Tecnico);
        add(btn_About);

    }
}
