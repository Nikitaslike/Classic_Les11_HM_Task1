package org.example;
//Знайдіть середнє значення кожного рядка у двовимірному масиві та виведіть результат.

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<List<Integer>> mulList = new ArrayList<>();
        mulList.add(List.of(1, 2, 3));
        mulList.add(List.of(4, 5, 6, 7));
        mulList.add(new ArrayList<>());

        System.out.println(sumPro(mulList));
    }

    public static int sumPro(List<List<Integer>> mulList) {
        int sum = 0;
        for (List<Integer> row : mulList) {
            for (Integer value : row) {
                sum += value;
            }
        }
        return sum;
    }
}
