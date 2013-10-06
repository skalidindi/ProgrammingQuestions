import java.util.Hashtable;


public class SumArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] ary = new int[]{8, 9, 20, 25, 15, 10};
		
		Hashtable<Integer, Integer> table = new Hashtable();
		int target = 10;
		
		for (int i = 0; i < ary.length; i++) {
			
			int p;
			if (table.get(target - ary[i]) != null) {
				
				System.out.println(ary[table.get(target - ary[i])]);
				System.out.println(ary[i]);
				break;
			}
				
			
			if (ary[i] < target) {
				table.put(ary[i], i);
			}
		}
		
		
	}

}
