package SlidingWindow;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

class Meeting{
    int start;
    int end;

    public Meeting(int start , int end){
        this.start = start ;
        this.end = end;
    }
}

public class MeetingRoom {

    public static int findMeeting(List<Meeting> meetings){
        if(meetings == null || meetings.size() == 0){
            return 0;
        }
        int minRoom = 0;
        Collections.sort(meetings , (a,b)-> Integer.compare(a.start,b.start));
        //It will contain all the overlapping meetings.
        PriorityQueue<Meeting> minheap = new PriorityQueue<>(meetings.size() ,(a,b) -> Integer.compare(a.end , b.end));

        for(Meeting meet : meetings){
            //Removing the meetings which is ended
            while (!minheap.isEmpty() && minheap.peek().end <= meet.start){
                minheap.poll();
            }
            minheap.offer(meet);
            minRoom = Math.max(minRoom , minheap.size());
        }
        return minRoom;
    }









    public static void main(String[] args) {
        List<Meeting> input = new ArrayList<>(){
            {
                add(new Meeting(4,5));
                add(new Meeting(2,3));
                add(new Meeting(2,4));
                add(new Meeting(3,5));

            }
        };
        int result = findMeeting(input);
        System.out.println(result);

    }
}
