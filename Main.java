package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner =new Scanner(System.in);
    public static void main(String[] args) {
        int[] arrays =getIntegers(5);
        int[] sorted =sortIntegers(arrays);
        printArray(sorted);

    }
    public static int[] getIntegers(int number){
        System.out.println("Enter  "+ number+ " numbers  \r"  );
        int[] values = new int[number];
        for (int i =0; i<values.length; i++){
            values[i]= scanner.nextInt();
        }
        return values;
    }
    public  static void printArray(int[] myIntArray){
        for (int i=0;i<myIntArray.length;i++){
            System.out.println("Element "+ i + "type value was "+ myIntArray[i] );
        }
    }
    private static int[] sortIntegers(int[] myIntArray){
        int[] sortedArray = new int[myIntArray.length];
        for (int i=0;i<myIntArray.length;i++){
            sortedArray[i]=myIntArray[i];
        }
        boolean flag=true;
        int temp = 0;
        while(flag){
            flag = false;
            for(int i=0;i<sortedArray.length-1;i++){
                if(sortedArray[i+1]>sortedArray[i]){
                    temp=sortedArray[i];
                    sortedArray[i]=sortedArray[i+1];
                    sortedArray[i+1]=temp;
                    flag=true;
                }

            }
        }
        return sortedArray;
    }
}
