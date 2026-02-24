import java.util.*;

public class chapter6 {
    // create array of 5 float and calculate their sum
    // public static void main(String[] args) {
    // float arr[] ={12.2f, 13.2f, 11.2f, 99.0f, 44.3f};
    // float sum=0;
    // for(int i=0; i<arr.length; i++){
    // sum = sum + arr[i];
    // }
    // System.out.println(sum);
    // }

    ////////////
    /// WAP find out whether a given integer is present in array or not
    // public static void main(String[] args) {
    // int arr[]={1, 2, 4, 3, 5, 6, 9};
    // int target = 9;
    // for(int i=0; i<arr.length; i++){
    // if(target == arr[i]){
    // System.out.print("target value is present in array");
    // }
    // }
    // }

    /////////////////
    /// 3)calculate the avreage marks from an array containing marks of
    /// all students in physics using for each loop

    // public static void main(String[] args) {
    // int sum=0;
    // int marks[]={90, 91, 92, 94, 97};

    // for(int i : marks){
    // // for(int i=0; i<marks.length;i++){
    // sum = sum + i;// in foreach loop i is value not a index
    // }
    // int avg =sum/(marks.length);
    // System.out.println(avg);
    // }

    ////////////////
    /// 4) create a java program to add two matrices of size 2*3
    // public static void main(String[] args) {
    // int arr1[][]={{2, 1, 8}, {9, 7, 3}};
    // int arr2[][]={{10, 20, 3,}, {4, 3, 50}};
    // for(int i=0; i<2; i++){//row
    // for(int j=0; j<=2; j++){//column
    // System.out.print(arr1[i][j]+arr2[i][j]+" ");
    // }
    // System.out.println("");
    // }
    // }

    //////////////
    /// 5)WAP to reverse an array
    // public static void main(String[] args) {
    //     int arr[] = { 1, 2, 3, 4, 5, 6 };
    //     for (int i = 0; i < arr.length; i++) {
    //         for (int j = 0; j < arr.length; j++) {
    //             if ((arr.length) - i == arr[j]) {
    //                 System.out.print(arr[j] + " ");
    //             }
    //         }
    //     }
    // }


    ///////////////////////
    /// 6)WAP to find second maximum element in an array
    // public static void main(String[] args) {
    //     int arr[]={1, 0, 50, 50};
    //     int max=arr[0];
    //     int secmax=0;
    //     for(int i=1; i<arr.length; i++){
    //         if(max<arr[i]){
    //             secmax=max;
    //             max=arr[i];
    //         }
    //         else if(secmax==max && secmax<arr[i] ){
    //             secmax=arr[i];
    //         }
    //     }
    //     System.out.print(secmax);
    // }


    ////////////////////////
    // 7)find second minimum and minimum no. from array
    // public static void main(String[] args) {
    //     int arr[]={10, 20, 3, 3, 5};
    //     int min=arr[0];
    //     int secmin=0;
    //     for(int i=1; i<arr.length; i++){//i=3
    //         if(arr[i]<min){
    //             secmin=min;//10
    //             min=arr[i];//2
    //         }
    //         else if(secmin > min && secmin>arr[i]){
    //             secmin=arr[i];//3
    //         }
    //     }
    //     System.out.println(secmin);
    //     System.out.print(min);
    // }
    ///////////////////
    /// 
    /// 8)WAP to find whether the array sorted or not
    public static void main(String[] args) {
        int arr[]={5, 4, 3, 2, 1};
        int num=arr[0];
        for(int i=1; i<arr.length; i++){
                if(arr[i]>num){
                    num=arr[i];
                    continue;
                    
                }
                else if(arr[i]<num){
                    num=arr[i];
                    continue;
                }
                else{
                    System.out.println("Array is not sorted");
                }
            }
            System.out.println("Array is sorted");


        }
    
}
