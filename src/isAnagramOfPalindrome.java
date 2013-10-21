
public class isAnagramOfPalindrome {
	public static int isAnagramOfPalindrome(String str)
	{
	    int i, temp = 0;
	    int size = str.length();
	    
	    // take distance from a to the char
	    // then 2^distance (shift with 1) and xor with temp
	    // point is different letters get a different combo of numbers
	    // a pair of letters gets temp closer to 0
	    for (i = 0; i < size; i++) {	    	
	        temp ^= 1 << (str.charAt(i) -'a');
	    }

	    // if temp = 0 then all letters have even numbers of frequency
	    // temp = 1 then all letters but one have even numbers of frequency
	    if (temp == 0 | (temp & (temp - 1)) == 0)
	        return 1;

	    return 0;
	}
	
	public static void main(String []args) {
		String s = "dad";
		
		System.out.println(isAnagramOfPalindrome(s));
		
		
	}
}
