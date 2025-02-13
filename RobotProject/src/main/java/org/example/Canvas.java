package org.example;

import javax.swing.*;
import java.awt.*;

class Canvas extends JPanel {
    private Robot robot;

    public Canvas(Robot robot) {
        this.robot = robot;
        robot.setRobotImage(new ImageIcon(getClass().getResource("/robot.gif")));// Ensure this file exists in the project folder
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw the robot GIF
        if (robot.getRobotImage().getImage() != null) {
            g.drawImage(robot.getRobotImage().getImage(), robot.getX(), robot.getY(), 100, 100, this);
        }
    }
}