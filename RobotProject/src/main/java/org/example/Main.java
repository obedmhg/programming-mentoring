package org.example;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot();
        Canvas canvas = new Canvas(robot);

        JFrame frame = new JFrame("Robot Movement");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(canvas);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                char key = Character.toLowerCase(e.getKeyChar());
                if (key == 'w' || key == 'a' || key == 's' || key == 'd') {
                    robot.move(key);
                    canvas.repaint();
                }
            }
        });
    }
}