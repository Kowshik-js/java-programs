package com.pack;

public class min_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr={18,12,-7,3,14,25};
		System.out.println(min(arr));
	}
	static int min(int[] arr) {
		int ans=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<ans) {
				ans=arr[i];
			}
		}
		return ans;
	}

}
