package com.pack;

public class Element_in_range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {18,12,-7,3,14,25};
		int target=100;
				System.out.println(LinearSearch(arr,target,1,4));
		
	}
	static int LinearSearch(int [] arr,int target,int start,int end) {
		if (arr.length==0) {
			return -1;
		}
		for(int i=start;i<=end;i++) {
			int element =arr[i];
			if(element==target) {
				return i;
			}
		}
		return -1;
		

}

}
