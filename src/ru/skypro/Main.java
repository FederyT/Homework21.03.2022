package ru.skypro;

import java.sql.SQLOutput;

public class Main {


    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }


    public static void task1() {
//        Задание 1
        String firstName = "Ivan ";
        String middleName = "Ivanovich ";
        String lastName = "Ivanov ";
        String fullName = lastName + firstName + middleName;
        System.out.println(fullName);
    }

    public static void task2() {
//        Задание 2
        String firstName = "Ivan ";
        String middleName = "Ivanovich ";
        String lastName = "Ivanov ";
//      String fullName = "Ivanov Ivan Ivanovich";  вместо line 30
        String fullName = lastName + firstName + middleName;
        String fullName1 = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName1);
    }


    public static void task3() {
//        Задание 3
        String fullName = "Иванов Семён Семёнович";
        char[] a = fullName.toCharArray();
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 'ё') {
                a[i] = 'е';
            }
        }
        System.out.println(a);


        /*       fullName = fullName.replace("ё", "е"); зачем усложнять, когда есть проще)))
        System.out.println(fullName);
  */

    }
}







