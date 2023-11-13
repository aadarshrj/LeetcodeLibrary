package Recursion;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class TowerOfHanoi {
    public static final int NUM_PEGS = 3;
    public static void main(String[] args) {
        List<Deque<Integer>> pegs = new ArrayList<>();

        for (int i = 0; i < NUM_PEGS ; i++) {
                pegs.add(new LinkedList<>());
        }

        for (int i = 500; i >= 1 ; i--) {
            pegs.get(0).addFirst(i);
        }
            computeHanoi(500,pegs,0,1,2);
    }
    /*
            This method is for recursion
     */
    private static void computeHanoi(int numberRings ,List<Deque<Integer>> pegs,int frompeg ,int topeg , int usepeg){
        if(numberRings > 0){
            computeHanoi(numberRings -1,pegs , frompeg ,usepeg ,topeg);
            int ele = pegs.get(frompeg).peekFirst();
            pegs.get(topeg).addFirst(pegs.get(frompeg).removeFirst());
            System.out.println("The ring no. "+ele+"  Move from peg"+frompeg+" to the peg"+topeg);
            computeHanoi(numberRings-1,pegs,usepeg,topeg,frompeg);
        }
    }
    private static void printHanoi(int numberRings ,List<Deque<Integer>> pegs,int frompeg ,int topeg , int usepeg){
        for (int i = 1; i <= numberRings ; i++) {

        }
    }
}
