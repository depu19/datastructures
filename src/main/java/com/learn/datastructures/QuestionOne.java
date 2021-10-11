package com.learn.datastructures;

public class QuestionOne {

    /**
     * An element in a sorted array can be found in O(log n) time via binary search.
     * But suppose we rotate an ascending order sorted array at some pivot unknown to you beforehand.
     * So for instance, 1 2 3 4 5 might become 3 4 5 1 2. Devise a way to find an element in the rotated array in O(log n) time.
     *
     * @param args
     */
    public static void main(String[] args) {
        int arr[] = {0, 4, 5, 7, 8, 66, 77, 99};
        int element = 66;
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + high / 2;
            if (arr[mid] < element) {
                low = mid + 1;
            } else if (arr[mid] > element) {
                high = mid - 1;
            } else {
                System.out.println("Found " + element + "@ index " + mid);
            }
        }

        if (low > high) {
            System.out.println("Not found");
        }


    }
}
