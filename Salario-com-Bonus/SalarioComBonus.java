import java.util.Scanner;

public class SalarioComBonus{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String nome = in.nextLine();
        double salario = in.nextDouble();
        double vendas = in.nextDouble();
        System.out.printf("TOTAL = R$ %.2f\n", salario + vendas * 0.15);
    }
}