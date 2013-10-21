
public class EquilibriumArray {
	public static int solution ( int[] A ) {
		long sum = 0;
		long leftSum = 0;
		
		for (int i = 0; i < A.length; i++) {
			leftSum += A[i];
		}
		
		for (int i = 0; i < A.length; i++) {
			if (sum == leftSum - A[i] && i != 0) return i;
			sum += A[i];
			leftSum -= A[i];
		}
		return -1;

	}
	
	public static void main(String[] args) {
		
		int A[] = new int[5];
		A[0] = -5;
		A[1] = 2;
		A[2] = 3;
		A[3] = 2;
		A[4] = 2;
		
		System.out.println(solution(A));
		
	}
}
