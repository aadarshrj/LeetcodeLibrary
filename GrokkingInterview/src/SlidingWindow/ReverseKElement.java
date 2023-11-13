package SlidingWindow;

import java.util.List;

class ListNode{
    int val;
    ListNode next;

    public ListNode(int val ,ListNode next){
        this.val = val;
        this.next = next;
    }
}

public class ReverseKElement {
    public static void main(String[] args) {

    }
    public static ListNode reverseK(ListNode head , int k){
        ListNode curr = head;
        ListNode next = null;
        ListNode prev = null;

        while (true){
           ListNode previousPartEnd = prev;
           ListNode lastEleofcurrent = curr;
            for (int i = 0; curr != null && i < k; i++) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            if (previousPartEnd != null){
                previousPartEnd.next = prev;
            }else {
                head = prev;
            }
            lastEleofcurrent.next = curr;

            if (curr == null){
                break;
            }
            prev = lastEleofcurrent;
        }
        return head;
    }
}
