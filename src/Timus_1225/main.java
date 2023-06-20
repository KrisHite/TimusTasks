package Timus_1225;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numsOfFlag = in.nextInt();
        long[] fib = new long[46];
        fib[0] = 0;
        fib[1] = 2;
        fib[2] = 2;
        fib[3] = 4;
        for (int i = 4; i < 46; i++)
        {
            fib[i] = fib[i-1] + fib[i-2];
        }
        System.out.println(fib[numsOfFlag]);
    }
}
