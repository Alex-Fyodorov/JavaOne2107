package lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GameCounterHomeWorkApp extends JFrame {
    private int value; //Текущее значение счётчика
    private int endsValue; //Конечное значение счётчика
    Random random = new Random();

    public GameCounterHomeWorkApp (int initialValue) {

        this.value = initialValue;
        endsValue = random.nextInt(202) - 101;

        //Создаём окно
        setBounds(500, 500, 400, 200);
        setTitle("Набери число");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Font font = new Font("Arial", Font.BOLD, 30);

        //Создаём четыре кнопки счётчика
        int[] buttonValue = new int[]{-10, -1, 1, 10};
        JButton[] button = new JButton[4];

        for (int i = 0; i < 4; i++){
            button[i] = new JButton(String.valueOf(buttonValue[i]));
        }
        button[0].setBounds(0, 80, 80, 81);
        button[1].setBounds(0, 0, 80, 80);
        button[2].setBounds(304, 0, 80, 80);
        button[3].setBounds(304, 80, 80, 81);
        for (int i = 0; i < 4; i++){
            button[i].setFont(font);
            add(button[i]);
        }

        //Создаём кнопку перезапуска
        JButton restartButton = new JButton("Заново");
        restartButton.setBounds(80, 121, 224, 40);
        add(restartButton);

        //Создаём информационную строчку
        JLabel infoPane = new JLabel("Наберите число " + endsValue);
        infoPane.setBounds(80, 0, 224, 40);
        infoPane.setHorizontalAlignment(SwingConstants.CENTER);
        add(infoPane);

        //Сам счётчик
        JLabel counterValue = new JLabel(String.valueOf(initialValue));
        counterValue.setFont(font);
        counterValue.setHorizontalAlignment(SwingConstants.CENTER);
        add(counterValue, BorderLayout.CENTER);

        /*Слушатели кнопок счётчика. При достижении конечного значения
        * кнопки отключаются, и появляется сообщение о конце игры.*/
        buttonListener(button[0], buttonValue[0], counterValue, infoPane);
        buttonListener(button[1], buttonValue[1], counterValue, infoPane);
        buttonListener(button[2], buttonValue[2], counterValue, infoPane);
        buttonListener(button[3], buttonValue[3], counterValue, infoPane);

        //Слушатель кнопки перезапуска
        restartButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value = random.nextInt(202) - 101;
                counterValue.setText(String.valueOf(value));
                endsValue = random.nextInt(202) - 101;
                infoPane.setText("Наберите число " + endsValue);
            }
        });
        setVisible(true);
    }

    /**
     * Метод, осуществляющий слушание четырёх основных кнопок.
     * Также  метод проверяет начение счётчика и конечное значение.
     * При достижении конечного значения кнопки отключаются,
     * и появляется сообщение о конце игры.
     *
     * @param button Проверяемая кнопка
     * @param buttonValue Значение кнгопки
     * @param counterValue Значение счётчика
     * @param infoPane текст на инфо-экране
     */
    public void buttonListener(JButton button, int buttonValue,
                     JLabel counterValue, JLabel infoPane) {
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (value != endsValue) {
                    value += buttonValue;
                    counterValue.setText(String.valueOf(value));
                    if (value == endsValue) {
                        infoPane.setText("Вы выиграли!");
                    }
                }
            }
        });
    }
    public static void main(String[] args) {
        new GameCounterHomeWorkApp(new Random().nextInt(202) - 101);
    }
}