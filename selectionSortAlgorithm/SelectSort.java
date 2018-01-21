package selectionSortAlgorithm;

import java.util.Arrays;

public class SelectSort {

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
		selectSort(data);
		System.out.println("After sort:\n"
				+ Arrays.toString(data));
	}

	private static void selectSort(DataWrap[] data) {
		int len = data.length;
		DataWrap temp;
		for (int i = 0; i < len; i++){
			for (int j = i; j < len; j++) {
				if (data[i].compareTo(data[j]) > 0) {
					temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}
			}
			System.out.println(Arrays.toString(data));
		}
		
	}
}

