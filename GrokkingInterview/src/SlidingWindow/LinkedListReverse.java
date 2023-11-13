package SlidingWindow;

import java.util.List;

public class LinkedListReverse {
     static class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(2);//s f
        ListNode n2 = new ListNode(3);//s
        ListNode n3 = new ListNode(4);//f  s
        ListNode n4 = new ListNode(5);//s
        ListNode n5 = new ListNode(6);//f
        ListNode n6 = new ListNode(7);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        ListNode head = n1;
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode rhead = reverse(slow);
        while (head != null){
            System.out.println(head.val);
            head = head.next;
        }
     }
     public static ListNode reverse(ListNode head){
         ListNode prev = null;
         while (head != null){
             ListNode next = head.next;
             head.next = prev ;
             prev = head;
             head = next;
         }
        return prev;
     }
}
