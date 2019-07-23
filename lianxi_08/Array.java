package com.lianxi_08;

public class Array {
	public static void main(String[] args) {
		int []arr= {23,54,67,22,121};
		sort(arr);
		System.out.println("≈≈–Ú∫Û:");
		printArry(arr);
	}
	public static void sort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for (int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	public static void printArry(int[]arr) {
		System.out.print("[");
		for(int i=0;i<arr.length;i++) {
			if(i==arr.length-1) {
				System.out.print(arr[i]);
			}else {
				System.out.print(arr[i]+", ");
			}
		}System.out.println("]");
	}

}
