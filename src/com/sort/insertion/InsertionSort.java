package com.sort.insertion;

public class InsertionSort {
    public void sort(int[] array){
        // We can assume the first item is already sorted
        for(int i = 1; i < array.length; i++){
            int current = array[i];
            int j = i-1;
            while(j >= 0 && array[j] > current){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = current;
        }
    }
}
