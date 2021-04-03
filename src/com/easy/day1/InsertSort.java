package com.easy.day1;

import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {
        int[] arr={2,5,7,1,3};
        insertSort(arr);
        //Arrays.toString(arr)，返回一个包含数组元素的字符串
        System.out.println(Arrays.toString(arr));
    }
    public static void insertSort(int arr[]){
        for(int i=1;i<arr.length;i++){
            for(int j=i-1;j>=0 && arr[j+1]<arr[j];j--){
                swap(arr,j+1,j);
            }
        }
    }
    public static void swap(int arr[],int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
