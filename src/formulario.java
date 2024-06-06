import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class formulario {
    public static void main(String[] args) {
        // Crear el marco
        JFrame frame = new JFrame("Formulario de Registro");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new GridLayout(5, 2, 10, 10));

        // Crear los componentes
        JLabel nameLabel = new JLabel("Nombre:");
        JTextField nameField = new JTextField();
        
        JLabel emailLabel = new JLabel("Correo Electrónico:");
        JTextField emailField = new JTextField();
        
        JLabel passwordLabel = new JLabel("Contraseña:");
        JPasswordField passwordField = new JPasswordField();
        
        JButton submitButton = new JButton("Registrarse");
        JLabel errorMessage = new JLabel("", JLabel.CENTER);
        errorMessage.setForeground(Color.RED);

        // Agregar los componentes al marco
        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(emailLabel);
        frame.add(emailField);
        frame.add(passwordLabel);
        frame.add(passwordField);
        frame.add(new JLabel("")); // Espacio vacío
        frame.add(submitButton);
        frame.add(errorMessage);

        // Agregar acción al botón
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String email = emailField.getText();
                String password = new String(passwordField.getPassword());

                if (name.isEmpty() || email.isEmpty() || password.isEmpty()) {
                    errorMessage.setText("Todos los campos son obligatorios.");
                } else {
                    errorMessage.setText("");
                    JOptionPane.showMessageDialog(frame, "Registro exitoso");
                }
            }
        });
        
        System.out.println("Este es un mensaje nuevo");

        // Mostrar el marco
        frame.setVisible(true);
    }
}


