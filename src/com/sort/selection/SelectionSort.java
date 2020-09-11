package com.sort.selection;

public class SelectionSort {
    public void sort(int[] array){
        for(int i = 0; i < array.length; i++){
            int minIndex = getMinIndex(array, i);
            swap(array, i, minIndex);
        }
    }

    private int getMinIndex(int[] array, int i) {
        int minIndex = i;
        for(int j = i; j < array.length; j++){
            if(array[j] < array[minIndex]){
                minIndex = j;
            }
        }
        return minIndex;
    }

    private void swap(int[] array, int index1, int index2){
        int temp = array[index2];
        array[index2] = array[index1];
        array[index1] = temp;
    }
}
