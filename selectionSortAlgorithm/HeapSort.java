package selectionSortAlgorithm;

import java.util.Arrays;

public class HeapSort {

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
		heapSort(data);
		System.out.println("After sort:\n"
				+ Arrays.toString(data));
	}

	private static void heapSort(DataWrap[] data) {
		System.out.println("Begin to sort:");
		int len = data.length;
		// Ñ­»·½¨¶Ñ
		for (int i = 0; i < len - 1; i++) {
			// build heap
			buildMaxHeap(data, len-1-i);
			swap(data, 0, len-1-i);
			System.out.println(Arrays.toString(data));
		}
	}

	private static void buildMaxHeap(DataWrap[] data, int last) {
		for (int i = (last -1)/2; i >=0; i--) {
			int k = i;
			while (k*2+1 <= last) {
				int biggerIndex = 2*k+1;
				if (biggerIndex < last) {
					if(data[biggerIndex].compareTo(data[biggerIndex+1]) < 0) {
						biggerIndex++;
					}
				}
				
				if(data[k].compareTo(data[biggerIndex]) < 0)  {
					swap(data, k, biggerIndex);
					k = biggerIndex;
				}
				else {
					break;
				}
			}
		}
	}

	private static void swap(DataWrap[] data, int i, int j) {
		DataWrap tmp = data[i];
		data[i] = data[j];
		data[j] = tmp;
	}
}
