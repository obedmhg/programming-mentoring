package org.example;

import javax.swing.*;

class Robot {
    private int x;
    private int y;
    private final int stepSize = 20; // Movement step in pixels
    private ImageIcon robotImage;

    public Robot() {
        this.x = 0; // Initial position
        this.y = 0;
    }

    public void move(char direction) {
        switch (direction) {
            case 'w': y -= stepSize; break; // Up
            case 's': y += stepSize; break; // Down
            case 'a': x -= stepSize; break; // Left
            case 'd': x += stepSize; break; // Right
            default: return;
        }
    }

    public ImageIcon getRobotImage() {
        return robotImage;
    }

    public void setRobotImage(ImageIcon robotImage) {
        this.robotImage = robotImage;
    }

    public int getX() { return x; }
    public int getY() { return y; }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}