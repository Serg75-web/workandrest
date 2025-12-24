package ru.netology.services;

import ru.netology.services.calcCount;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        calcCount service = new calcCount();

        int expected = 3;
        int income = 10000;
        int expenses = 3000;
        int threshold = 20000;
        int actual = service.calculate(income, expenses, threshold);
        System.out.println(expected + " -- ? -- " + actual);

        expected = 2;
        income = 100000;
        expenses = 60000;
        threshold = 150000;
        actual = service.calculate(income, expenses, threshold);
        System.out.println(expected + " -- ? -- " + actual);
        }
}