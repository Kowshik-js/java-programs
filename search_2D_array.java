
package com.pack;


public class search_2D_array {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
	    static int reverse(int x) {
	    	
	    	int rev=0;
	    	while(x!=0)
	    	{
	    		int digit=x%10;
	    		if(rev>Integer.MAX_VALUE/10 || rev<Integer.MAX_VALUE/10 ) {
	    			return 0;
	    		}
	    		rev=(rev*10)+digit;
	    		x=x/10;
	    	}
	    	return -1;
	    }
	}
}