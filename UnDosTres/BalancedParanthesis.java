
public class BalancedParanthesis {

	public static void main(String[] args) {
	 int n =2;
     paranthesisBalanced(n);  
	}
	
	
	public static void paranthesisBalanced(int num) {
		if(num<=0)
			return;
		char[] parenArr = new char[2*num];
		printBalancedParen(parenArr,0,0,0,num);
	}
	
	
	public static void printBalancedParen(char[] parenArr,int open,int close,int index,int num) {
		
		/* The Algorithm works as if opening parenthesis is opened then it must be closed,
		 * but only given number of brackets should be opened hence the condition[third] 
		 * is added and for every open bracket we must close it hence another 
		 * condition[second] is added however the different combinations are maintained through
		 * recursive calls..Whenever parenthesis are equal to a given number we have to print them.
		 * 
		 * */
		
		if(close==num) {
			for(int i=0;i<parenArr.length;i++)
				System.out.print(parenArr[i]);
			System.out.print(",");
			return;
		}
		else {
			if(open>close) {
				 parenArr[index] = '}';
				 printBalancedParen(parenArr,open,close+1,index+1,num);
			}
			if(open<num) {
				parenArr[index] = '{';
				printBalancedParen(parenArr,open+1,close,index+1,num);
			}
		}
		
	}

}
