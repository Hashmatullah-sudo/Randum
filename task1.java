public class task1 {

public static void main(String[] args) {
    System.out.println(add(1,2));
    System.out.println(add(1.0,2,6));
    System.out.println(add(2.3,3.5));
}
public static double add(double a ,double b){
    return a+b;
}
public static int add(int a ,int b){
   return a+b;

}
public static double add(double a ,int b,int c){
    return a+b+c;
}


}
