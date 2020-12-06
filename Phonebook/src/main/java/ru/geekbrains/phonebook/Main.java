package ru.geekbrains.phonebook;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
            String[] fruit = {"apple", "orange", "melon", "apple", "kiwi", "kiwi", "banana", "kiwi", "pear", "mango", "papaya"};
            HashMap<String, Integer> fetus = new HashMap<>();
            for (String x : fruit) {
                fetus.put(x, fetus.getOrDefault(x, 0) + 1);
            }
            System.out.println(fetus);

            Phonebook book = new Phonebook();
            book.addContact("Roma", "+7985363487");
            book.addContact("Rita", "+7915870977");
            book.addContact("Kola", "+7916544456");
            book.addContact("Roma", "+7995877765");
            book.addContact("Sena", "+7885877737");
            book.addContact("Sena", "+7930877733");

            book.findAndPrint("Roma");
            book.findAndPrint("Sena");
            book.findAndPrint("Kola");

        }
    }
