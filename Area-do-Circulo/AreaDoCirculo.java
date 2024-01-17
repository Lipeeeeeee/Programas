import java.util.Scanner;

public class AreaDoCirculo{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double raio = in.nextDouble();
        System.out.printf("A=%.4f", (3.14159 * raio * raio));
        System.out.println();
    }
}