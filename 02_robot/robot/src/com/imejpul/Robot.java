package com.imejpul;

public class Robot {

    private int x;
    private int y;

    public Robot() {
        x = 0;
        y = 0;
    }

    public void mover(int x, int y) {

        if (this.x < 10 && this.y < 10) {

            if ((x == 1 || x == -1) && y == 0) {
                this.x = this.x + x;
            } else if (x == 0 && (y == 1 || y == -1)) {
                this.y = this.y + y;
            }

            System.out.println("La nueva posición es: " + this.x + ", " + this.y + "\n");
        }

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
