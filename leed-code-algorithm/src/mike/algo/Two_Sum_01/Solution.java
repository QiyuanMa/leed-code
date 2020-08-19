package mike.algo.Two_Sum_01;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] nums, int target){
        /*
//        暴力法，时间O（n2），空间O(1)
        int[] list = new int[2];
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target){
                    list[0] = i;
                    list[1] = j;
                    return list;
                }
            }
        }
        return null;
         */
//        两遍hash表，hash表中 key为值，value为索引，因为get key后能判断索引是否重复。
        /*
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if(map.containsKey(complement) && map.get(complement) != i){
                return new int[] {i, map.get(complement)};
            }
        }
    throw new IllegalArgumentException("No two sum solution");
    }
         */
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            map.put(nums[i], i);
            if(map.containsKey(complement) && map.get(complement) != i) {
                return new int[] {map.get(complement), i};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
        }
}

