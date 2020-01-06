package com.datastructure.sorting.insertionsort;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {-14,12,1,4,2,-22,40};

        for(int firstUnsortedArray = 1 ; firstUnsortedArray < arr.length ;firstUnsortedArray++){
            int newElement = arr[firstUnsortedArray];
            int i;
            for(i=firstUnsortedArray ; i > 0 && arr[i-1] > newElement ; i--){
                arr[i] = arr [i-1];
            }
            arr[i] = newElement;
        }

        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}
