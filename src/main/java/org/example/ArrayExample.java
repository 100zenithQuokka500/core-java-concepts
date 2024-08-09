package org.example;

public class ArrayExample {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        System.out.println("1d array:");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("for each loop:");
        for (int i:arr) {
            System.out.println(i);
        }
        System.out.println("while loop:");
        int ele=0;
        while(ele<arr.length){
            System.out.println(arr[ele]);
            ele++;
        }
        System.out.println("2nd array:");
        int arr2[][]={{1,2,3},{6,7,8},{43,21,56}};
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr2[0].length;j++){
                System.out.println(arr2[i][j]);
            }
        }
        System.out.println("******");
        for(int i=0;i<arr2[0].length;i++){
            for(int j=0;j<arr2.length;j++){
                System.out.println(arr2[j][i]);
            }
        }

        for (int[] row:arr2) {
            for (int colmn:row) {
                System.out.println(colmn);
            }
        }
        System.out.println("while loop in 2d array:");
        int row=0;
        while(row<arr2.length){
            int colmn=0;
            while(colmn<arr2[row].length){
                System.out.println(arr2[row][colmn]);
                colmn++;
            }
            System.out.println(" ");
            row++;
        }
    }
}
