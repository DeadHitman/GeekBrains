package homeWork.java1_1.lesson7;

import javax.swing.*;
import java.awt.*;

public class Map extends JPanel {
    public static final int MODE_HVH = 0;
    public static final int MODE_HVA = 1;
    public String[][] field;


    public Map() {
        setBackground(Color.DARK_GRAY);
    }


    //* Раcчертить панель Map на поле для игры, согласно fieldSize
    void startNewGame(int mode, int fieldSizeX, int fieldSizeY, int winLength) {
        System.out.printf("mode: %d, size: %d, len: %d\n", mode, fieldSizeX, winLength);
        createGameField(fieldSizeX, fieldSizeY);

    }

    //Не понимаю
    public static void createGameField(int fieldSizeX, int fieldSizeY) {
        GameWindow gameField = new GameWindow();

        gameField.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        String[][] field = new String[fieldSizeX][fieldSizeY];

        //а дальше я не понимаю как разместить прямоугольники в окне которое создается после кнопки "OK"

    }



    //Вопросы:
    //1. Не совсем понял про то,что GameWindow знает про map,а map нет дублирование startNewGame
    //2. Как начерить поле в старой сущности,после применения настроек?



}
