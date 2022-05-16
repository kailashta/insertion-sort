package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter Size Of an Array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        insertionSort(arr);
        for(int q:arr){
            System.out.println(q);
        }
    }

    private static void insertionSort(int arr[]) {
        for(int i=1;i<arr.length;i++){
            int temp = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
    }
}
