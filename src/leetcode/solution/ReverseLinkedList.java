package leetcode.solution;

/**
 * Created by guo7711 on 6/3/2015.
 */
public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {

        if(head==null) return null;

        ListNode reversed = null;
        ListNode current = head;
        ListNode next = current.next;

        while(current!=null)
        {
            next = current.next;
            current.next = reversed;
            reversed = current;
            current = next;
        }

        return reversed;

    }

}
