package homeWork.java1_2.lesson1;

import java.awt.*;

public class Background extends GameCanvas {

    Background(MainCircles controller) {
        super(controller);

    }

    /**
     * Написать класс Бэкграунд, изменяющий цвет канвы в зависимости от времени
     * я голову сломал пока до этого дошел,уверен,что решение не самое лучшее
     * @param canvas
     */
    public static void updateColorCanvas(GameCanvas canvas,float deltaTime) {

           Color color = new Color(
                    (int) (Math.random() * 255), //r
                    (int) (Math.random() * 255), //g
                    (int) (Math.random() * 255)  //b

            );
            canvas.setBackground(color);



    }
}
