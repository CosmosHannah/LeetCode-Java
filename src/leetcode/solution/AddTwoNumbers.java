package leetcode.solution;

/**
 * Created by guo7711 on 5/29/2015.
 */
public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode result = null;

        if(l1==null) return l2;
        if(l2==null) return l1;
        int sum = 0,carry = 0,value = 0;
        ListNode node = null;
        while(l1!=null&&l2!=null)
        {
            sum = l1.val + l2.val + carry;
            carry = sum/10;
            value = sum%10;
            if(result == null)
            {
                node = new ListNode(value);
                result = node;
            }
            else
            {
                node.next = new ListNode(value);
                node = node.next;
            }
            l1 = l1.next;
            l2 = l2.next;

        }
        if(l1==null&&l2==null)
        {
            if(carry!=0)
            {
                node.next = new ListNode(carry);
                node = node.next;
                carry = 0;
                return result;
            }
            else return result;
        }
        else if(l1!=null&&l2==null)
        {
            //l1 has more digits
            while(l1!=null)
            {
                sum = l1.val + carry;
                carry = sum/10;
                value = sum%10;
                node.next = new ListNode(value);
                node = node.next;
                l1 = l1.next;
            }

            if(carry!=0)
            {
                node.next = new ListNode(carry);
                node = node.next;
                carry = 0;
                return result;
            }

            return result;
        }
        else if(l1==null&&l2!=null)
        {
            //l2 has more digits
            while(l2!=null)
            {
                sum = l2.val + carry;
                carry = sum/10;
                value = sum%10;
                node.next = new ListNode(value);
                node = node.next;
                l2 = l2.next;
            }

            if(carry!=0)
            {
                node.next = new ListNode(carry);
                node = node.next;
                carry = 0;
                return result;
            }

            return result;
        }
        return null;






    }
}
