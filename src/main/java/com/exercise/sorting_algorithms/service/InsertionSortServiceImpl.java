package com.exercise.sorting_algorithms.service;

public class InsertionSortServiceImpl implements SortingService{
    @Override
    public char[] sort(char[] array) {
        int n = array.length;
        for (int i = 1; i < n; ++i) {
            char cur = array[i];
            int j = i;
            while(j>0 && array[j-1] > cur){
                array[j] = array[j-1];
                j--;
            }
            array[j]=cur;
        }
        return array;
    }

    @Override
    public String implementationName() {
        return "Insertion Sort Implementation";
    }
}
