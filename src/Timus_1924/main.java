package Timus_1924;

import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int result = 1;
        boolean black = true;
        for(int i = 2; i <= n; i++){
            if(black == true){
                result += i;
                black = false;
            }else {
                result -=i;
                black = true;
            }
        }
        if(result % 2 == 0){
            System.out.println("black");
        }else {
            System.out.println("grimy");
        }
    }
}
