package Timus_1243;

import java.math.BigInteger;
import java.util.Scanner;
public class main {    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    BigInteger num = new BigInteger(str);
    BigInteger numTwo = new BigInteger("7");
    BigInteger result =  num.remainder(numTwo);
    System.out.println(result);
}
}
