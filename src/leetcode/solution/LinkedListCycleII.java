package leetcode.solution;

/**
 * Created by guo7711 on 4/14/2015.
 */
public class LinkedListCycleII {

    public ListNode detectCycle(ListNode head) {

        if(head==null||head.next==null) return null;

        ListNode faster = head;
        ListNode slower = head;
        ListNode meet = null;

        while(faster!=null&&faster.next!=null)
        {
            faster = faster.next;
            faster = faster.next;
            slower = slower.next;

            if(faster==slower) {
                meet = faster;
                break;
            }
        }

        if(meet==null) return null;

        while (head!=null)
        {
            if(head==meet) return head;
            head = head.next;
            meet = meet.next;
        }

        return null;
    }
}
