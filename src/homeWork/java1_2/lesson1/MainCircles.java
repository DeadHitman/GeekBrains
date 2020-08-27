package homeWork.java1_2.lesson1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Arrays;

public class MainCircles extends JFrame {
    private static final int POS_X = 400;
    private static final int POS_Y = 200;
    private static final int WINDOW_WIDTH = 800;
    private static final int WINDOW_HEIGHT = 600;

    Sprite[] sprites;
    int count = 1; // начальное кол-во шаров


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainCircles();
            }
        });
    }


    private MainCircles() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(POS_X, POS_Y, WINDOW_WIDTH, WINDOW_HEIGHT);
        GameCanvas canvas = new GameCanvas(this);
        add(canvas, BorderLayout.CENTER);
        initApplication();
        setTitle("Circles");
        setVisible(true);
//        canvas.setBackground(Color.GREEN);


        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);

                if (e.getButton() == MouseEvent.BUTTON1) {

                    addBall(sprites, count);
                    count++;
                    initApplication();
                }
                if (e.getButton() == MouseEvent.BUTTON3) {
                    removeBall(sprites, count);
                    count--;
                    initApplication();
                }
            }
        });


    }

    private void initApplication() {
        try {

            this.sprites = new Sprite[count];

            for (int i = 0; i < sprites.length; i++) {
                sprites[i] = new Ball();
            }
        } catch (NegativeArraySizeException e) {
            System.out.println("Создай шар у тебя массив отрицательный " + e.toString());
            this.count = 0;
        }

    }

    public void onDrawFrame(GameCanvas canvas, Graphics g, float deltaTime) {
        update(canvas, deltaTime);
        render(canvas, g);
//        Цвет фона
//        Background.updateColorCanvas(canvas, deltaTime);


    }

    private void update(GameCanvas canvas, float deltaTime) {
        for (int i = 0; i < sprites.length; i++) {
            sprites[i].update(canvas, deltaTime);
        }
    }

    private void render(GameCanvas canvas, Graphics g) {
        for (int i = 0; i < sprites.length; i++) {
            sprites[i].render(canvas, g);
        }
    }


    /**
     * Добавляю новые шары по нажатию мыши
     *
     * * Реализация помойка - не понимаю как их добавлять по одному,чтобы каждый новый шар начинал с начала экрана,а остальные
     * в этот момент уже бились о край экрана
     *
     * @param sprites
     * @param count
     */
    private void addBall(Sprite[] sprites, int count) {
        this.sprites = sprites;

        Sprite[] addSprite = new Sprite[sprites.length + count];

        addSprite = Arrays.copyOf(sprites, addSprite.length);
        for (int i = 0; i < addSprite.length; i++) {
            if (addSprite[i] == null) {
                addSprite[i] = new Ball();

            }


        }


    }

    /**
     * Удаление шара из массива sprite
     *
     * @param sprites
     * @param count
     */
    private void removeBall(Sprite[] sprites, int count) {
        this.sprites = sprites;
        Sprite[] removeSprite = new Sprite[sprites.length];

        removeSprite = Arrays.copyOf(sprites, (removeSprite.length - count));
        for (int i = 0; i < removeSprite.length; i++) {
            removeSprite[i] = new Ball();
        }


    }


}


