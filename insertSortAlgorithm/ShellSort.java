package insertSortAlgorithm;

import java.util.Arrays;

import selectionSortAlgorithm.DataWrap;

public class ShellSort {
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
		shellSort(data);
		System.out.println("After sort:\n"
				+ Arrays.toString(data));
	}

	private static void shellSort(DataWrap[] data) {
		int len = data.length;
		int h =1;
		
		while(h <= len/3) {
			h = h*3+1;
		}
		
		while(h>0) {
			System.out.println("h=" + h);
			for (int i = h; i < len; i++) {
				DataWrap tmp = data[i];
				
				if(data[i].compareTo(data[i -h]) < 0) {
					int j = i - h;
					for (; j>=0 && data[j].compareTo(tmp) > 0; j-=h) {
						data[j+h] = data[j];
					}
					data[j+h] = tmp;
				}
				System.out.println(Arrays.toString(data));
			}
			h = (h-1)/3;
		}
	}

}
