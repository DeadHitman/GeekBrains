package homeWork.java1_1.lesson7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameWindow extends JFrame {
    private static final int WIN_WIDTH = 507;
    private static final int WIN_HEIGHT = 555;
    private static final int WIN_POSX = 650;
    private static final int WIN_POSY = 250;
    private Map map;
    private SettingsWindow settings;

    GameWindow() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);  // Выход из программы при нажатии на X

        //Установка размеров и положения главного окна
        setSize(WIN_WIDTH, WIN_HEIGHT);
        setLocation(WIN_POSX, WIN_POSY);
        setTitle("TicTacToe");
        setResizable(false);  // установка неизменяемости окна

        //Создание 2х кнопок на основном окне
        JButton btnStartGame = new JButton("Start new game");
        JButton btnExit = new JButton("Exit");

        //Вызов окна с настройками по нажатию на кнопку "Start new game"
        settings = new SettingsWindow(this);
        btnStartGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                settings.setVisible(true);
            }
        });

        //Вызов окна с настройками по нажатию на кнопку "Exit"
        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        map = new Map();

        //Созадние панели и размещение кнопок на в главном окне внизу экрана
        JPanel panelBottom = new JPanel();
        panelBottom.setLayout(new GridLayout(1, 2)); // Создание панели с кнопками 1 строка и 2 столбца
        panelBottom.add(btnStartGame);
        panelBottom.add(btnExit);
        add(panelBottom, BorderLayout.SOUTH);
        add(map);  // установка настроек
        setVisible(true); // видимость панели
    }

    // Метод начинающий игру
    void startNewGame(int mode, int fieldSizeX, int fieldSizeY, int winLength) {
        map.startNewGame(mode, fieldSizeX, fieldSizeY, winLength);
    }


}
