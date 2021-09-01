package lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowApp extends JFrame {

    public WindowApp() {
        setTitle("My new Window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 400, 400);

        /* Даный метод располагает кнопки по сетке.
        setLayout(new GridLayout(3, 4));
        for (int i = 0; i < 10; i++) {
            JButton button = new JButton("button-" + (i + 1));
            add(button);
        }*/

        /* Даный метод располагает кнопки в одну линию, и когда
        они упираются в стенку они переносятся на следующую строчку.
        setLayout(new FlowLayout());
        for (int i = 0; i < 10; i++) {
            JButton button = new JButton("button-" + (i + 1));
            add(button);
        }*/

        /* Даный методрасполагает кнопки в одну линию.
        setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS));
        for (int i = 0; i < 4; i++){
            JButton button = new JButton("" + (i + 1));
            add(button);
        }*/

        /* Даный методрасполагает кнопки по сторонам света.
        JButton button1 = new JButton("Button-1");
        JButton button2 = new JButton("Button-2");
        add(button1, BorderLayout.NORTH);
        add(button2, BorderLayout.SOUTH);*/

        setLayout(null); //Отключили компоновщик элементов.
        JTextField textField = new JTextField();
        textField.setBounds(20, 20, 120, 32); /*Компоновщика нет,
        мы сами указываем, куда добавить элемент.*/
        JButton button = new JButton("Press here");
        button.setBounds(20, 60, 120, 32);
        add(button);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button.setText(textField.getText());
            }
        });

        textField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(textField.getText());
                button.setText(textField.getText());
            }
        });

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("Window is closing.");
            }
        });
        add(textField);


        setVisible(true);
    }

    public static void main(String[] args) {
        new WindowApp();
    }
}
