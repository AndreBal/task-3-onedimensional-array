package by.epam.arrays.task5;

public class FifthTask {
	public static void execute(int[] arr) {
		int maxEven = arr[1];
		int minOdd = arr[0];
		for(int i = 0;i<arr.length;i+=2) {
			if(arr[i]<minOdd) {
				minOdd = arr[i];
			}
		}
		for(int i = 1;i<arr.length;i+=2) {
			if(arr[i]>maxEven) {
				maxEven = arr[i];
			}
		}
		
		System.out.println("Fifth task. Answer is: "+(maxEven+minOdd));
	}

}
