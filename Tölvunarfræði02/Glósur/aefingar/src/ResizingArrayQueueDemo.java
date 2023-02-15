public class ResizingArrayQueueDemo {
    public static void main(String[] args) {
        ResizingArrayQueue<Integer> queue = new ResizingArrayQueue<Integer>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.size());
        System.out.println(queue.isEmpty());
    }
}
