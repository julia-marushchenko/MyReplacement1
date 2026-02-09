/**
 * Task to xor the elements of the arrays with their respective indices.
 * After step1, print the array. Then set all the elements of A to zero, and print the array.
 */
package com.myarrays;

import java.util.Arrays;

/**
 *  Main class.
 */
public class Main {

    // Main method to run java program.
    public static void main(String[] args) {

        // Creating and initializing array arr.
        int[] arr = {1, 3, 7, 8, 9, 0, 2, 2, 9, 6};

        // Calling method xorToN().
        Replacement.xor1ToN(arr, 10);

        // Calling method printArr().
        Replacement.printArr(arr, 10);

        // Calling method xor1ToN().
        Replacement.setToZero(arr, 10);

        // Calling method printArr().
        Replacement.printArr(arr, 10);
    }
}

/**
 *  Replacement class.
 */
class Replacement {

    static void printArr(int arr[], int n) {

        // Printing the array to console.
        System.out.println(Arrays.toString(arr).replace(',', ' ').replace('[', ' ')
                .replace(']', ' ').trim());
    }

    // Method to replace all elements of array with 0s.
    static void setToZero(int arr[], int n) {
        // use Arrays.fill to set arr to zero
        Arrays.fill(arr, 0, n, 0);
    }

    // Method to XOR each element with their indices.
    static void xor1ToN(int arr[], int n) {

        // Xor arr[i]^i
        for (int i = 0; i < n; i++) {
            arr[i] = arr[i]^i;
        }
    }

}