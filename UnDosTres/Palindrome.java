
public class Palindrome {

	public static void main(String[] args) {
		String input = "BBABCBCAB";
		System.out.println(LongestPalindrome(input));

	}
	
	public static int LongestPalindrome(String input) {
		
		/* The Algorithm checks the LCS of string and its reversed String Using DP
		 *  which obviously will be the LPS of given String.
		 * The Algorithm traverses back the matrix to generate first subsequence 
		 * in case there are two LPSs
		 * */
		//input = input.toUpperCase();  // uncomment this line to make it case insensitive
		
		input=input.replaceAll("[,:;'\"/?~!@#$%^&*()_+=|\\{}<>`[@].]", ""); //remove punctuation
		
		if (input == null || input.equals(""))
			return 0;
		
		String reverseInput = new StringBuffer(input).reverse().toString();
		if(input.equals(reverseInput)) {
			System.out.println(input);
		    return input.length();
		}
		
		
		int len = input.length();
		int temp[][] = new int[len+1][len+1]; //tabulation
		
		//set the first row and columns to zer0
		for(int i=0;i<=len;i++) {
			temp[i][0]=0;
			temp[0][i]=0;
		}
		
		for(int i=1; i<=len; i++) {
			for(int j=1; j<=len; j++ ) {
				if(input.charAt(i-1)==reverseInput.charAt(j-1))
					temp[i][j] = temp[i-1][j-1] + 1;
				else
					temp[i][j] = Math.max(temp[i-1][j], temp[i][j-1]);
			}
		}
		
		int index = temp[len][len];
		char result[] = new char[index]; //result array which holds the resulting subsequence
		
		int i=len,j=len;
		while(temp[i][len] == temp[i-2][len]) // traverse to first subsequence in case there are two longest sub-sequences
			i--;
	
		//Generate the subsequence
		while(i>0 && j>0) {
			if(input.charAt(i-1)==reverseInput.charAt(j-1)){
				result[--index] = reverseInput.charAt(j-1);
				i--;
				j--;
			}
			else if(temp[i-1][j]>=temp[i][j-1])
				i--;
			else
				j--;
		}
		
		System.out.println(new String(result));
		
		return temp[len][len];
	}

}
