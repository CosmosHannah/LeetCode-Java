package leetcode.solution;

/**
 * Created by guo7711 on 4/17/2015.
 */
public class SwapNodesinPairs {

    //Not Accepted yet!

    public ListNode swapPairs(ListNode head) {

        if(head==null) return null;
        if(head.next==null) return head;

        ListNode prev = new ListNode(-1);
        prev.next = head;
        ListNode current = head;
        ListNode nextStart = head.next.next;
        while(current!=null&&current.next!=null)
        {
            prev.next = current.next;
            prev.next.next = current;
            current = nextStart;

            if(nextStart!=null&&nextStart.next!=null)
            nextStart = nextStart.next.next;
        }


        return head;

    }
}
