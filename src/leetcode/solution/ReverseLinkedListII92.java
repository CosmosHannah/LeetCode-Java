package leetcode.solution;

/**
 * Created by guo7711 on 4/13/2015.
 */
public class ReverseLinkedListII92 {

    public ListNode reverseBetween(ListNode head, int m, int n) {

        ListNode newhead = new ListNode(-1);
        newhead.next = head;

        if(head==null||head.next==null) return head;

        ListNode pre=null, next=null, startPoint=newhead;

        for(int i=0;i<n;i++)
        {
           if(i<m-1)
                startPoint = startPoint.next;
           else if(i==m-1)
            {
                pre = startPoint.next;
                next = pre.next;
            }
            else {
               pre.next = next.next;
               next.next = startPoint.next;
               startPoint.next = next;
               next = pre.next;
           }
        }

        return newhead.next;

    }
}
