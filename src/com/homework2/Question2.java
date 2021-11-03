package com.homework2;

public class Question2 {
	public static void main(String args[]) {
		int mat[][]= {{1,3,5},
					{2,300,6},
					{3,6,59}};
		
		int bigNumber=0;
		int x=0;
		int y=0;
		
	    for (int i = 0; i < 3; i++) {
	    	for (int j = 0; j < 3; j++) {
	    		if (mat[i][j] > bigNumber) {
	                    bigNumber = mat[i][j];
	                    x=j;
	                    y=i;
	    		}
	    	}
	    }
	    System.out.println("Biggest Number: "+bigNumber+" ");
	    System.out.print("Is at: (" + x+", ");
	    System.out.println(y+")");
	}
}
