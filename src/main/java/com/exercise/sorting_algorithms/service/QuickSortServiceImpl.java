package com.exercise.sorting_algorithms.service;

public class QuickSortServiceImpl implements SortingService{
    @Override
    public char[] sort(char[] array) {
        if (array == null || array.length < 2) {
            return array;
        }

        sort(array, 0, array.length - 1);
        return array;
    }

    private void sort(char[] array, int left, int right) {
        if (left >= right) {
            return;
        }

        int pivotIndex = partition(array, left, right);

        sort(array, left, pivotIndex - 1);
        sort(array, pivotIndex + 1, right);
    }

    private int partition(char[] array, int left, int right) {
        int mid = (left + right) / 2;

        int pivotIndex = medianOfThree(array, left, mid, right);
        swap(array, pivotIndex, right);

        char pivot = array[right];
        int i = left - 1;

        for (int j = left; j < right; j++) {
            if (array[j] <= pivot) {
                i++;
                swap(array, i, j);
            }
        }

        swap(array, i + 1, right);
        return i + 1;
    }

    private int medianOfThree(char[] array, int a, int b, int c) {
        char x = array[a];
        char y = array[b];
        char z = array[c];

        if ((x <= y && y <= z) || (z <= y && y <= x)) {
            return b;
        } else if ((y <= x && x <= z) || (z <= x && x <= y)) {
            return a;
        } else {
            return c;
        }
    }

    private void swap(char[] array, int i, int j) {
        char temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    @Override
    public String implementationName() {
        return "Quick Sort";
    }
}
