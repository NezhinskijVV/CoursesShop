package ru.itsjava;

import java.util.Scanner;

/**
 * Created by Nezhinskij VV on 14.10.2019.
 */
public class Shop {
    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        String enterNumOfMenu = "Введите номер меню от 0 до 7.";
        Scanner scanner = new Scanner(System.in);
        int numOfMenu;

        printMenu(enterNumOfMenu);
        while ((numOfMenu = scanner.nextInt()) != 0) {
            printMenu(enterNumOfMenu);
            if ((numOfMenu < 0) || (numOfMenu > 7)) {
                System.out.println("Вы ввели некорректный номер меню (" + numOfMenu
                        + ")." + enterNumOfMenu);
//                System.exit(-1);
            }

        }
        System.out.println("Спасибо, что воспользовались нашим магазином." +
                "Учите Java! И разрабатывайте свой магазин. " +
                "Вам точно понадобится =)");
        scanner.close();
    }

    private static void printMenu(String enterNumOfMenu) {
        System.out.println("Меню:\n" +
                "1. Показать все курсы.\n" +
                "2. Добавить курс.\n" +
                "3. Дать доступ на месяц.\n" +
                "4. Купить курс.\n" +
                "5. Отсортировать курсы.\n" +
                "6. Придумать самим.\n" +
                "7. Придумать самим.\n" +
                "0. Выход.\n" + enterNumOfMenu);
    }

}
