package np.aud5.zad2;

public class PriorityQueueTest {
    public static void main(String[] args) {
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.add("middle1", 49);
        priorityQueue.add("middle2", 59);
        priorityQueue.add("middle3", 109);
        priorityQueue.add("middle4", 99);
        priorityQueue.add("middle5", 89);

        String element;
        while ((element = priorityQueue.remove()) != null)
            System.out.println(element);
    }
}
