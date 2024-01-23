import java.util.Scanner;

public class Esfera{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double r = in.nextDouble();
        System.out.printf("VOLUME = %.3f\n", 4.0 / 3 * 3.14159 * Math.pow(r, 3));
    }
}