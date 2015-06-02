package leetcode.solution;

/**
 * Created by guo7711 on 6/2/2015.
 */
public class InsertionSortList {

    public ListNode insertionSortList(ListNode head) {

        if(head==null||head.next==null) return head;

        ListNode fakehead = new ListNode(0);
        ListNode cur = head;

        while (cur!=null)
        {
            ListNode next = cur.next;
            ListNode pre = fakehead;

            while(pre.next!=null&&pre.next.val<cur.val)
                pre = pre.next;

            cur.next = pre.next;
            pre.next = cur;
            cur = next;
        }

        return fakehead.next;

    }

}
