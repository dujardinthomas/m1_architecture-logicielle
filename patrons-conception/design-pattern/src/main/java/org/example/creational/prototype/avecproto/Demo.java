package org.example.creational.prototype.avecproto;

public class Demo {

    public static void main(String[] args) {

        Circle circle = new Circle("vert",80);
        System.out.println("circle : " + circle);

        Circle cloneCircle = (Circle) circle.clone();
        System.out.println("cloneCircle : " + cloneCircle);

        System.out.println((cloneCircle == circle));

        System.out.println((cloneCircle.equals(circle)));


        System.out.println();


    }
}
