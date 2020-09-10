package com.sort.bubble;

public class BubbleSort {

    /**
     * isSorted is used to identify if the array is already sorted.
     * If yes, we will find out on the first iteration of inner loop. So we can execute in o(n)
     * Otherwise, it will be o(n^2)
     *
     *
     * array.length - i can be replaced with array.length in line 16. On each and every iteration of i,
     * we will move the largest number to the end. Ideally, we don't need to compare the last ith element in
     * all iteration. That's why array.length - i is used. It increases the performance little bit. still it is o(n^2)
     * if unsorted
     */
    public void sort(int[] array){
        boolean isSorted = true;
        for(int i = 0; i < array.length; i++){
            for(int j = 1; j < array.length - i; j++){
                if(array[j] < array[j-1]){
                    swap(array, j, j-1);
                    isSorted = false;
                }
            }
            if(isSorted)
                return;
        }
    }

    private void swap(int[] array, int firstIndex, int secondIndex){
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }
}
