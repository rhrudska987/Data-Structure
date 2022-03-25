package dataStructure;


public class SelectionSort {

	static int[] a = {1,5,2, 1};
	
	static void sort(int n) {
		for(int i=0; i<n; i++) {
			int j=i;
			for(int k=i+1; k<n; k++) {
				if(a[k]<a[j])
					j=k;
			}
			swap(i, j);
		}
	}
	
	static void swap(int first, int second) {
		int tmp = a[first];
		a[first] = a[second];
		a[second] = tmp;
	}
	
	public static void main(String[] args) {
		sort(4);
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		
	}

}
