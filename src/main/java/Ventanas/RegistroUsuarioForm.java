package Ventanas;

import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.RepaintManager;
import javax.swing.SwingConstants;

public class RegistroUsuarioForm extends JFrame {
    private int _width = 520;
    private int _height = 420;
    private String _user = "";

    public RegistroUsuarioForm() {
        super();
        ImageIcon img = new ImageIcon("src/main/java/Images/icon.png");
        setIconImage(img.getImage());
        _user = LoginForm.User;
        setTitle("Registrar un nuevo usuario - Secion de " + _user);
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
        // Etiqueta de Nombre
        JLabel lbl_UserName = new JLabel();
        lbl_UserName.setLocation(20, 10);
        lbl_UserName.setSize(480, 30);
        lbl_UserName.setForeground(Color.white);
        lbl_UserName.setFont(new Font("Arial", 1, 25));
        lbl_UserName.setHorizontalAlignment(SwingConstants.CENTER);
        lbl_UserName.setText("Registro de Usuario");

        // Etiqueta de JTextField Nombre
        JLabel lbl_Nombre = new JLabel();
        lbl_Nombre.setLocation(20, 70);
        lbl_Nombre.setSize(140, 20);
        lbl_Nombre.setForeground(Color.white);
        lbl_Nombre.setHorizontalAlignment(SwingConstants.LEFT);
        lbl_Nombre.setFont(new Font("Arial", 1, 15));
        lbl_Nombre.setText("Nombre completo");

        // Etiqueta de JTextField E_Mail
        JLabel lbl_E_Mail = new JLabel();
        lbl_E_Mail.setLocation(20, 130);
        lbl_E_Mail.setSize(140, 20);
        lbl_E_Mail.setForeground(Color.white);
        lbl_E_Mail.setHorizontalAlignment(SwingConstants.LEFT);
        lbl_E_Mail.setFont(new Font("Arial", 1, 15));
        lbl_E_Mail.setText("E-Mail");

        // Etiqueta de JTextField Telefono
        JLabel lbl_Telefono = new JLabel();
        lbl_Telefono.setLocation(20, 190);
        lbl_Telefono.setSize(140, 20);
        lbl_Telefono.setForeground(Color.white);
        lbl_Telefono.setHorizontalAlignment(SwingConstants.LEFT);
        lbl_Telefono.setFont(new Font("Arial", 1, 15));
        lbl_Telefono.setText("Telefono");

        // Etiqueta de JTextField Permiso
        JLabel lbl_Permiso = new JLabel();
        lbl_Permiso.setLocation(20, 250);
        lbl_Permiso.setSize(140, 20);
        lbl_Permiso.setForeground(Color.white);
        lbl_Permiso.setHorizontalAlignment(SwingConstants.LEFT);
        lbl_Permiso.setFont(new Font("Arial", 1, 15));
        lbl_Permiso.setText("Permiso de :");

        // Etiqueta de JTextField Usuario
        JLabel lbl_Usuario = new JLabel();
        lbl_Usuario.setLocation(260, 70);
        lbl_Usuario.setSize(140, 20);
        lbl_Usuario.setForeground(Color.white);
        lbl_Usuario.setHorizontalAlignment(SwingConstants.LEFT);
        lbl_Usuario.setFont(new Font("Arial", 1, 15));
        lbl_Usuario.setText("Usuario");

        // Etiqueta de JTextField Password
        JLabel lbl_Password = new JLabel();
        lbl_Password.setLocation(260, 130);
        lbl_Password.setSize(140, 20);
        lbl_Password.setForeground(Color.white);
        lbl_Password.setHorizontalAlignment(SwingConstants.LEFT);
        lbl_Password.setFont(new Font("Arial", 1, 15));
        lbl_Password.setText("Password Usuario");

        // Etiqueta de JTextField Agregar
        JLabel lbl_Agregar = new JLabel();
        lbl_Agregar.setLocation(260, 300);
        lbl_Agregar.setSize(220, 20);
        lbl_Agregar.setForeground(Color.white);
        lbl_Agregar.setHorizontalAlignment(SwingConstants.RIGHT);
        lbl_Agregar.setFont(new Font("Arial", 1, 15));
        lbl_Agregar.setText("Agregar Usuario");

        // JtextField FullName
        JTextField txt_FullName = new JTextField();
        txt_FullName.setSize(220, 25);
        txt_FullName.setLocation(20, 90);
        txt_FullName.setForeground(Color.white);
        txt_FullName.setBackground(new Color(153, 153, 255));
        txt_FullName.setFont(new Font("Arial", 1, 14));
        txt_FullName.setText("Cielo Luz Elena Llamas Servin");

        // JtextField E_Mail
        JTextField txt_E_Mail = new JTextField();
        txt_E_Mail.setSize(220, 25);
        txt_E_Mail.setLocation(20, 150);
        txt_E_Mail.setForeground(Color.white);
        txt_E_Mail.setBackground(new Color(153, 153, 255));
        txt_E_Mail.setFont(new Font("Arial", 1, 14));
        txt_E_Mail.setText("Cielo@Server.info");

        // JtextField Telefono
        JTextField txt_Telefono = new JTextField();
        txt_Telefono.setSize(220, 25);
        txt_Telefono.setLocation(20, 210);
        txt_Telefono.setForeground(Color.white);
        txt_Telefono.setBackground(new Color(153, 153, 255));
        txt_Telefono.setFont(new Font("Arial", 1, 14));
        txt_Telefono.setText("Cielo Luz Elena Llamas Servin");

        // JtextField Usuario
        JTextField txt_Usuario = new JTextField();
        txt_Usuario.setSize(220, 25);
        txt_Usuario.setLocation(260, 90);
        txt_Usuario.setForeground(Color.white);
        txt_Usuario.setBackground(new Color(153, 153, 255));
        txt_Usuario.setFont(new Font("Arial", 1, 14));
        txt_Usuario.setText("Cielo Luz Elena Llamas Servin");

        // JtextField Password
        JTextField txt_Password = new JTextField();
        txt_Password.setSize(220, 25);
        txt_Password.setLocation(260, 150);
        txt_Password.setForeground(Color.white);
        txt_Password.setBackground(new Color(153, 153, 255));
        txt_Password.setFont(new Font("Arial", 1, 14));
        txt_Password.setText("Cielo Luz Elena Llamas Servin");

        // ComboBox Selccion de Permiso(Administrador, Capturista, Tecnico)
        JComboBox<String> cb_Selector = new JComboBox<String>();
        cb_Selector.setSize(220, 25);
        cb_Selector.setLocation(20, 270);
        // cb_Selector.setForeground(Color.white);
        // cb_Selector.setBackground(new Color(153, 153, 255));
        cb_Selector.setFont(new Font("Arial", 1, 15));
        cb_Selector.addItem("Administrador");
        cb_Selector.addItem("Capturista");
        cb_Selector.addItem("Tecnico");

        // Boton para Guargar en Base de datos

        JButton btn_Agregar = new JButton("", new ImageIcon("src/main/java/Images/addUser.png"));
        btn_Agregar.setLocation(360, 200);
        btn_Agregar.setSize(120, 100);
        btn_Agregar.setToolTipText("Registrar Usuario");
        btn_Agregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                OnRegister();

            }

        });
        // Agregar al contenedor

        add(lbl_UserName);
        add(lbl_Nombre);
        add(lbl_E_Mail);
        add(lbl_Telefono);
        add(lbl_Permiso);
        add(lbl_Usuario);
        add(lbl_Password);
        add(lbl_Agregar);

        add(txt_FullName);
        add(txt_E_Mail);
        add(txt_Telefono);
        add(txt_Usuario);
        add(txt_Password);

        add(cb_Selector);
        add(btn_Agregar);
    }

    private void OnRegister() {

    }
}
