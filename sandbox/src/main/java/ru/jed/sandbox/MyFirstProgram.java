package ru.jed.sandbox;

public class MyFirstProgram {

    public static void main(String[] args) {
        Point p1 = new Point(-2.9,8.5,4,0.7);

        System.out.println("Расстояние между двумя точками" + " = " + p1.distance(p1,p1));


    }

}