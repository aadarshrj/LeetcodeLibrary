package Heap;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

public class MergeKArrays {
    private class ArrayEntry{
        public Integer val;
        public Integer arrayid;

        public ArrayEntry(Integer val ,Integer arrayid){
            this.val = val;
            this.arrayid = arrayid;
        }
    }
    public List<Integer> merge(List<List<Integer>> lists){
        PriorityQueue<ArrayEntry> pq = new PriorityQueue<>((a , b)-> a.val - b.val);

        List<Iterator<Integer>> iters = new ArrayList<>(lists.size());

        for (List list : lists){
            iters.add(list.iterator());
        }
        for (int i = 0; i < iters.size() ; i++) {
            if(iters.get(i).hasNext()){
                pq.offer(new ArrayEntry(iters.get(i).next() , i));
            }
        }
        List<Integer> res = new ArrayList<>();
        while (!pq.isEmpty()){
            ArrayEntry out = pq.poll();

            res.add(out.val);

            if (iters.get(out.arrayid).hasNext()){
                pq.offer(new ArrayEntry(iters.get(out.arrayid).next() ,out.arrayid));
            }
        }
        return res;
    }

}
