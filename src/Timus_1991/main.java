package Timus_1991;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        in.nextLine();
        String[] a = in.nextLine().split(" ");
        int droids = 0;
        int bumBum = 0;
        for(int i = 0; i < n; i++){
            if(k > Integer.valueOf(a[i])){
                droids += k - Integer.valueOf(a[i]);
            }else {
                bumBum += Integer.valueOf(a[i]) - k;
            }
        }
        System.out.println(bumBum + " " + droids);
    }
}
