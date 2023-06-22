package Timus_1409;

import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int n = a + b - 1;
        int h = n - a;
        int l = n - b;
        System.out.println(h + " " + l);
    }
}