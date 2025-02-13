package org.example;

import javax.swing.*;
import java.awt.*;

class Canvas extends JPanel {
    private Robot robot;
    private Image backgroundImage; // Field for the background image

    public Canvas(Robot robot) {
        this.robot = robot;
        // Load and set the robot image
        robot.setRobotImage(new ImageIcon(getClass().getResource("/robot.gif")));
        // Load the background image (ensure the file exists in your resources)
        backgroundImage = new ImageIcon(getClass().getResource("/arena.png")).getImage();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw the background image to cover the entire canvas
        g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);

        // Draw the robot GIF on top
        if (robot.getRobotImage().getImage() != null) {
            g.drawImage(robot.getRobotImage().getImage(), robot.getX(), robot.getY(), 100, 100, this);
        }
    }
}
