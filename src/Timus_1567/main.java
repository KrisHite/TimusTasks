package Timus_1567;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        char[] symbols = text.toCharArray();
        char[] but1 = new char[]{'a', 'd', 'g', 'j', 'm', 'p', 's', 'v', 'y', '.', ' '};// 1
        char[] but2 = new char[]{'b', 'e', 'h', 'k', 'n', 'q', 't', 'w', 'z', ','};// 2
        char[] but3 = new char[]{'c', 'f', 'i', 'l', 'o', 'r', 'u', 'x', '!'};// 3
        int price = 0;
        int i = 0;
        while (i < symbols.length){
            for (int k = 0; k < but1.length; k++){
                if(symbols[i] == but1[k]){
                    price++;
                }
            }
            for (int k = 0; k < but2.length; k++){
                if(symbols[i] == but2[k]){
                    price += 2;
                }
            }
            for (int k = 0; k < but3.length; k++){
                if(symbols[i] == but3[k]){
                    price += 3;
                }
            }
            i++;
        }
        System.out.println(price);
    }
}
