package ProducerConsumer;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockQueue {
    final static Random rand = new Random();
    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);

        final Runnable producer = () -> {
            while (true){
                try {
                    int i = rand.nextInt(100);
                    queue.put(i);
                    System.out.println("Item added ::"+i);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
       new Thread(producer).start();
       new Thread(producer).start();

       final Runnable consumer = () -> {
           while (!queue.isEmpty() && true){
               int i = queue.poll();
               System.out.println("Item removed ::"+i);
           }
       };
        new Thread(consumer).start();
        new Thread(consumer).start();
    }
}
