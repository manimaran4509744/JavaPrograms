package org.javaPrograms;

public class MaxAndMinInArray {

	public static void main(String[] args) {

		int[]a= {3,3,5,2,6,8};
		int max=a[0];
		for(int i=1;i<a.length;i++) {
			if(max<a[i]) {
				max=a[i];
			}
		}
		System.out.println("The value of max number is: "+max);
		int min=a[0];
		for(int i=1;i<a.length;i++) {
			if(min>a[i]) {
			     min=a[i];
			}
		}
		System.out.println("The value of min number is: "+min);
	}

}
