import java.util.Scanner;

public class GastoDeCombustivel{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double tempo = in.nextDouble();
        double kmh = in.nextDouble();
        System.out.printf("%.3f\n", tempo * kmh / 12);
    }
}