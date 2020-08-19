package mike.algo.Two_Sum_01;

import java.util.Arrays;
import java.util.Scanner;

public class twoSum {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] list = new int[100];
        Scanner scanner = new Scanner(System.in);
        System.out.println("input the list length: ");
        int n = scanner.nextInt();
        System.out.println("input the list elements, split by space:");
        for (int i = 0; i < n; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.println("input the target number: ");
        int target = scanner.nextInt();
        System.out.println("The result is" + Arrays.toString(solution.twoSum(list, target)));



    }
}
