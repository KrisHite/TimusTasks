package Timus_1025;

import java.util.Arrays;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int K = in.nextInt();
        in.nextLine();//Костыль. Так работает Scanner
        String nums = in.nextLine();
        String[] arrNums = nums.split("\\D+");
        if(K > arrNums.length){
            K = arrNums.length;
        }
        int[] numberOfMans = new int[K];
        for(int i = 0; i < numberOfMans.length; i++){
            numberOfMans[i] = Integer.parseInt(arrNums[i]);
        }
        int voices = 0;
        Arrays.sort(numberOfMans);
        for (int i = 0; i < ((numberOfMans.length/2)+ 1); i++){
            voices += ((numberOfMans[i]/2)+1);
        }

        System.out.println(voices);
    }
}
