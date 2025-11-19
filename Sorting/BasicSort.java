package Sorting;

public class BasicSort {

     public static void main(String[] args){
        int[] arr = {64, 25, 12, 22, 11};
        int[] arr1 = {64, 25, 12, 22, 11};
        int[] arr2 = {64, 25, 12, 22, 11};
        int n = arr.length;
        selectionSort(arr, n);
        bubbleSort(arr1, n);
        insertionSort(arr2, n);
        /* 
         * All 3 sorting algorithm have same time and space complexity.
         * Time Complexity: O(n2)
         * Auxiliary Space: O(1)
         */
     }

     public static void print(int[] arr){
        for(int i: arr){
            System.out.print(i + " ");
        }
     }

     /**  
     * Selection Sort is a comparison-based sorting algorithm. 
     * It sorts an array by repeatedly selecting the smallest (or largest) element from 
     * the unsorted portion and swapping it with the first unsorted element. 
     * This process continues until the entire array is sorted. */

     public static void selectionSort(int[] arr, int n){
        System.out.print("\nBefore selection sort : ");
        print(arr);

        for(int i = 0; i < n-1; i++){
            int min = i;
            for(int j = 1; j < n; j++){
                if(arr[j] < arr[i])
                    min = j;
            }

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        System.out.print("\nAfter selection sort  : ");
        print(arr);
     }
     /** 
      * Bubble Sort works by repeatedly swapping the adjacent elements if they are in the wrong order. 
      * This algorithm is not suitable for large data sets as its average and worst-case time complexity are quite high. */
     public static void bubbleSort(int[] arr, int n){
        System.out.print("\nBefore bubble sort : ");
        print(arr);

        for(int i = 0; i < n-1; i++){
            boolean swapped = false;

            for(int j = 0; j < n - i - 1; j++){
                if(arr[j] > arr[j +1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if(swapped == false)
                break;
            
        }

        System.out.print("\nAfter bubble sort  : ");
        print(arr);
     }
     /**
      * Insertion sort works by iteratively inserting each element of 
      * an unsorted list into its correct position in a sorted portion of the list */
     public static void insertionSort(int[] arr, int n){
        System.out.print("\nBefore insertion sort : ");
        print(arr);

        for(int i = 1; i < n; i++){
            int key = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > key){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }

        System.out.print("\nAfter insertion sort  : ");
        print(arr);
     }
}
