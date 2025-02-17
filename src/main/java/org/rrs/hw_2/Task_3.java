package org.rrs.hw_2;

/*Задача №3

Создать программу дележа добычи на пиратском корабле. По обычаю,
половина добычи идет владельцу корабля, половина оставшегося — капитану,
остальное делится поровну между всеми членами команды, включая капитана.

Размер добычи (например, в пиастрах) и количество пиратов на корабле задать переменными.

Вывести на экран кому сколько пиастров полагается
Сколько получит капитан (Джек Воробей, естественно), если он утверждает,
что корабль принадлежит ему?

Дополнительное задание со звездочкой
Попробовать придумать как программа может проверить правильность дележа.
*/

public class Task_3 {

    public static void main(String[] args) {

        double cash = 12398757;
        int pirates = 13;

        double owner = cash / 2;
        double captain = owner / 2;
        double profit = captain / (pirates + 1);
        double captainProfit = captain + profit;
        double jack = captainProfit + owner;

        System.out.println("profit per pirate = " + profit);
        System.out.println("captain profit = " + captainProfit);
        System.out.println("Jack Sparrow profit = " + jack);

        if(profit * (pirates + 1) + captain + owner == cash) {
            System.out.println("check passed");
        } else {
            System.out.println("error");
        }
    }



}
