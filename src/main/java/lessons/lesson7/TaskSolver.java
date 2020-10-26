package main.java.lessons.lesson7;

import java.util.Scanner;

    public class TaskSolver {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите число а : ");
            double a = sc.nextDouble();
            System.out.println("Введите число b : ");
            double b = sc.nextDouble();
            System.out.println("Введите число c : ");
            double c = sc.nextDouble();
            double x = 0;

            methodMath(a, b, x);
            discrD(b, c, a);
        }

        private static double discrD(double b, double a, double c) {
            double x = b * b - 4 * a * c;
            return x;
        }

        private static void methodMath(double a, double b, double x) {
            if (x > 0) {
                double x1 = (-b - Math.sqrt(x)) / (2 * a);
                double x2 = (-b + Math.sqrt(x)) / (2 * a);
                System.out.println("Корни уровнения х1 = " + x1 + ", x2 = " + x2);
            }else if (x == 0) {
                double d;
                d = -b / (2 * a);
                System.out.println("Уравнение имеет единственный корень : x = " + d);
            }else {
                System.out.println("Уравнение не имеет действительных корней!");
            }
        }
        }