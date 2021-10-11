package com.learn.datastructures.questions;

/**
 * An element in a sorted array can be found in O(log n) time via binary search.
 * But suppose we rotate an ascending order sorted array at some pivot unknown
 * to you beforehand. So for instance, 1 2 3 4 5 might become 3 4 5 1 2.
 * Devise a way to find an element in the rotated array in O(log n) time.
 */
public class SearchSortedArrayPivoted {

    public static void main(String[] args) {
        Integer[] input = {5, 6, 7, 8, 1, 2, 3, 4};
        System.out.println("Element found at "+performSearchInRotatedArray(input, 5));

    }


    private static Integer performSearchInRotatedArray(Integer[] input, int element) {

        int min = 0;
        int max = input.length - 1;
        for (int i = 0; i < input.length - 1; i++) {
            if (input[i] > input[i + 1]) {
                if (element <= input[i] && element >= input[min]) {
                    max = i;
                    break;
                } else if (element >= input[i + 1] && element <= input[max]) {
                    min = i + 1;
                    break;
                }
                return null;
            }
        }
       while(max != min) {
            int mid = (min + max) / 2;
            if(element < input[mid]) {
                max=mid-1;
            }
            else if(element > input[mid]) {
                min = mid +1;
            }
            else  {
                return mid;
            }
        }
        return max;
    }


}
