package leetcode90;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] nums = {1,2,2,3};
		
		System.out.println("Input: " + Arrays.toString(nums)); 
		
		FindAllUnqiueSubsetsWithDuplicateInputFunction solution = new FindAllUnqiueSubsetsWithDuplicateInputFunction();
		
		System.out.println("Powerset without duplicate set: " +solution.subsetsWithDup(nums));
	}
}
