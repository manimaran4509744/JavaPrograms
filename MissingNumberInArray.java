package org.javaPrograms;

public class MissingNumberInArray {

	public static void main(String[] args) {
		int[] a = { 1, 3, 4 };
		int sum=0;
	    for(int i=0;i<a.length;i++) {
	    	sum = sum+a[i];
	    }
	    int sum2=0;
		for(int i=1;i<=4;i++) {
			sum2=sum2+i;
		}
		int missingNumber = sum2-sum;
		System.out.println("The missing number in the array is : "+missingNumber);
		
	}
}

