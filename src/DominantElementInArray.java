
public class DominantElementInArray {
	public static int solution ( int[] A ) {
		int count = 0;
		int element = A[0];
		
		for (int i = 0; i < A.length; i++) {
			if (count == 0) {
				element = A[i];
				count++;
			}
			else if (A[i] == element) count++;
			else count --;
		}
		
		return element;

	}
	
	public static void main(String[] args) {
		
		int A[] = new int[5];
		A[0] = -5;
		A[1] = 2;
		A[2] = 3;
		A[3] = 2;
		A[4] = 8;
		
		System.out.println(solution(A));
		
	}
}
