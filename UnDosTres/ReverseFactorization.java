package prac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ReverseFactorization {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N=0,K=0;
		int[] inputArr=null;
		
		try {
		N= sc.nextInt();
	    K = sc.nextInt();
		inputArr = new int[K];
		for(int i=0;i<K;i++)
			inputArr[i]=sc.nextInt();
		}
		catch(InputMismatchException ime) {
			System.out.println("please enter valid input");
			return;
		}
		catch(Exception e) {
			System.out.println("Error!");
		}
		finally {
		     sc.close();
		}
		
		reverseFact(inputArr,N);

	}
	
	public static void reverseFact(int[] arr,int n) {
		
		/* 
		 * The Algorithm Sorts the input array and then filters the factors of given integer
		 * into another array.
		 * Since the filtered array will be sorted so the algorithm starts dividing 
		 * the number from max to min of array in order to obtain minimum number of 
		 * steps(factors).
		 * The Algorithm also keeps the track of product of all divisors [product] 
		 * to make sure all steps to given integer are found. 
		 * The steps found in above step are then sorted to create steps in lexical order.
		 * Finally the steps are printed
		 * 
		 * p.s : edge cases are included.
		 * */
		
		if(n == 0 || arr.length==0) {
			System.out.println(-1);
			return;
		}
			
		Arrays.sort(arr);
		if(n<0 && arr[0] >0) {
			System.out.println(-1);
			return;
		}
		
		int[] temp1 = new int[arr.length];
		List<Integer> temp2 = new ArrayList<>();
		
		int j=0;
		for(int i=0;i<arr.length;i++) 
			if(n%arr[i]==0)
				temp1[j++]=arr[i];
		
		int num=n,product =1;
		for(int i=j-1;i>=0;i--) {
			if(num%temp1[i]==0 && num != 1) {
				temp2.add(temp1[i]);
				num /= temp1[i];
				product *= temp1[i];
				i++;
				
			}
			
		}
		if(num == -1)
			product *= -1;
		
		Collections.sort(temp2);
		
		int step =1;
		if(temp2.size() != 0 && n == product) {
			System.out.print(step);
			for(int i:temp2) {
				step *= i;
				System.out.print(" "+step);
			}
		}
		else
			System.out.println(-1);
				
	}
	
}
