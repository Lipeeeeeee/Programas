import java.util.Scanner;

public class DistanciaEntreDoisPontos{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String p1 = in.nextLine();
        String[] x1y1 = p1.split(" ");
        String p2 = in.nextLine();
        String[] x2y2 = p2.split(" ");
        System.out.printf("%.4f\n", Math.sqrt(Math.pow(Double.parseDouble(x2y2[0]) - Double.parseDouble(x1y1[0]), 2) + Math.pow(Double.parseDouble(x2y2[1]) - Double.parseDouble(x1y1[1]), 2)));
    }
}