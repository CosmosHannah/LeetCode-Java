package leetcode.solution;

/**
 * Created by guo7711 on 6/3/2015.
 */
public class RemoveLinkedListElements {

    public static ListNode removeElements(ListNode head, int val) {

        if(head==null) return head;

        ListNode fakehead = new ListNode(-1);
        fakehead.next = head;
        ListNode pre = fakehead;

        while(pre!=null)
        {
            if(pre.next!=null&&pre.next.val == val)
            {
                pre.next = pre.next.next;
            }
            else
            {
                pre = pre.next;
            }
        }

        return fakehead.next;


    }
}
