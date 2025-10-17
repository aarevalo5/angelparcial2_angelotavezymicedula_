/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial2_angel_109;

/**
 *
 * @author SALA-4
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author SALA-4
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LoginSencillo extends JFrame {

    private JTextField txtUsuario;
    private JPasswordField txtPassword;
    private JButton btnIniciar, btnCancelar;

    // Constantes para usuario válido
    private static final String USUARIO_CORRECTO = "angel";
    private static final String PASSWORD_CORRECTO = "3312";

    public LoginSencillo() {
        // Configuración de la ventana
        setTitle("Login Sencillo");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);

        // Crear un panel con GridBagLayout
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        // ===== Usuario =====
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.EAST;
        panel.add(new JLabel("Usuario:"), gbc);

        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        txtUsuario = new JTextField(20);
        panel.add(txtUsuario, gbc);

        // ===== Contraseña =====
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.EAST;
        gbc.fill = GridBagConstraints.NONE;
        panel.add(new JLabel("Contraseña:"), gbc);

        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        txtPassword = new JPasswordField(20);
        panel.add(txtPassword, gbc);

        // ===== Botones =====
        JPanel panelBotones = new JPanel();
        btnIniciar = new JButton("Iniciar Sesión");
        btnCancelar = new JButton("Cancelar");
        panelBotones.add(btnIniciar);
        panelBotones.add(btnCancelar);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.fill = GridBagConstraints.NONE;
        gbc.insets = new Insets(20, 5, 5, 5);
        panel.add(panelBotones, gbc);

        // Agregar panel principal a la ventana
        setContentPane(panel);

        // ===== Eventos =====
        // Acción del botón Iniciar
        btnIniciar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                validarUsuario();
            }
        });

        // Acción del botón Cancelar
        btnCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limpiarCampos();
            }
        });

        // Acción al presionar ENTER en el campo de contraseña
        txtPassword.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    validarUsuario();
                }
            }
        });
    }

    // ===== Método para validar usuario =====
    private void validarUsuario() {
        String usuario = txtUsuario.getText();
        String password = new String(txtPassword.getPassword());

        if (usuario.equals(USUARIO_CORRECTO) && password.equals(PASSWORD_CORRECTO)) {
            JOptionPane.showMessageDialog(this,
                    "¡Bienvenido " + usuario + "!",
                    "Inicio de sesión exitoso",
                    JOptionPane.INFORMATION_MESSAGE);
            dispose(); // Cierra ventana de login
            mostrarVentanaPrincipal();
        } else {
            JOptionPane.showMessageDialog(this,
                    "Usuario o contraseña incorrectos",
                    "Error de autenticación",
                    JOptionPane.ERROR_MESSAGE);
            limpiarCampos();
        }
    }

    // ===== Método para limpiar campos =====
    private void limpiarCampos() {
        txtUsuario.setText("");
        txtPassword.setText("");
        txtUsuario.requestFocus();
    }

    // ===== Simulación de ventana principal después del login =====
    private void mostrarVentanaPrincipal() {
    // Crear y mostrar la ventana principal después del login exitoso
    JFrame ventanaPrincipal = new JFrame("Aplicación Principal");
    ventanaPrincipal.setSize(600, 400);
    ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ventanaPrincipal.setLocationRelativeTo(null);

    JLabel label = new JLabel("¡Inicio de sesión exitoso! Bienvenido a la aplicación.", JLabel.CENTER);
    label.setFont(new Font("Arial", Font.BOLD, 16));
    ventanaPrincipal.add(label);

    ventanaPrincipal.setVisible(true);
}

public static void main(String[] args) {
    // Intentar usar el Look and Feel del sistema
    try {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
    } catch (Exception e) {
        e.printStackTrace();
    }

    // Ejecutar la aplicación
    SwingUtilities.invokeLater(new Runnable() {
        public void run() {
            new LoginSencillo().setVisible(true);
        }
    });
    }
}



