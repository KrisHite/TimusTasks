package Timus_1585;


import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numOfPenguins = in.nextInt();
        String[] arrOfPenguins = new String[numOfPenguins];
        in.nextLine();
        for(int i = 0; i < numOfPenguins; i++){
            arrOfPenguins[i] = in.nextLine();
        }
        int[] penguins = new int[3];
        for(String penguin : arrOfPenguins){
            if(penguin.equals("Emperor Penguin")){
                penguins[0]++;
            }
            if(penguin.equals("Macaroni Penguin")){
                penguins[1]++;
            }
            if(penguin.equals("Little Penguin")){
                penguins[2]++;
            }
        }
        if(penguins[0] > penguins[1]&&penguins[0] > penguins[2]){
            System.out.println("Emperor Penguin");
        }
        if(penguins[1] > penguins[0]&&penguins[1] > penguins[2]){
            System.out.println("Macaroni Penguin");
        }
        if(penguins[2] > penguins[0]&&penguins[2] > penguins[1]){
            System.out.println("Little Penguin");
        }
    }
}
//        Emperor Penguin
//        Macaroni Penguin
//        Little Penguin
//        Emperor Penguin
//        Macaroni Penguin
//        Macaroni Penguin
//        Little Penguin