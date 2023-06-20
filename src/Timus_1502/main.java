package Timus_1502;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long diamonds = 0;
        for(int i = 0; i <= n; i++){
            for(int k = i; k <= n; k++){
                diamonds += k + i;
            }
        }
        System.out.println(diamonds);
    }
}
