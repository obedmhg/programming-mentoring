package org.example;

class Robot {
    private int x;
    private int y;
    private final int stepSize = 20; // Movement step in pixels

    public Robot() {
        this.x = 100; // Initial position
        this.y = 100;
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

    public int getX() { return x; }
    public int getY() { return y; }
}