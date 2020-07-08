package Phuong_trinh_bac_hai;

import java.util.Scanner;

public class SolveQuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Solve the quadratic equation");
        System.out.println("Enter a: ");
        double a = scanner.nextDouble();
        System.out.println("Enter b: ");
        double b = scanner.nextDouble();
        System.out.println("Enter c: ");
        double c = scanner.nextDouble();

        Quadratic quadratic = new Quadratic(a, b, c);
        double delta = quadratic.getDiscriminant();
        if (delta > 0) {
            System.out.println("The equation has two roots: ");
            System.out.println("root 1: " + quadratic.getRoot1());
            System.out.println("root 2: " + quadratic.getRoot2());
        } else if (delta == 0) {
            System.out.println("The equation has one root: " + quadratic.getRoot1());
        } else {
            System.out.println("The equation has no real roots!");
        }
    }
}
