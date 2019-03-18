package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            list.add(random.nextInt(100));
        }
        System.out.println(list);

        double meanArr = list.stream().map(x -> x * x).mapToInt(x -> x).average().getAsDouble();
        System.out.println("Среднее арифм. квадратов: " + meanArr);
    }
}
