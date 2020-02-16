package subsetsII;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllUnqiueSubsetsWithDuplicateInputFunction {
	// Contain duplicate subsets
	// Need to be sorted, unless it does not include duplicate
	public List<List<Integer>> subsetsWithDup(int[] nums) {
		// Contain total of all subset
		List<List<Integer>> powerSet = new ArrayList<>();

		// Need to be sorted since contain duplicates input
		Arrays.sort(nums);

		// Backtracking with 0 as starting point, pass in empty arraylist
		backtrack(powerSet, new ArrayList<>(), nums, 0);

		return powerSet;
	}

	private void backtrack(List<List<Integer>> powerSet, List<Integer> tempList, int[] nums, int start) {
		// We are using new ArrayList cause we don't want it to reference to it
		powerSet.add(new ArrayList<>(tempList));

		// We try to get all the set from start and then move on to the next
		// element
		for (int i = start; i < nums.length; i++) {
			// Skip duplicates
			// If i > start, that means it is going to have the same length as
			// the previous set and then we check if they are the same
			// we will not skip if i == start
			if (i > start && nums[i] == nums[i - 1]) {
				continue;
			}
			// Update the tempList
			tempList.add(nums[i]);

			// So we go down the list until we reach i = nums.length which will
			// stop the loop
			backtrack(powerSet, tempList, nums, i + 1);

			// Remove the last element of the tempList
			tempList.remove(tempList.size() - 1);
		}

	}
}
