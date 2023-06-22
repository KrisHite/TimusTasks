package Timus_1083;

import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        String symbols = in.next();
        char[] symbolsChar = symbols.toCharArray();
        int K = symbolsChar.length;
        int factorial = 1;
        do{
            factorial *= N;
            N -= K;
        }while(N >= 2);

        System.out.println(factorial);
    }
}