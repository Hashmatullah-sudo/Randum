import java.util.Scanner;

public class Faniction2 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Please enter a number");
    }
    public static int input() {
        Scanner sc = new Scanner(System.in);

        return sc.nextInt();      }

    public static int square(int n) {
        return n * n;     }

        public static void Resoult () {
        int a = input() ;
        int resoult = square(a);
        System.out.println(resoult);


    }
}
