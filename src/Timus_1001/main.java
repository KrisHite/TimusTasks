package Timus_1001;

import java.io.PrintWriter;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 0;
        PrintWriter out = new PrintWriter(System.out);
        long[] arr = new long[131072];
        while(in.hasNextLong()){
            arr[count] = in.nextLong();
            count++;
        }
        for(int i = count-1; i>=0; i--){
            System.out.printf("%.4f%n", (Math.sqrt(arr[i])));

        }
        out.flush();
    }
}
// 1427  0
//
//         876652098643267843
//         5276538