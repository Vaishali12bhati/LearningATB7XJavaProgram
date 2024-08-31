package August.ex_18082024.CollectionFramework.arrayandcollectionframework.queue;
//not much used in autoation
import java.util.PriorityQueue;

public class Lab282 {
    public static void main(String[] args) {
        //queue>>>we used priority queue
        //first in first out FIFO
        // doesnr allow nulll value
        PriorityQueue pq = new PriorityQueue<>();
        pq.add(200);
        pq.offer(100);//same as the add
        pq.offer(48);
        pq.offer(98);
        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq.poll());


    }

}
