package org.example.structural.bridge;

public class ConsoleDraw implements DrawApi{

    @Override
    public void drawCircle(int x, int y, int radius) {
        System.out.println("Drawing circle in ConsoleDraw");
    }

    @Override
    public void drawSquare(int x, int y, int side) {
        System.out.println("Drawing square in ConsoleDraw");
    }
}
