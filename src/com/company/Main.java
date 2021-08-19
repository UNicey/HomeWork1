package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String result;

        int num = 10;
        String word = "GeekTeck! ";
        result = word + num;
        System.out.println(result);

// Условная конструкция

        if (num > 0) {
            System.out.println(num);
        }if (num < 0) {
            System.out.println(num);
        }else{
            System.out.println(0);
        }

// Доп.Задание
        Scanner in = new Scanner(System.in);
        System.out.println("Введите ваше имя:");
        String name = in.nextLine();
        System.out.println("Hello " + name);









    }
}
