public class DoubleTesting {
    public static double timeTrial(int N) {
        long sum = 0;
        for (long i = 1; i <= N; i = 2 * i) {
            for (long j = 1; j <= 2 * i; j++) {
                sum++;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int N = 250;
        double prevTime = timeTrial(N);
        while (true) {
            N *= 2;
            double time = timeTrial(N);
            double ratio = time / prevTime;
            System.out.printf("N = %d, time = %.2f, ratio = %.2f\n", N, time, ratio);
            prevTime = time;
        }
    }
}
