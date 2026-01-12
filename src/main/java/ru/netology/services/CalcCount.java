package ru.netology.services;

public class CalcCount {

    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // имеющиеся средства
        int moneyAfter = money + income - expenses; // имеющиеся средства плюс доход минус обязательные траты

        for (int month = 0; month < 12; month++) {
            if (money >= threshold) { // можем ли отдыхать?
                count++; // увеличиваем счётчик месяцев отдыха
                money = moneyAfter - moneyAfter * 2 / 3;
            } else {
                money = money + income - expenses;
            }
        }
        return count;
    }
}
