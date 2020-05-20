package ReverseLinkedList;

public class Main {
    public static void main(String[] args) {
        ListNode a = new ListNode(2);
        ListNode b = new ListNode(4);
        ListNode c = new ListNode(6);
        a.next = b;
        b.next = c;
        Solution s = new Solution();
        ListNode result = s.reverseList(a);
        System.out.println(result);
    }
}
