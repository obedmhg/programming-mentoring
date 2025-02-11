package org.example;

import javax.swing.*;
import java.awt.*;

class Canvas extends JPanel {
    private Robot robot;
    private ImageIcon robotImage;

    public Canvas(Robot robot) {
        this.robot = robot;
        this.robotImage = new ImageIcon(getClass().getResource("/robot.gif")); // Ensure this file exists in the project folder
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw the robot GIF
        if (robotImage.getImage() != null) {
            g.drawImage(robotImage.getImage(), robot.getX(), robot.getY(), 100, 100, this);
        }
    }
}