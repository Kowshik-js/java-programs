package com.pack;

public class Search_letter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="kowshik";
		char target='z';
		System.out.println(search(name,target));
	}
	static boolean search(String str,char target) {
		if(str.length()==0) {
			return false;
		}
		for(int i=0;i<str.length();i++)
		{
			if(target==str.charAt(i)) {
				return true;
			}
		}
		return false;
	}

}
