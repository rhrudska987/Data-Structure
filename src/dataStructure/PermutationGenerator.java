package dataStructure;

public class PermutationGenerator {

	static char[] a = {'A', 'B', 'C'};
	
	static void Permutations(int k, int m) {
		if(k==m) {
			for(int i=0; i<=m; i++)
				System.out.print(a[i] +"");
			System.out.println();
		}
		else {
			for(int i=k; i<=m; i++) {
				swap(k, i);
				Permutations(k+1, m);
				swap(k, i);
			}
		}
	}
	
	static void swap(int first, int second) {
		char tmp = a[first];
		a[first] = a[second];
		a[second] = tmp;
	}
	
	
	public static void main(String[] args) {
		Permutations(0,2);
	}

}
