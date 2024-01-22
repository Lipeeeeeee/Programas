import java.util.Scanner;

public class Diferenca{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        System.out.println("DIFERENCA = " + (a * b - c * d));
    }
}