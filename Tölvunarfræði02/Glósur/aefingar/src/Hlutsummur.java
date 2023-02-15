import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.Stopwatch;

public class Hlutsummur {
    /*
    * - reiknaHS tekur inn einn vigur af 'A' af lengd 'N' sem inniheldur heiltölur
    * - Skilar tvívíðu fylki 'B' af stærð 'N' *
    * - B[i][j] er summa stakan 'A' frá bilinu i-j
    * - reinar í raun fallið sums af subarray's fyrir 'A' og skilar því  */

    public static int[][] reiknaHS(int[] A) {
        int N = A.length;
        int[][] B = new int[N][N];

        for (int i=0; i<N; i++) {
            for (int j=i; j<N; j++) {
                int hSum = 0;
                for (int k=i; k<=j; k++)
                    hSum += A[k];
                B[i][j] = hSum;
            }
        }

        return B;
    }

    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        int[] A = new int[N];

        // Búa til slembigildi í fylkið
        for (int i=0; i<N; i++)
            A[i] = StdRandom.uniformInt(1000);

        // Taka tímann á útreikningi
        Stopwatch timer = new Stopwatch();
        int[][] B = reiknaHS(A);
        double eTime = timer.elapsedTime();

        StdOut.println("Elapsed time = " + eTime);

        // Einföld stikkprufa til að athuga hvort rétt reiknað ...
        StdOut.println("A[2] + A[3] = " + (A[2] + A[3]));
        StdOut.println("B[2][3] = " + B[2][3]);
    }
}

