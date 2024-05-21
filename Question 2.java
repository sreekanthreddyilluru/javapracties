//2. Sort an array of 0s, 1s and 2s
//
//EX:
//
//Given an array A[] consisting of only 0s, 1s and 2s. The task is to write a 
//function that sorts the given array. The functions should put all 0s, first then 
//all 1s and all 2s in last.

import java.util.ArrayList;
public class Question2 {
	public static void main(String[] args) {
		int arr[]= {0,10,20,40,50,60};
		
		ArrayList<Integer> ary=new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				ary.add(arr[0]);
				
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==1) {
				ary.add(j);
				
			}
		}
	
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==2) {
				ary.add(k);
				
			}
		}
		System.out.println(ary);
		
	}

}