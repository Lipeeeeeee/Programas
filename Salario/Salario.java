import java.util.Scanner;

public class Salario{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int hours = in.nextInt();
        double money = in.nextDouble();
        System.out.printf("NUMBER = " + number + "\nSALARY = U$ %.2f\n", hours * money);
    }
}