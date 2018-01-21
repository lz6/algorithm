package swapSortAlgorithm;

import java.util.Arrays;

import selectionSortAlgorithm.DataWrap;

public class BubbleSort {
	public static void main(String[] args) {
		DataWrap[] data = {
				new DataWrap(21, ""),
				new DataWrap(30, ""),
				new DataWrap(49, ""),
				new DataWrap(30, "*"),
				new DataWrap(16, ""),
				new DataWrap(9, ""),
				new DataWrap(30, "**"),
		};
		System.out.println("Before sort:\n"
				+ Arrays.toString(data));
		bubbleSort(data);
		System.out.println("After sort:\n"
				+ Arrays.toString(data));
	}

	private static void bubbleSort(DataWrap[] data) {
		System.out.println("¿ªÊ¼ÅÅÐò");
		int len = data.length;
		DataWrap temp ;
		for (int i = 0; i < len-1; i++) {
			for (int j = 0; j < len-1-i; j++) {
				if (data[j].compareTo(data[j+1]) > 0) {
					temp = data[j+1];
					data[j+1] = data[j];
					data[j] = temp;
				}
			}
			System.out.println(Arrays.toString(data));
		}
		
	}
}
