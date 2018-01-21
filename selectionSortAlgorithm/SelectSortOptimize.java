package selectionSortAlgorithm;

import java.util.Arrays;

public class SelectSortOptimize {

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
		int dex;
		DataWrap temp;
		for (int i = 0; i < len -1; i++){
			dex = i;
			for (int j = i + 1; j < len; j++) {
				if (data[dex].compareTo(data[j]) > 0) {
					dex = j;
				}
			}
			if (i != dex) {
				temp = data[i];
				data[i] = data[dex];
				data[dex] = temp;
			}
			System.out.println(Arrays.toString(data));
		}
		
	}
}
