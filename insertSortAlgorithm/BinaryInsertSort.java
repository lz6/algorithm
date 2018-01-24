package insertSortAlgorithm;

import java.util.Arrays;

import selectionSortAlgorithm.DataWrap;

public class BinaryInsertSort {
	public static void main(String[] args) {
		DataWrap[] data = {
				new DataWrap(21, ""),
				new DataWrap(30, "***"),
				new DataWrap(50, ""),
				new DataWrap(49, ""),
				new DataWrap(30, "**"),
				new DataWrap(16, ""),
				new DataWrap(70, ""),
				new DataWrap(9, ""),
				new DataWrap(50, ""),
				new DataWrap(49, ""),
				new DataWrap(30, "*****"),
				new DataWrap(99, ""),
				new DataWrap(20, ""),
				new DataWrap(9, ""),
				new DataWrap(30, "****"),
				new DataWrap(80, ""),
				new DataWrap(30, "*"),
		};
		System.out.println("Before sort:\n"
				+ Arrays.toString(data));
		binaryInsertSort(data);
		System.out.println("After sort:\n"
				+ Arrays.toString(data));
	}

	private static void binaryInsertSort(DataWrap[] data) {
		int len = data.length;
		for (int i = 1; i < len; i++) {
			if (data[i].compareTo(data[i-1]) < 0) {
				DataWrap tmp = data[i];
				int inx = swapData(0,i-1,data);
				while (i > inx)  {
					data[i] = data[i-1];
					i--;
				}
				data[inx] = tmp;
			}
		}
		
	}

	private static int swapData(int i, int j, DataWrap[] data) {
		int diff = j-i;
		DataWrap tmp = data[j+1];
		if(diff/2 <= 0) {
			if(data[j].compareTo(tmp) <= 0) {
				return j+1;
			}else if(data[j].compareTo(tmp) > 0 
					&& data[i].compareTo(tmp) <= 0){
				return j;
			}else{
				return i;
			}
			//System.out.println(Arrays.toString(data));
		}else{
			if (tmp.compareTo(data[diff/2]) < 0) {
				swapData(0, diff/2, data);
			}else {
				swapData((diff)/2+1, diff, data);
			}
		}
		return 0;
	}
}
