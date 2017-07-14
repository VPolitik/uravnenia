package com.courses;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choise;
        double a, b, c, x, y;
        double ans;
        System.out.println("Введите номер формулы(от 1 - до 4), которую надо просчитать: ");
        System.out.println("Формула номер 1 имеет ввид - (b + sqrt(b^2 + 4ac)) / 2a - a^3 * c + b^(-2)");
        System.out.println("Формула номер 2 имеет ввид - x - x^3/3 + x^5/5");
        System.out.println("Формула номер 3 имеет ввид - x + y / y + 1 - (x * y - 12) / 34 + x");
        System.out.println("Формула номер 4 имеет ввид - sin sqrt (x + 1) - sin sqrt (x - 1)");
        choise = in.nextInt();
        switch (choise)
        {
            case 1:
            {
                System.out.println("Введите значения A: ");
                a = in.nextDouble();
                System.out.println("Введите значения B: ");
                b = in.nextDouble();
                System.out.println("Введите значения C: ");
                c = in.nextDouble();
                ans = b+(Math.sqrt (Math.pow(b, 2)+4*a*c))/2*a-Math.pow(a, 3 )*c+Math.pow(b, -2);
                System.out.println("Значение заданной фомрулы = "+ans);
                break;
            }
            case 2:
            {
                System.out.println("Введите значения X: ");
                x = in.nextDouble();
                ans = x - Math.pow(x, 3)/3 + Math.pow(x, 5)/5;
                System.out.println("Значение заданной фомрулы = "+ans);
                break;
            }
            case 3:
            {
                System.out.println("Введите значения X: ");
                x = in.nextDouble();
                System.out.println("Введите значения Y: ");
                y = in.nextDouble();
                ans = (x+y)/(y+1)-(x*y-12)/(34+x);
                System.out.println("Значение заданной фомрулы = "+ans);
                break;
            }
            case 4:
            {
                System.out.println("Введите значения X: ");
                x = in.nextDouble();
                ans = Math.sin(Math.sqrt(x+1))- Math.sin(Math.sqrt(x-1));
                System.out.println("Значение заданной фомрулы = "+ans);
                break;
            }
            default:
            {
                System.out.println("Вы не выбрали ни одну допустимую формулу: ");
                break;
            }
        }
    }
}
