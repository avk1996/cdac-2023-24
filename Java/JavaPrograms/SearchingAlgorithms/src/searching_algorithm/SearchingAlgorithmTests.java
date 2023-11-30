package searching_algorithm;

import java.util.Scanner;

public class SearchingAlgorithmTests {
	// Linear searching
	public static int linearSearch(int[] arrayNumber, int key) {
		System.out.println("In linear search...");
		for (int i = 0; i < arrayNumber.length; i++) {
			if (key == arrayNumber[i]) {
				return i;
			}
		}
		return -1;
	}

	public static int binarySearch(int[] arrayNumber, int key) {
		int l = 0;
		int r = arrayNumber.length - 1;
		int m = 0;
		while (r >= l) {
			System.out.println("In binary search...");
			m = (l + r) / 2;
			if (key == arrayNumber[m]) {
				return m;
			} else if (key > arrayNumber[m]) {
				l = m + 1;
			} else {
				r = m - 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in);) {
			int[] numbers = { 11, 22, 33, 44, 55, 66, 77, 88, 99 };
			System.out.println("Enter a number to search: ");
			int key = sc.nextInt();
			int indexLS = linearSearch(numbers, key);
			int indexBS = binarySearch(numbers, key);
			if (indexLS == -1 || indexBS == -1) {
				System.out.println("KEY NOT FOUND");
			} else {
				System.out.println(key + " at index: " + indexLS);
				System.out.println(key + " at index: " + indexBS);
			}
		} catch (Exception e) {
			System.out.println("In main exception...");
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}