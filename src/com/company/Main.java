package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Программа сравнения двух строк");
          System.out.print("Введите первое слово и нажмите enter: ");
            String word1 = sc.nextLine();
            System.out.print("Введите второе словои нажмите enter: ");
            String word2 = sc.nextLine();
            if (word1.equals(word2))
                System.out.print("Отлично! Слова одинаковы.");
            else
                if (word1.equalsIgnoreCase(word2))
                System.out.print("Хорошо! Слова почти одинаковы.");
                else
                    if (word1.length() == word2.length())
                        System.out.print("Ну, хотябы они одной длинны");
                    else
                        System.out.print("Все пропало!!! Очень разные.");
    }
}
