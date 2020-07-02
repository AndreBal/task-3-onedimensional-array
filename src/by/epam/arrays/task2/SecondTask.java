package by.epam.arrays.task2;

import java.util.Arrays;

public class SecondTask {
	public static void execute(int[] arr) {
		int minNumber = arr[0];
		int counterOfMinNumber = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < minNumber) {
				minNumber = arr[i];
				counterOfMinNumber = 1;
			} else if (arr[i] == minNumber) {
				counterOfMinNumber++;
			}
		}
		int[] resultArray = new int[arr.length - counterOfMinNumber];
		for (int i = 0, j = 0; i < arr.length; i++) {
			if (arr[i] != minNumber) {
				resultArray[j] = arr[i];
				j++;
			}
		}

		System.out.println("Second task. Array from: " + Arrays.toString(arr) + " became:" + Arrays.toString(resultArray));
	}
}
