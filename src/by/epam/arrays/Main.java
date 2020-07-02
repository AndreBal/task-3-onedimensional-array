package by.epam.arrays;

import by.epam.arrays.task1.FirstTask;
import by.epam.arrays.task2.SecondTask;
import by.epam.arrays.task3.ThirdTask;
import by.epam.arrays.task4.FourthTask;
import by.epam.arrays.task5.FifthTask;

public class Main {
	public static void main(String[] args) {
		int[] arr = {10,1,1,1,2,3,4};
		int[] keyArr = {0,0,6,0,0,0,0,0,0,1};
	FirstTask.execute(arr);
	SecondTask.execute(arr);
	ThirdTask.execute(keyArr);
	FourthTask.execute(arr);
	FifthTask.execute(arr);
	}
}
