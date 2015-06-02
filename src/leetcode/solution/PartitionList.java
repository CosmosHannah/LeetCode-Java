package leetcode.solution;

/**
 * Created by guo7711 on 6/2/2015.
 */
public class PartitionList {

    public ListNode partition(ListNode head, int x) {


        if(head==null||head.next==null) return head;

        ListNode small = new ListNode(-1);
        ListNode newsmall = small;
        ListNode large = new ListNode(-1);
        ListNode newlarge = large;

        while(head!=null)
        {
            if(head.val<x)
            {
                small.next = new ListNode(head.val);
                small = small.next;
            }
            else
            {
                large.next = new ListNode(head.val);
                large = large.next;
            }
            head = head.next;
        }

        large.next = null;

        small.next = newlarge.next;
        return newsmall.next;


    }
}
