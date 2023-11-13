package SlidingWindow;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

class Job{
    int start;
    int end ;
    int load;

    public Job(int start , int end , int load){
        this.start = start;
        this.end = end;
        this.load = load;
    }
}
public class MaximumCPU {
    public static void main(String[] args) {
        List<Job> input = new ArrayList<>(){{
            add(new Job(1,4,3));
            add(new Job(2,5,4));
            add(new Job(7,9,6));
        }};
        System.out.println("Maximum load on the cpu is : "+findMaxLoad(input));
        List<Job> input2 = new ArrayList<>(){{
            add(new Job(6,7,10));
            add(new Job(2,4,11));
            add(new Job(8,12,15));
        }};
        System.out.println("Maximum load on the cpu is : "+findMaxLoad(input2));
        List<Job> input3 = new ArrayList<>(){{
            add(new Job(1,4,2));
            add(new Job(2,4,1));
            add(new Job(3,6,5));
        }};
        System.out.println("Maximum load on the cpu is : "+findMaxLoad(input3));
    }

    public static int findMaxLoad(List<Job> input){
        Collections.sort(input,(a,b) -> Integer.compare(a.start , b.start));
        PriorityQueue<Job> heap = new PriorityQueue<>(input.size(),(a,b) -> Integer.compare(a.end, b.end));
        int maxCpu = 0;
        int currCpu = 0 ;

        for(Job job : input){
            while (!heap.isEmpty() && heap.peek().end < job.start){
                currCpu -= heap.poll().load;
            }
            heap.offer(job);
            currCpu += job.load;
            maxCpu = Math.max(maxCpu , currCpu);
        }
        return maxCpu;
    }
}
