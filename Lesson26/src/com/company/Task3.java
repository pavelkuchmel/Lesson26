package com.company;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        String string = "Задача 3. Дан текст. Разбить текст на слова и записать в коллекцию. Если пользователь ввел “up” то вывести коллекцию в прямом порядке, “down” - в обратном порядке, что-то другое - заставить повторить ввод.";

        ArrayList<String> arrayString = new ArrayList<>();

        Collections.addAll(arrayString, string.split(" "));

        System.out.println(arrayString);

        Scanner in = new Scanner(System.in);

        String answer = "";

        do {
            System.out.print("Введите UP или DOWN: ");
            answer = in.next();
        }while (!(answer.equals("UP") || answer.equals("DOWN")));

        if (answer.equals("UP")) System.out.println(arrayString);
        else {
            ArrayList<String> arrayString1 = new ArrayList<>();
            for (int i = arrayString.size()-1; i >= 0; i--){
                arrayString1.add(arrayString.get(i));
            }
            System.out.println(arrayString1);
        }
    }

}
