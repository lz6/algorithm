package swapSortAlgorithm;

import java.util.Arrays;

import selectionSortAlgorithm.DataWrap;

public class QuickSort {
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
		quickSort(data);
		System.out.println("After sort:\n"
				+ Arrays.toString(data));
	}

	private static void quickSort(DataWrap[] data) {
		subSort(data, 0, data.length-1);
	}

	private static void subSort(DataWrap[] data, int start, int end) {
		if (start < end) {
			DataWrap base = data[start];
			int l = start;
			int r = end + 1;
			while(true) {
				while(l < end && data[++l].compareTo(base) <= 0);
				while(r > start && data[--r].compareTo(base) >= 0);
				if (l < r) {
					swap(data, l, r);
				}else {
					break;
				}
			}
			swap(data, start, r);
			
			//System.out.println(Arrays.toString(data));
			
			subSort(data, start, r - 1);
			
			subSort(data, r + 1, end);
		}
	}

	private static void swap(DataWrap[] data, int l, int r) {
		DataWrap tmp;
		tmp = data[l];
		data[l] = data[r];
		data[r] = tmp;
	}
}
