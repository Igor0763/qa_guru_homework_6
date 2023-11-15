package com.gmail.igor763763763;

public class Main {
    public static void main(String[] args) {

        mathematics();
        logical();
        overflow();
        combinations();


    }

    //поупражняться с математическими и логическими операторами, добиться переполнения при вычислениях, посмотреть результаты (вывести в консоль)

    public static void mathematics() {
        int a = 10;
        int b = 15;
        System.out.println("сумма: " + (a + b)); //25
        System.out.println("вычитание: " + (b - a)); //5
        System.out.println("умножение: " + (b * a)); //150
        System.out.println("деление без остатка: " + (b / a)); //1
        System.out.println("остаток от деления: " + (b % a)); //5
    }

    public static void logical() {
        int c = 6;
        int d = 3;

        System.out.println("проверка условия c равно d: " + (c == d)); //false
        System.out.println("проверка условия c не равно d: " + (c != d)); //true
        System.out.println("проверка условия c больше d: " + (c > d)); //true
        System.out.println("проверка условия с меньше d: " + (c < d)); //false
        System.out.println("проверка условия c меньше или равно d: " + (c <= d)); //false
        System.out.println("проверка условия с больше или = d: " + (c >= d)); //true

    }

    public static void overflow() {
        int e = Integer.MAX_VALUE;
        byte f = 127;
        System.out.println("переполнение int: " + (e + 1));
        System.out.println("переполнение byte: " + (byte) (f + 1));
    }

    //попробовать вычисления комбинаций типов данных (int и double)
    public static void combinations() {
        double j = 0.5;
        int h = 2;

        System.out.println("сложение int и double: " + (j + h)); //2.5
        System.out.println("вычитание int и double: " + (h - j)); //1.5
        System.out.println("умножение int и double: " + (j * h)); //1.0
        System.out.println("деление int и double: " + (h / j)); //4.0
    }
}

