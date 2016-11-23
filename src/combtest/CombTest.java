/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package combtest;

/**
 *
 * @author chhit5249
 */
public class CombTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] nums = new int[]{5, 1, 2, 54, 7, 2, 6, 8, 151, 42, 4, 12, 89};
        System.out.println("Original Array:");
        for (int a = 0; a < nums.length; a++) {
            System.out.print(nums[a] + " ");
        }
        System.out.println("\n--------------------------------\nSorted Array:");
        sort(nums, nums.length);
        for (int a = 0; a < nums.length; a++) {
            System.out.print(nums[a] + " ");
        }
    }

    public static void sort(int x[], int gap) {
        boolean swap = true;
        int n = x.length;
        gap = (gap * 10) / 13;

        swap = false;

        for (int i = 0; i < n - gap; i++) {
            if (x[i] > x[i + gap]) {
                int ph = x[i];
                x[i] = x[i + gap];
                x[i + gap] = ph;
                sort(x, gap);
                swap = true;
            }
        }
    }
}
