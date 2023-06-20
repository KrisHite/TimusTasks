package Timus_1457;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        String[] a = in.nextLine().split(" ");
        double result = 0;
        for(String s : a){
            result += Double.valueOf(s);
        }
        result /= n;
        String res = String.format("%.6f\n", result);
        System.out.println(res);
    }
}
