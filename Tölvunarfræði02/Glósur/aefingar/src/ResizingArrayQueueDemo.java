public class test {
    public static void main(String[] args) {
        QueueOfStrings q = new QueueOfStrings;
                while (!StdIn.isEmpty()) {
                    String s = StdIn.readString;
                    if (s.equals("-")) StdOut.print(q.dequeue());
                    else q.enqueue(s);
                }

    }
}

