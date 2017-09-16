package com.company;

public class Main {

    public static void main(String[] args) {
        int[] myArray = {8, 9, 7, 1};
        int temp;
        for (int i = 1; i < myArray.length; i++) {
            int j = i;
            while(j>0 && myArray[j-1]>myArray[j]){
                //swapping
                temp = myArray[j];
                myArray[j]= myArray[j-1];
                myArray[j-1]=temp;
                //j-- is for comparing all right side
                j--;
            }
            System.out.println(java.util.Arrays.toString(myArray));
        }
    }
}
