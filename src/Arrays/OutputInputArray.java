package Arrays;

import java.util.Scanner;

public class OutputInputArray {
 public static void main(String[] args) {
//  int[] arr = {5,-8,6,54,67};
//  for(int i=0;i<arr.length ;i++){
//   System.out.print(arr[i]+" ");
//
//  }
//  int i=0;
//  while(i<5){
//   System.out.println(arr[i]+ " ");
//   i++;
//  }
  int[] akash = new int[7];
  Scanner sc = new Scanner(System.in);
//  default values
//  for(int i=0;i<7;i++){
//   System.out.print(akash[i] + " ");
//  }

  for(int i=0;i<akash.length;i++){
   akash[i]=sc.nextInt();
  }
//print double
  for(int i=0;i<akash.length;i++){
   System.out.print(2*akash[i]+" ");
  }
 }







 }
