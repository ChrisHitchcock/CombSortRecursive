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
        //Array Declaration
        int[] nums = new int[]{151, 54, 89, 42, 12, 8, 7, 6, 5, 4, 2, 2, 1};
        
        //Output
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
        //Setting variables; n is the length of the array and gap 
        int n = x.length;
        gap = (gap * 10) / 13;

        //Loop
        for (int i = 0; i < n - gap; i++) {
            //Sorting - shows each step 
            if (x[i] > x[i + gap]) {
                int ph = x[i];
                x[i] = x[i + gap];
                x[i + gap] = ph;
                for (int a = 0;a<n;a++)
                {
                    System.out.print(x[a]+", ");
                }
                System.out.println("");
                sort(x, gap);
            }
        }
    }
}
