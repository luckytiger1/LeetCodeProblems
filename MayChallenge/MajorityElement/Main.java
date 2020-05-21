package MajorityElement;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {2,2,1,1,1,2,2};
        int res = s.majorityElement(nums);
        System.out.println(res);
    }
}
