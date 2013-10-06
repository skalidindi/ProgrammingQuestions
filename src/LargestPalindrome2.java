
public class LargestPalindrome2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "forgeeksskeegfor";
		
		int n = s.length();
		int maxLength = 0;
		
		String largestPalindrome = "";
		if (!s.isEmpty())
			largestPalindrome = s.substring(0);
		
		for (int i = 0; i <= n - 1; i++) {
			String s1 = divideUp(s, i, i);
			String s2 = divideUp(s, i, i+1);
			
			int GreaterStrLen = Math.max(s1.length(), s2.length());
			if (GreaterStrLen > maxLength) {
				maxLength = GreaterStrLen;
				largestPalindrome = s1;
			}
		}
		
		System.out.println(largestPalindrome);
	}
	
	public static String divideUp (String s, int l, int r) {
		int n = s.length();
		
		while ((l >= 0 && r <= n - 1) && s.charAt(l) == s.charAt(r)) {
			l--;
			r++;
		}
		System.out.println("test");
		return s.substring(l + 1, r-l+ 1);
		
	}

}
