package binarysearch;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1; // If the target number is not found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr); // Sort the array

        System.out.print("Enter the target number: ");
        int target = scanner.nextInt();
        scanner.close();
        int result = binarySearch(arr, target);

        if (result == -1) {
            System.out.println("The target number was not found.");
        } else {
            System.out.println("The target number is at index " + result + ".");
        }
    }
}