package com.lianxi_08;

public class Test2 {
	public static void main(String[] args) {
		int [] arr= {1,4,7,3,7};
		sort(arr);
		System.out.println("≈≈–Ú∫Û:");
		printArr(arr);
		
	}	
	public static void sort(int[] arr){
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++)
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
			}
		}
	}

	public static void printArr(int[] arr) {
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				System.out.println(arr[i] + "]");
			} else {
				System.out.print(arr[i] + ", ");
			}
		}
	}

}
	

