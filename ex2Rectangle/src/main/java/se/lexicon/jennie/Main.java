package se.lexicon.jennie;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Rectangle rec = new Rectangle();

        System.out.println("Height: ");

        double H = scan.nextDouble();

        rec.setHeight(H);

        System.out.println("Width: ");

        double W = scan.nextDouble();

        rec.setWidth(W);

        System.out.println("Area: " + rec.getArea());
    }
}