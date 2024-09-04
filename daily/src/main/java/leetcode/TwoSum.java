package src.main.java;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
	public int[] twoSum(int[] nums, int target) {
		/*
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					return new int[] { i, j };
				}
			}
		}
		*/
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i=0; i<nums.length; i++) {
			map.put(nums[i], i);
		}
		
		for(int i=0; i<nums.length; i++) {
			Integer pre = map.get(target - nums[i]);
			if(pre != null && pre != i) {
				return new int[] {i, pre};
			}
		}
		
		return new int[] {};
	}

	public static void main(String[] args) {
		int[] nums = { 1, 4, 7, 8 };
		int target = 11;

		TwoSum t = new TwoSum();
		System.out.println(Arrays.toString(t.twoSum(nums, target)));
	}
}
