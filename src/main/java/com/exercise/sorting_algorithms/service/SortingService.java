package com.exercise.sorting_algorithms.service;

public interface SortingService {
    char[] sort(char[] array);
    String implementationName();
    default char[] printInfoSort(char[] array) {
        System.out.println("ARRAY TO SORT:");
        printArray(array);
        long start = System.nanoTime();
        char[] sortedArray = sort(array);
        long end = System.nanoTime();
        long durationNs = end - start;
        System.out.println("SORTED ARRAY:");
        printArray(sortedArray);
        System.out.println("Execution time: " + durationNs + " ns (" + (durationNs / 1_000_000.0) + " ms)");
        return sortedArray;
    }
    default void printArray(char[] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        System.out.println(sb.toString());
    }
}
