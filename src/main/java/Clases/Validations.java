package Clases;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class Validations {

    public static boolean CheckForEmpty(JTextField txtField) {
        boolean res = !txtField.getText().trim().isBlank();
        // txtField.setBackground(res ? new Color(153, 153, 255) : Color.RED);
        txtField.setBorder(res ? BorderFactory.createLineBorder(
                new Color(153, 153, 255)) : BorderFactory.createLineBorder(Color.red));
        if (!res)
            txtField.requestFocusInWindow();
        return res;
    }

    public static boolean CheckForEmpty(JPasswordField txtField) {
        boolean res = txtField.getPassword().length > 0;
        // txtField.setBackground(res ? new Color(153, 153, 255) : Color.RED);
        txtField.setBorder(res ? BorderFactory.createLineBorder(
                new Color(153, 153, 255)) : BorderFactory.createLineBorder(Color.red));
        if (!res)
            txtField.requestFocusInWindow();
        return res;
    }

    public static boolean CheckForEmpty(JComboBox<String> combo, String empty) {
        boolean res = !combo.getSelectedItem().toString().equals(empty);
        combo.setBorder(res ? BorderFactory.createLineBorder(
                new Color(153, 153, 255)) : BorderFactory.createLineBorder(Color.red));
        return res;
    }

    public static DocumentListener DocListener(JTextField txt) {
        return new DocumentListener() {
            @Override
            public void changedUpdate(DocumentEvent e) {
                warn(txt);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                warn(txt);
            }

            @Override
            public void insertUpdate(DocumentEvent e) {
                warn(txt);
            }
        };
    }

    public static void warn(JTextField txt) {
        txt.setBorder(BorderFactory.createLineBorder(txt.getText().isEmpty() ? Color.RED : new Color(153, 153, 255)));
    }

    public static ActionListener ItemChangedEvent(JComboBox<String> cbx) {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DoSomething(cbx);
            }
        };
    }

    public static void DoSomething(JComboBox<String> cbx) {
        boolean res = !cbx.getSelectedItem().toString().equals("-Seleccionar-");
        cbx.setBorder(res ? BorderFactory.createLineBorder(
                new Color(153, 153, 255)) : BorderFactory.createLineBorder(Color.red));
    }

}
