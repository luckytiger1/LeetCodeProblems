package NumberComplement;

/*
476. Number Complement https://leetcode.com/problems/number-complement/

Given a positive integer num, output its complement number.
The complement strategy is to flip the bits of its binary representation.

Input: num = 5
Output: 2
Explanation: The binary representation of 5 is 101 (no leading zero bits),
 and its complement is 010. So you need to output 2.
 */

public class Solution {
    public int findComplement(int num) {
        int impBits = 0;
        int temp = num;
        while(temp != 0) {
            // Right shift by 1, until num reaches 0, to find number of important bits
            temp >>= 1;
            impBits++;
        }
        // Find mask by right shifting and subtracting
        int mask = (1 << impBits) - 1;
        // Bitwise and complement of num with mask to get rid of leading zeros
        return ~num & mask;
    }
}
