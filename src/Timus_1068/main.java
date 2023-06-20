package Timus_1068;

import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        int num = 0;
        Scanner in = new Scanner(System.in);
        int inputNum = in.nextInt();
        if(inputNum > 0){
            for(int i = 1; i <= inputNum; i++){
                num += i;
            }
        }else {
            for(int i = 1; i >= inputNum; i--){
                num += i;
            }
        }
        System.out.println(num);
    }
}
