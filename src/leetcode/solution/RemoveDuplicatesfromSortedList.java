package leetcode.solution;

/**
 * Created by guo7711 on 4/14/2015.
 */
public class RemoveDuplicatesfromSortedList {

    public ListNode deleteDuplicates(ListNode head) {

        if(head==null||head.next==null) return head;
        ListNode ptr1=head, ptr2=head.next;
        while(ptr1.next!=null)
        {
            if(ptr1.val==ptr2.val) {
                ptr2 = ptr2.next;
                if(ptr2==null)
                {
                    ptr1.next = null;
                    break;
                }
            }
            else {
                ptr1.next = ptr2;
                ptr1 = ptr1.next;
                ptr2 = ptr2.next;
            }
        }

        return head;

    }
}
