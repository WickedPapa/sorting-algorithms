package com.exercise.sorting_algorithms.service;

import java.util.Arrays;
/**
    this implementation of Merge Sort can be inefficient for large arrays due to the overhead of creating
    multiple subarrays during the recursive calls. Each time the array is split, new arrays are created,
    which can lead to increased memory usage and slower performance compared to in-place sorting algorithms.
 */
public class MergeSortSimpleServiceImpl implements SortingService{
    @Override
    public char[] sort(char[] array) {
        if (array == null || array.length <= 1) {
            return array;
        }
        int n = array.length;
        char[] left = sort(Arrays.copyOfRange(array, 0, n / 2));
        char[] right = sort(Arrays.copyOfRange(array, n / 2, n));
        return merge(left, right);
    }

    private char[] merge(char[] left, char[] right) {
        char[] result = new char[left.length + right.length];
        int i = 0;
        int j = 0;
        while (i < left.length && j < right.length) {
            result[i + j] = left[i] <= right[j] ? left[i++] : right[j++];
        }
        while (i < left.length) {
            result[i + j] = left[i++];
        }
        while (j < right.length) {
            result[i + j] = right[j++];
        }
        return result;
    }

    @Override
    public String implementationName() {
        return "Merge Sort Simple";
    }
}
