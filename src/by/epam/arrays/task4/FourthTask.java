package by.epam.arrays.task4;

import java.util.Arrays;

public class FourthTask {
	public static void execute(int[] array) {
		int[] arr = new int[array.length];
		System.arraycopy(array, 0, arr, 0, array.length);
		int mostFrequentNumber = arr[0];
		if(arr.length != 1) {
		Arrays.sort(arr);
		int counter = 1;
		int counterOfMostFrequent = 1;
		for(int i = 1;i<arr.length;i++) {
			if(arr[i] == arr[i-1]) {
			counter++;
			}else {
				counter = 0;
			}
			if(counter>counterOfMostFrequent) {
				counterOfMostFrequent = counter;
				mostFrequentNumber = arr[i];
			}
		}
		}
		System.out.println("Fourth task. Amswer is: "+mostFrequentNumber);
	}

}
