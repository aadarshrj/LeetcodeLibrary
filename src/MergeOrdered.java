public class MergeOrdered {
    public static class LinkNode {
        public int val;
        public LinkNode next;

        public LinkNode(){};
        public LinkNode(int val){
            this.val = val;
        }
        public LinkNode(int val , LinkNode next){
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        LinkNode h1 = new LinkNode(7);
        LinkNode c1 = new LinkNode(3);
        LinkNode c2 = new LinkNode(5);
        LinkNode h2 = new LinkNode(2);
        LinkNode c3 = new LinkNode(9);
        LinkNode c4 = new LinkNode(6);
        h1.next = c1;
        c1.next = c2;
        h2.next = c3;
        c3.next = c4;
        mergeList(h1,h2);
    }
    public static void mergeList(LinkNode h1 , LinkNode h2){
        LinkNode p1 = h1;
        LinkNode p2 = h2;
        LinkNode dummy = new LinkNode(-1);
        LinkNode p = dummy;
        while (p1 != null && p2 != null){
            if (p1.val > p2.val){
                p.next = p2;
                p2 = p2.next;
            }else {
                p.next = p1;
                p1 = p1.next;
            }
            p = p.next;
        }
        if(p2 != null){
            p.next = p2;
        }
        if (p1 != null){
            p1.next = p1;
        }
        LinkNode temp = dummy.next;
       while (temp != null) {
           System.out.print(temp.val+" ");
            temp = temp.next;
       }
    }
}
