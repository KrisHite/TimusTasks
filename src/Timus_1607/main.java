package Timus_1607;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nums = in.nextLine();
        String[] arrNums = nums.split("\\D+");
        int a = Integer.parseInt(arrNums[0]);
        int b = Integer.parseInt(arrNums[1]);
        int c = Integer.parseInt(arrNums[2]);
        int d = Integer.parseInt(arrNums[3]);
        int result = 0;
        if(a > c){
            System.out.println(a);
        }else{
            while (a <= c) {
                if(a + b <= c){
                    a += b;
                    result = a;
                }else {
                    result = c;
                    break;
                }
                if(c - d >= a){
                    c -= d;
                    result = c;
                }else {
                    result = a;
                    break;
                }
            }
            System.out.println(result);
        }
    }
}
