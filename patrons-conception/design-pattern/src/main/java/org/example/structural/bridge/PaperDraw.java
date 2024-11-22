package org.example.structural.bridge;

public class PaperDraw implements DrawApi{
    @Override
    public void drawCircle(int x, int y, int radius) {
        System.out.println("Draw circle on PaperDraw : x:" + x + " y:" + y + " radius:" + radius);
    }

    @Override
    public void drawSquare(int x, int y, int side) {
        System.out.println("Draw circle on PaperDraw : x:" + x + " y:" + y + " side:" + side);
    }
}
