package Heap;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class MinHeap {
    private int capacity = 5;
    private int size;
    private int heap[] ;

    public MinHeap(){
        heap = new int[capacity];
    }
    public boolean isEmpty(){
        return (this.size == 0);
    }
    public void add(int ele){
        ensureExtraCapacity();

        heap[size] = ele;
        size++;

        shiftup();
    }
    public int remove(){
        if(isEmpty()){
            throw new NoSuchElementException("No elements are there");
        }
        int min = heap[0];
        heap[0] = heap[size - 1];
        size--;

        heapifyDown();
        return min;
    }
    public void heapifyDown(){
        int index = 0;

        while (hasLeftChild(index)){
            int smallerchildIndex = getLeftChildIndex(index);

            if(hasRightChild(index) && getRightChild(index) < getLeftChild(index)){
                smallerchildIndex = getRightChildIndex(index);
            }
            if(heap[index] < heap[smallerchildIndex]){
                break;
            }else{
                swap(index , smallerchildIndex);
            }
            index = smallerchildIndex;
        }

    }
    public void shiftup(){
        int index = size - 1;

        while (hasParent(index) && heap[index] < getParent(index)){
            swap(getParentIndex(index) , index);
            index = getParentIndex(index);
        }
    }
    public void swap(int indexOne , int indexTwo){
        int temp = heap[indexOne];
        heap[indexOne] = heap[indexTwo];
        heap[indexTwo] = temp;
    }
    public void ensureExtraCapacity(){
        if(size == capacity){
            heap = Arrays.copyOf(heap , capacity * 2);
            capacity *= 2;
        }
    }
    public int getLeftChildIndex(int index){
        return 2*index + 1;
    }
    public int getRightChildIndex(int index){
        return 2*index + 2;
    }
    public int getParentIndex(int index){
        return (index - 1)/2;
    }
    public boolean hasLeftChild(int index){
        return getLeftChildIndex(index) < size;
    }
    public boolean hasRightChild(int index){
        return getRightChildIndex(index) < size;
    }
    public boolean hasParent(int index){
        return index != 0 && getParentIndex(index) > 0;
    }
    public int getLeftChild(int index){
        return heap[getLeftChildIndex(index)];
    }
    public int getRightChild(int index){
        return heap[getRightChildIndex(index)];
    }
    public int getParent(int index){
        return heap[getParentIndex(index)];
    }
}
