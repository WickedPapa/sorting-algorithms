package com.exercise.sorting_algorithms.service;

public class BubbleSortEarlyStopServiceImpl implements SortingService{
    @Override
    public char[] sort(char[] array) {
        boolean swapped = true;
        int n = array.length;
        while (swapped) {
            swapped = false;
            for (int j = 0; j < n - 1; j++) {
                if (array[j] > array[j + 1]) {
                    char cur = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = cur;
                    swapped = true;
                }
            }
            n--;
        }
        return array;
    }

    @Override
    public String implementationName() {
        return "Bubble Sort Early Stop";
    }
}
