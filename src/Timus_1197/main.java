package Timus_1197;

import java.util.Scanner;
import  java.io.PrintWriter;
public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int test = in.nextInt();
        int x;
        int y;
        int vict = 0;
        char x1, y1;
        for(int q = 0; q < test; q++){
            String pos = in.next();
            x1 = pos.charAt(0);
            y1 = pos.charAt(1);
            x = (int)x1 - 96;
            y = (int)y1 - 48;
            for(int i = -2; i <= 2; i++){
                for(int j = -2; j <= 2; j++){
                    if(j != i){
                        if(x - i > 0 && y - j > 0 && x - i < 9 && y - j < 9){
                            if(i * i + j * j == 5){
                                vict++;
                            }
                        }
                    }
                }
            }
            out.println(vict);
            vict = 0;

        }
        out.flush();
    }
}
