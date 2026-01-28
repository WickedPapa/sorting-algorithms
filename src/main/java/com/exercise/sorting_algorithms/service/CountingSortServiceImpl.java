package com.exercise.sorting_algorithms.service;

import java.util.HashMap;

public class CountingSortServiceImpl implements SortingService{
    @Override
    public char[] sort(char[] array) {
        char min = array[0];
        char max = array[0];

        for (char c : array) {
            if (c < min) min = c;
            if (c > max) max = c;
        }

        int[] count = new int[max - min + 1];

        for (char c : array) {
            count[c - min]++;
        }

        int k = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                array[k++] = (char) (i + min);
                count[i]--;
            }
        }
        return array;
    }

    @Override
    public String implementationName() {
        return "Counting Sort";
    }
}
