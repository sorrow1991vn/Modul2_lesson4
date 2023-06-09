package Lesson4.QuadraticEquation;

import java.util.Scanner;

public class QuadaraticEquation {
    double a, b, c;

    public QuadaraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a: ");
        double a = sc.nextDouble();
        System.out.println("Input b: ");
        double b = sc.nextDouble();
        System.out.println("Input c: ");
        double c = sc.nextDouble();
        QuadaraticEquation ptb2 = new QuadaraticEquation(a, b, c);

        if (ptb2.getDiscriminant() > 0) {
            System.out.printf("Phuong trinh co 2 nghiem:\n" + " x1 = " +  ptb2.getRoot1(ptb2.getDiscriminant()) +"\n" + " x2 = " + ptb2.getRoot2(ptb2.getDiscriminant()));
        } else if (ptb2.getDiscriminant() == 0) {
            System.out.printf("Phuong trinh co 1 nghiem:\n" + " x= " + ptb2.getRoot1(ptb2.getDiscriminant()));
        } else {
            System.out.println("Phuong trinh vo nghiem!");
        }
    }

    public double getDiscriminant() {
        double delta;
        delta = b * b - 4 * a * c;
        return delta;
    }

    public double getRoot1(double delta) {
        double r1;
        if (delta < 0) {
            return 0;
        }
        r1 = (-b + Math.pow(delta, 0.5)) / 2 * a;
        return r1;
    }

    public double getRoot2(double delta) {
        double r2;
        if (delta < 0) {
            return 0;
        }
        r2 = (-b - Math.pow(delta, 0.5)) / 2 * a;
        return r2;
    }
}
