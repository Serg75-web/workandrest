package ru.netology.services;

public class CalcCount {

    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // имеющиеся средства

        for (int i = 0; i < 12; i++) {
            if (money >= threshold) { // отдыхаем
                money -= expenses; // money = money - expenses;
                money /= 3; // money = money / 3
                count++; // увеличиваем счётчик месяцев отдыха
            } else { // работаем
                money += income; // money = money + income
                money -= expenses;
            }
        }
        return count;
    }
}
