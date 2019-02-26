import java.util.*;
public class test_task1 {
    public static void main(String[] args)
    {
        int[] nums = {8, 10, 15, 13, 21};
        int ctr_even = 0, ctr_odd = 0;
        System.out.println("Original Array: "+Arrays.toString(nums));

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] % 2 == 0)
            {
                ctr_even++;
            }
            else
                ctr_odd++;
        }
        System.out.printf("\nNumber of even elements in the array: %d",ctr_even);
        System.out.printf("\nNumber of odd elements in the array: %d",ctr_odd);
        System.out.printf("\n");
    }
}