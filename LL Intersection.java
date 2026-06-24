public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode i = headB;
        while(i != null) {
            ListNode j = headA;
            while(j != null) {
                if(j == i) {
                    return j;
                }
                j = j.next;
            }
            i = i.next;
        }
        return null;
    }
}
