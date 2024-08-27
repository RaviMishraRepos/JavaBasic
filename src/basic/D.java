package basic;

public class D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { 12, 23, 34, 45, 56, 23 };
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}

		for (int i : nums) {
			System.out.println(i);
		}

		String[] name = new String[5];
		name[0] = "Zaynab";
		name[1] = "Roberto";
		name[2] = "haben";
		name[3] = "Milan";
		name[4] = "Muhi";

		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}

		for (int i = name.length - 1; i >= 0; i--) {
			System.out.println(name[i]);
		}

int[][] number = { { 12, 23, 34, 45 }, { 12, 23, 34, 45 }, { 12, 34, 45, 56 }, { 45, 56, 67, 787 } }; //
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.println(number[i][j]);
			}
		}

	}

}
