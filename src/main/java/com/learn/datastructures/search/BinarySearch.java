package com.learn.datastructures.search;

public class BinarySearch {

    public static void main(String[] args) {
        int arr[] = {5, 6, 7, 33, 34, 67, 78, 89, 99};
        //int arr[] = {5};
        int key = 33;
        int low = 0;
        int high = arr.length - 1;
        Integer index = null;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (key < arr[mid]) {
                high = mid-1;
            } else if (key > arr[mid]) {
                low = mid + 1;
            } else {
                index = mid;
                break;
            }
        }

        System.out.println("Found " + key + " @ index " + index);


    }
}
