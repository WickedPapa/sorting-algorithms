package com.exercise.sorting_algorithms.service;

import java.util.Arrays;

public class MergeSortAdvancedServiceImpl implements SortingService{
    @Override
    public char[] sort(char[] array) {
        if (array == null || array.length < 2) {
            return array;
        }

        char[] buffer = new char[array.length];
        sort(array, buffer, 0, array.length - 1);
        return array;
    }

    private void sort(char[] array, char[] buffer, int left, int right) {
        if (left >= right) {
            return;
        }

        int mid = (left + right) / 2;

        sort(array, buffer, left, mid);
        sort(array, buffer, mid + 1, right);
        merge(array, buffer, left, mid, right);
    }

    private void merge(char[] array, char[] buffer, int left, int mid, int right) {
        // Copy the relevant portion of the array into the buffer (from array[left] to array[right])
        System.arraycopy(array, left, buffer, left, right - left + 1);

        int i = left;
        int j = mid + 1;
        int k = left;

        while (i <= mid && j <= right) {
            array[k++] = buffer[i] <= buffer[j]
                    ? buffer[i++]
                    : buffer[j++];
        }

        while (i <= mid) {
            array[k++] = buffer[i++];
        }
    }

    @Override
    public String implementationName() {
        return "Merge Sort Advanced";
    }
}
