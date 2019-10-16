package ru.itsjava;

import java.util.Arrays;
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
        String[] courses = new String[]{"Java для всех", "Мотивация, когда ты упал",
                "Продай другому и не подай себя",
                "Наготочки и пилочки для чайников",
                "Тортики или как я заработал миллион"};
        printMenu(enterNumOfMenu);
        while ((numOfMenu = scanner.nextInt()) != 0) {
            if ((numOfMenu < 0) || (numOfMenu > 7)) {
                System.out.println("Вы ввели некорректный номер меню (" + numOfMenu
                        + ")." + enterNumOfMenu);
//                System.exit(-1);
            }

            switch (numOfMenu) {
                case 1:
                    showAllCourses(courses);
                    break;
                case 2:
                    courses = addCourse(scanner, courses);
                    break;
            }
            printMenu(enterNumOfMenu);
        }
        System.out.println("Спасибо, что воспользовались нашим магазином." +
                "Учите Java! И разрабатывайте свой магазин. " +
                "Вам точно понадобится =)");
        scanner.close();
    }

    private static String[] addCourse(Scanner scanner, String[] courses) {
        String[] resCourses = Arrays.copyOf(courses,courses.length +1);
        System.out.println("Введи новое имя курса:");
        String inputCourse = scanner.next();
        resCourses[resCourses.length - 1] = inputCourse;
        System.out.println("Курс " + inputCourse +" успешно добавлен!!");
        return resCourses;
    }

    private static void showAllCourses(String[] courses) {
        System.out.println("Вывод всех курсов:");
        for (String course : courses) {
            System.out.println(course);
        }
    }

    private static void printMenu(String enterNumOfMenu) {
        //charAt()
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