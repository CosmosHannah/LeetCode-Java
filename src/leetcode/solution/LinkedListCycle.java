package leetcode.solution;

/**
 * Created by guo7711 on 4/14/2015.
 */
public class LinkedListCycle {

    public boolean hasCycle(ListNode head) {

        if(head==null||head.next==null) return false;

        ListNode faster = head;
        ListNode slower = head;

        while(faster!=null&&faster.next!=null)
        {
            faster = faster.next;
            faster = faster.next;
            slower = slower.next;
            if(faster==slower) return true;

        }

        return false;

    }
}
