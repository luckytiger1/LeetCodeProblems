public class Solution  {
    public int firstBadVersion(int N) {
        int l = 0, r = N;

        while(l < r) {
            int mid = l + (r - l)/2;

            if(isBadVersion(mid)) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    private boolean isBadVersion(int n) {
        return true;
    }
}