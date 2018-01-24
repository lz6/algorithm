package insertSortAlgorithm;

import java.util.Arrays;

import selectionSortAlgorithm.DataWrap;

public class InsertSort {
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
		insertSort(data);
		System.out.println("After sort:\n"
				+ Arrays.toString(data));
	}

	private static void insertSort(DataWrap[] data) {
		System.out.println("Begin to sort: ");
		int len = data.length;
		for(int i = 1; i < len; i++) {
			DataWrap tmp = data[i];
			if(data[i].compareTo(data[i-1]) < 0) {
				int j = i-1;
				for(;j >=0 && data[j].compareTo(tmp) > 0; j--) {
					data[j+1] = data[j];
				}
				data[j+1] = tmp;
			}
			System.out.println(Arrays.toString(data));
		}
	}
}
