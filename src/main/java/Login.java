package main.java;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends  JFrame {
    // Declaration of Swing elements
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JLabel usernameLabel, passwordLabel, forgotPasswordLabel, signInLabel, welcomeLabel, titleLabel;
    private JLabel imageLabel;
    private JButton submitButton, loginWithGoogleButton;
    private JPanel mainPanel;
    private JPanel leftPanel, rightPanel;

    private JCheckBox rememberMeCheckBox;

    public Login() {
        initComponents();
    }


    private void initComponents() {
        ImageIcon ICON = new ImageIcon("src\\main\\resources\\icon.png");
        ImageIcon IMAGE = new ImageIcon("src\\main\\resources\\patient-background3.jpg");

        leftPanel.setBackground(new Color(230,247,255));
        rightPanel.setBackground(new Color(255,255,255));
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        signInLabel.setFont(new Font("Default", Font.PLAIN, 12));
        welcomeLabel.setFont(new Font("Bell MT", Font.PLAIN, 32));
        usernameLabel.setFont(new Font("Default", Font.BOLD, 16));
        passwordLabel.setFont(new Font("Default", Font.BOLD, 16));
        forgotPasswordLabel.setFont(new Font("Default", Font.PLAIN, 12));
        forgotPasswordLabel.setForeground(new Color(255,100,100));
        loginWithGoogleButton.setPreferredSize(new Dimension(10,10));

        setContentPane(mainPanel);
        setTitle("By Mati");
        Toolkit screenTools = Toolkit.getDefaultToolkit();
        Dimension screenSize = screenTools.getScreenSize();
        setBounds(screenSize.width / 4, screenSize.height / 4, // This sets posx, posy, width, height
                screenSize.width / 2, screenSize.height / 2);
        setIconImage(ICON.getImage());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setBackground(new Color(255,255,255));
        setVisible(true);
    }


    private void buttons() {
        rememberMeCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        loginWithGoogleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void main(String[] args) {
        Login screen = new Login();
    }
}