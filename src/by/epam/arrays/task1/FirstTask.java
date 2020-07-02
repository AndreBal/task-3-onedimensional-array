package by.epam.arrays.task1;

import java.util.Arrays;

public class FirstTask {
	public static void execute(int[] arr) {
		int max = arr[0]+arr[arr.length-1];
		for(int i = 1;i<=arr.length/2;i++) {
			int current = arr[i]+arr[arr.length-(1+i)];
			if(current>max) {
				max = current;
			}
		}
		
		System.out.println("First task. Max from "+Arrays.toString(arr)+" is: "+max);
	}

}
