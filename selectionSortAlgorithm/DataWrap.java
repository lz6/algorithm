package selectionSortAlgorithm;
public class DataWrap implements Comparable<DataWrap>{

	int data;
	String flag;
	public DataWrap(int i, String string) {
		this.data = i;
		this.flag = string;
	}
	
	public String toString() {
		return data + flag;
	}
	
	@Override
	public int compareTo(DataWrap dw) {
		
//		if (data > dw.data) {
//			return 1;
//		}
//		return -1;
		return this.data > dw.data ? 1
				: (this.data == dw.data ? 0 : -1);
	}
}
