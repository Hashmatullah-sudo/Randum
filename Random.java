import java.util.Random;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Random rand = new Random();
        Scanner scn = new Scanner(System.in);
        int gamelavel = 5;
        for(int i = 0; i<=10; i++) {
            int ra = rand.nextInt();
            if (ra < 0) {
                ra = ra * -1;
            }
            ra = ((ra % 100) + 1);
            boolean win = false;
            System.out.println("welcom to our guissing game please select anumber between 1 and 100");
            for (int a = 1; a <= gamelavel; a++) {
                System.out.print("enter a number :");
                int num = scn.nextInt();
                if (num == ra) {
                    System.out.println("you win in this exam");
                    win = true;
                    break;
                } else if (num > ra && num !=gamelavel){
                    System.out.println("you enter smaller than number");}
                 else if (num < ra && num !=gamelavel) {
                    System.out.println("you shuld enter beger number");
                }
            }
            if (!win){
                System.out.println("you lost" +ra);
            break;
            }


        }}}






