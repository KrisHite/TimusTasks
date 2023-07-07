package Timus_1209;

import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long[] arr = new long[n];
        for(int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        for(int i = 0; i < n; i++) {
            if(Math.sqrt(1 - 4 * -((arr[i] - 1) * 2)) % 1 == 0){
                System.out.print("1 ");
            }else {
                System.out.print("0 ");
            }
        }
    }
}

