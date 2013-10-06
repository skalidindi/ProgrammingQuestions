import java.util.ArrayList;
import java.util.Collections;


public class CreateChange {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int target = 250;
		int []denom = new int[]{5, 15, 25, 35};
		
		System.out.println(minChange(denom, 300));
	}
	
	public static int minChange(int[] denom, int targetAmount) {
	    int actualAmount;
	    int m = denom.length + 1;
	    int n = targetAmount + 1;
	    int inf = Integer.MAX_VALUE - 1;

	    int[][] table = new int[m][n];
	    for(int i = 0; i< m; ++i) {
	        for (int j = 1; j < n; j++) {
	            table[i][j] = inf;
	        }
	    }

	    for (int denomPosition = 1; denomPosition < m; denomPosition++) {
	        for (int currentAmount = 1; currentAmount < n; currentAmount++) {
	            if (denom[denomPosition-1] <= currentAmount) {
	                // take
	                actualAmount = table[denomPosition][currentAmount - denom[denomPosition-1]];
	            }
	            else {
	                actualAmount = inf;
	            }                                              // do not take
	            table[denomPosition][currentAmount] = Math.min(table[denomPosition-1][currentAmount], 1 + actualAmount);
	        }
	    }

	    return table[m-1][n-1];
	}

}
