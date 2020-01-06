package com.datastructure.sorting.quicksort;

public class QuickSort {
    public static void quickSort(int[] input,int start,int end){
        if(end - start < 2){
            return;
        }
        int pivotElement = partition(input,start,end);
        quickSort(input,start,pivotElement);
        quickSort(input,pivotElement+1,end);
    }

    public static int partition(int[] input,int start,int end){
        int pivot = input[start];
        int i = start;
        int j = end;

        while (i<j){
            while (i<j && input[--j] >= pivot);
            if(i < j){
                input[i] = input[j];
            }

            while (i<j && input[++i] <= pivot);
            if(i<j){
                input[j] = input[i];
            }
        }
        input[j] = pivot;
        return j;
    }
}
