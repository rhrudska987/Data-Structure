package dataStructure;

public class BinarySearch {

	static int a[] = {1,3,4,6,7,8,10,13,14,18,19,21,24,37,40,45,71};
	static int binary(int findNum, int left, int right) {
		if(left <= right) {
			int middle = (left+right)/2;
			if(findNum<a[middle]) return binary(findNum, left, middle-1);
			else if(findNum>a[middle]) return binary(findNum, middle+1, right);
			return middle;
		}
		return -1;
	}
	
	
	public static void main(String[] args) {
		System.out.println(binary(21, 0, a.length));
	}

}
