package com.pack;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]nums= {23,78,65,43,12,90};
		int target=200;
		int sums=LinearSearch(nums,target);
		System.out.println(sums);
	}
		
		
		static int LinearSearch(int [] arr,int target) {
			if (arr.length==0) {
				return -1;
			}
			for(int i=0;i<arr.length;i++) {
				int element =arr[i];
				if(element==target) {
					return i;
				}
			}
			return -1;
			

	}

}
