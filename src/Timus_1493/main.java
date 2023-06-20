package Timus_1493;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ticket = in.nextInt();

        String[] nextTicket = String.format("%06d", ticket + 1).split("");
        int[] nextIntTicket = new int[nextTicket.length];
        for(int i = 0; i < nextTicket.length; i++){
            nextIntTicket[i] = Integer.parseInt(nextTicket[i]);
        }
        String[] prevTicket = String.format("%06d", ticket - 1).split("");
        int[] prevIntTicket = new int[prevTicket.length];
        for(int i = 0; i < prevTicket.length; i++){
            prevIntTicket[i] = Integer.parseInt(prevTicket[i]);
        }

        if(nextIntTicket[0] + nextIntTicket[1] + nextIntTicket[2] == nextIntTicket[3] + nextIntTicket[4] + nextIntTicket[5]||
        prevIntTicket[0] + prevIntTicket[1] + prevIntTicket[2] == prevIntTicket[3] + prevIntTicket[4] + prevIntTicket[5]){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
