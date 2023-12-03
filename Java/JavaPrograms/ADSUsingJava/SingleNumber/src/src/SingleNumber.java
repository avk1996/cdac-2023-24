package src;

import java.util.Arrays;
import java.util.Scanner;

public class SingleNumber {
	public static int singleNumber(int[] nums) {
		Arrays.sort(nums);
		int j = 0;
		int i = 0;
		int n = nums.length;
		while (i < n - 1) {
			j = i + 1;
			if (nums[i] == nums[j]) {
				nums[i] = 0;
				nums[j] = 0;
			}
			i++;
		}
//		System.out.println("Array: " + Arrays.toString(nums));
		for (i = 0; i < n; i++) {
			if (nums[i] != 0)
				return nums[i];
		}
		return 0;
	}

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter array length: ");
			int n = sc.nextInt();
			int[] nums = new int[n];
			for (int i = 0; i < n; i++) {
				System.out.println("Enter element: " + (i + 1) + " : ");
				nums[i] = sc.nextInt();
			}
			int x = singleNumber(nums);
			System.out.println("Single number is : "+x);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}