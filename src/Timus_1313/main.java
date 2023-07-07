package Timus_1313;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[][] resolution = new int[size][size];
        for(int i = 0; i < size; i++){
            for(int k = 0; k < size; k++){
                resolution[i][k] = in.nextInt();
            }
        }

        for(int i = 0; i < size; i++){//Первая половина экрана
            for(int k = 0; k <= i; k++){
                System.out.print(resolution[i - k][k] + " ");
            }
        }

        for(int k = 1; k < size; k++){//Вторая половина экрана
            for(int i = (size-1); i >= k; i--){
                System.out.printf(resolution[i][((size - 1) - i) + k] + " ");
            }
        }
    }
}
