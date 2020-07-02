package by.epam.arrays.task3;

import java.util.Arrays;

public class ThirdTask {
	public static void execute(int[] arr) {
		boolean isUnsolvable = false;
		int first = 0;

		while (arr[first] == 0) {
			first++;
		}

		int second = first + 1;

		while (arr[second] == 0) {
			second++;
		}

		for (int i = first % 3; i < 10; i += 3) {
			arr[i] = arr[first];
		}
		
		if ((second - first) % 3 == 0) {
			if(arr[second]!=arr[first]) {
				isUnsolvable =true;
			}
			second = first + 1;
			arr[second] = (10 - arr[first]) / 2;
			
		}
		
		for (int i = second % 3; i < 10; i += 3) {
			arr[i] = arr[second];
		}
		int thirdValue = 10 - arr[second] - arr[first];
		if(thirdValue<1) {
			isUnsolvable = true;
		}
		for (int i = 0; i < 10; i++) {
			if (arr[i] == 0) {
				arr[i] = thirdValue;
			}
		}
		if(isUnsolvable) {System.out.println("Third task. Lock cannot be unlocked with given combination of dices");}else {
		System.out.println("Third task. "+Arrays.toString(arr));
		}

	}

}
