package mergeSort;

import java.util.Arrays;

import selectionSortAlgorithm.DataWrap;

	public class MergeSort {
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
			mergeSort(data);
			System.out.println("After sort:\n"
					+ Arrays.toString(data));
		}

		private static void mergeSort(DataWrap[] data) {
			sort(data, 0, data.length-1);
		}

		private static void sort(DataWrap[] data, int left, int right) 
		{
			if (left < right) 
			{
				int center = (left+right)/2;
				
				sort(data, left, center);
				
				sort(data, center+1, right);
				
				merge(data, left, center, right);
			}
		}

		private static void merge(DataWrap[] data, int left, int center, int right) {
			DataWrap[] tmpArr = new DataWrap[data.length];
			int mid = center+1;
			
			int third = left;
			int tmp = left;
			
			while (left <= center && mid <= right) {
				if (data[left].compareTo(data[mid]) <= 0) {
					tmpArr[third++] = data[left++];
				}
				else{
					tmpArr[third++] = data[mid++];
				}
			}
			
			while (mid <= right) {
				tmpArr[third++] = data[mid++];
			}
			
			while (left <= center) {
				tmpArr[third++] = data[left++];
			}
			
			while (tmp <= right) {
				data[tmp] = tmpArr[tmp++];
			}
		}

}
