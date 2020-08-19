package mike.algo.Palindromic_Substrings_647;

public class Solution {
//    没考虑到 aba的情况，回文字符串
    public int countSubstrings(String s) {
        int num = 1; // 统计当前字符重复次数
        int count = 0;
        char[] charArray= s.toCharArray();
        for (int i = 0; i < charArray.length-1; i++) {
            if (charArray[i] == charArray[i+1]){
                num++;
            }
            else{
                count += sumRecursion(num);
                num = 1;
            }
        }
        return count;
    }
    private int sumRecursion(int num) {
       if(num != 1) {
            num += sumRecursion(num - 1);
        }
       return num;
    }
}
